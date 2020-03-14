package org.gid.dao;








import org.gid.entities.Collaborateur;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CollaborateurRepository extends JpaRepository<Collaborateur,Long> {
    @Query("select c from Collaborateur c where c.matricule like :x")
    public Page<Collaborateur> getCollaborateurs(@Param("x") Long matricule,Pageable pageable);
    
    
    
    
   

	

	

	
}


