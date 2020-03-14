package org.gid.dao;





import org.gid.entities.Repos;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;



public interface ReposRepository extends JpaRepository<Repos, Long> {
	@Query("select rp from Repos rp where rp.daterepos like :x")
	public Page<Repos> reposParMC(@Param("x") String mc,Pageable p);
	

	

}
