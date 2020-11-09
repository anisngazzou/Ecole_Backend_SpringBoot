package org.poly.entities;

import javax.persistence.ManyToOne;

public class AffectaionEtudGroupe {

	private String anneeUniversitaire;
	@ManyToOne
	private Etudiant etudiant ;
	@ManyToOne
	private Groupe groupe;
}
