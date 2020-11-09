package org.poly.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import lombok.AllArgsConstructor;

import lombok.NoArgsConstructor;import lombok.Data;

@Entity @Data @AllArgsConstructor @NoArgsConstructor
public class EmploisDuTemps implements Serializable {

	@javax.persistence.Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	private String jour ;
	private String heureDebut ;
	private String heureFin ;
}
