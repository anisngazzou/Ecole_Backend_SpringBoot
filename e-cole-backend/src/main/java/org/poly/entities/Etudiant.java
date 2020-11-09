package org.poly.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @Data @AllArgsConstructor @NoArgsConstructor @DiscriminatorValue("Et")
public class Etudiant extends User implements Serializable  {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	private String matricule;
	private String nom ;
	private String prenom ;
	private String dateDeNaissance ;
	private String lieuDeNaissance ;
	private String adresseActuelle ;
	private String AdresseOrigine ;
	private String email ;
	private String sexe ;
	private Long cin; 
	private String photo ;
	private String numTel ; 
	
	@OneToMany(mappedBy = "etudiant")
	private List<AffectaionEtudGroupe> affectations;
	@OneToMany(mappedBy = "etudiant") 
    private List<Note> note; 
	@OneToMany(mappedBy = "etudiant") 
	private List<AbsenceEtudiant> absenceetudiant; 
	
	
}
