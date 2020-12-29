package org.poly.entities;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.lang.Nullable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.ManyToOne;

@Entity @Data @AllArgsConstructor @NoArgsConstructor
public class AffectaionEtudGroupe implements Serializable {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id ;
	@Column(length = 500) @Nullable
	private String commentaire;
	private String anneeUniversitaire;
	@ManyToOne
	private Etudiant etudiant ;
	@ManyToOne
	private Groupe groupe;

}
