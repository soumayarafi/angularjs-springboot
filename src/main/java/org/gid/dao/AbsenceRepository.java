package org.gid.dao;

import org.gid.entities.Absence;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface AbsenceRepository extends JpaRepository<Absence,Long> {
	@Query("select a from Absence a where a.nom like :x")
	public Page<Absence> absencesParMC(@Param("x") String mc,Pageable p);

	

}
