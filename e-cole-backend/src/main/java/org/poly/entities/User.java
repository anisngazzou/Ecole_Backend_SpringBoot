package org.poly.entities;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorColumn(name="user_type")
@Entity @Data @AllArgsConstructor @NoArgsConstructor
@Table(name = "utilisateur")
public class User implements Serializable {

@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
private Long Id;
private String username;
private String password;
 @ManyToOne
private Role role ;
}
