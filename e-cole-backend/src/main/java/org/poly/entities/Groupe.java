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
import java.util.List;

import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity @Data @AllArgsConstructor @NoArgsConstructor  
public class Groupe implements Serializable {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id ;
	private String nomGroupe ;
	@Column(length = 500) @Nullable
	private String commentaires ;
	@OneToMany(mappedBy = "groupe")
	private List<AffectaionEtudGroupe> affectationsEtudiants ;
	
	@OneToMany(mappedBy = "groupe")
	private List<AffectationEnseigMatiere> affectationsEnseignants;
	
	@ManyToOne
	private Section section ;
	
	@OneToMany(mappedBy = "groupe")
	private List<EmploisDuTemps> emploisdutemps;
	
	
	}



