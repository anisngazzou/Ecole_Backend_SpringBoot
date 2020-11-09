package org.poly.entities;

import java.util.List;

import javax.persistence.OneToMany;

public class Role {

	@OneToMany(mappedBy = "role")
	private List<User> users;
}
