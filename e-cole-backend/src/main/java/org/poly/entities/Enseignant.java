package org.poly.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.OneToMany;

@DiscriminatorValue("En")
public class Enseignant extends User implements Serializable {
	
	@OneToMany(mappedBy = "enseignant")
	private List<AffectationEnseigMatiere> affectations;

}
