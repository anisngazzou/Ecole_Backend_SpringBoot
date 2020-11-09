package org.poly.entities;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @Data @AllArgsConstructor @NoArgsConstructor
public class Matiere implements Serializable {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id ;
	private String codeMatiere ;
	private String description ;
	private int coef ;
	private int nbreHeureCours;
	private int nbreHeureTd ;
	private int nbreHeureTp ;
}
