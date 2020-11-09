package org.poly.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.lang.Nullable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @Data @NoArgsConstructor @AllArgsConstructor
public class AffectationEnseigMatiere implements Serializable {

	@javax.persistence.Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id ;
	@Column(length = 500) @Nullable
	private String commentaire;
}
