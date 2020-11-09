package org.poly.entities;

import java.util.List;

import javax.persistence.OneToMany;

public class Specialite {

	@OneToMany(mappedBy = "specialite")
	private List<Section> sections;
}
