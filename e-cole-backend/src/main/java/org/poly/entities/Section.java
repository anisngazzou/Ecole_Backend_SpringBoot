package org.poly.entities;

import java.util.List;

import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

public class Section {

	@OneToMany(mappedBy = "section")
	private List<Groupe> groupes;
	
	@ManyToOne
	private Specialite specialite;
	
	@ManyToOne
	private Niveau niveau;
	
	@OneToMany(mappedBy = "section")
	private List<Matiere> matieres;
}
