package com.servicecompagny.dao;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.servicecompagny.entities.Societe;

@RepositoryRestResource
public interface ISocieteReposity extends JpaRepository<Societe, Long> {

	@Query("select s from Societe s where s.nomSociete like :motcle")
	public Page<Societe> societeparmotcle(@Param("motcle") String motCle, Pageable pageable);
}
