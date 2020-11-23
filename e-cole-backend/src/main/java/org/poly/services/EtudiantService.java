package org.poly.services;

import java.util.HashSet;
import java.util.Set;

import org.poly.entities.ERole;
import org.poly.entities.Etudiant;
import org.poly.entities.Role;
import org.poly.repository.EtudiantRepository;
import org.poly.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class EtudiantService {

	@Autowired
	EtudiantRepository etudiantRepository;
	@Autowired
	PasswordEncoder encoder;
	@Autowired
	RoleRepository roleRepository;
	
	public void ajoutEtudiant(Etudiant etudiant) {
		 Set<Role> roles = new HashSet<>();
		String password = etudiant.getPassword();
		etudiant.setPassword(encoder.encode(password));
		Role pmRole = roleRepository.findByName(ERole.ROLE_ETUDIANT);
        roles.add(pmRole);
        etudiant.setRoles(roles);
		etudiantRepository.save(etudiant);		
	}
}
