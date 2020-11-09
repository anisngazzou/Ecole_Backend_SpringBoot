package org.poly.entities;

import java.util.List;

import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

public class Groupe {
	
	
	

	@OneToMany(mappedBy = "groupe")
	private List<AffectaionEtudGroupe> affectationsEtudiants ;
	
	@OneToMany(mappedBy = "groupe")
	private List<AffectationEnseigMatiere> affectationsEnseignants;
	
	@ManyToOne
	private Section section ;
}
