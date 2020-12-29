package org.poly.controller;

import java.util.List;

import org.poly.entities.Etudiant;
import org.poly.repository.EtudiantRepository;
import org.poly.services.EtudiantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin(origins = "*", maxAge = 3600)

@RestController
public class EtudiantController {
	
	@Autowired
	EtudiantService etudiantService;
	@Autowired
	EtudiantRepository etudiantRepository;
	//@PreAuthorize("hasRole('ADMIN')")
    @RequestMapping(value = "/etudiants",method = RequestMethod.POST)
    public void addEtudiant(@RequestBody Etudiant etudiant){
        etudiantService.ajoutEtudiant(etudiant);

    }
    @RequestMapping(value = "/etudiants",method = RequestMethod.GET)
    public List<Etudiant> getAll(){
    	return etudiantRepository.findAll();
    }

}
