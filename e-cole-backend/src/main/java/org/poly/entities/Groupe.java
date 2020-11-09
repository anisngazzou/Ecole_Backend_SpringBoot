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
@Entity @Data @AllArgsConstructor @NoArgsConstructor  

public class Groupe {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id ;
	private String nomGroupe ;
	@Column(length = 500) @Nullable
	private String commentaires ;
	}
