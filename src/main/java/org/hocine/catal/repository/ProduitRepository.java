package org.hocine.catal.repository;

import org.hocine.catal.entities.Produit;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;


@RepositoryRestResource
@CrossOrigin("*")
public interface ProduitRepository extends JpaRepository<Produit, Long> {
	@RestResource(path = "/ByDesignationPage")
	public Page <Produit>findByDesignationContains(@Param("mc") String des,Pageable pageable);

}
