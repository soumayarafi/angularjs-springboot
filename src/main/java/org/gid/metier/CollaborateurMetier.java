package org.gid.metier;

import java.util.List;



import java.util.Optional;

import org.gid.entities.Collaborateur;
import org.springframework.data.domain.Page;


public interface CollaborateurMetier {

	public Collaborateur saveCollaborateur(Collaborateur c);

	 public List<Collaborateur> listCollaborateur();



	

	

	

	public Collaborateur getCollaborateur(Long matricule);

	public Collaborateur saveAndFlush(Collaborateur c);

	

	

	

	

	public void deleteCollaborateur(Long matricule);

	 public PageCollaborateur getCollaborateurs(Long matricule, int page, int size);

	
	
	
	

	



	
	
	
	


}