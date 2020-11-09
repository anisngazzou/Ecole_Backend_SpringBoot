package org.poly.entities;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



import java.util.List;

import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity @Data @AllArgsConstructor @NoArgsConstructor
public class Section {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id ;
	private String nomSection ;

	@OneToMany(mappedBy = "section")
	private List<Groupe> groupes;
	
	@ManyToOne
	private Specialite specialite;
	
	@ManyToOne
	private Niveau niveau;
	
	@OneToMany(mappedBy = "section")
	private List<Matiere> matieres;
}
