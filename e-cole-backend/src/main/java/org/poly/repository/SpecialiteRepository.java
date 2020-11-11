package org.poly.repository;

import org.poly.entities.Specialite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
@RepositoryRestResource
public interface SpecialiteRepository extends JpaRepository<Specialite, Long> {

}
