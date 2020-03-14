package org.gid.metier;

import java.util.List;

import java.util.Optional;

import org.gid.entities.Absence;
import org.gid.entities.Collaborateur;
import org.gid.entities.Repos;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;



public interface ReposMetier {

	public Repos saveRepos(Repos rp);

	 public List<Repos> listRepos();

	
	
	/* public PageRepos getRepos(String daterepos,int page,int size);*/
	 public Page<Repos> reposParMC(String string, PageRequest pageRequest);
	
	public Repos getRepos(Long reposid);

	public void deleteRepos(Long reposid);

	public Repos saveAndFlushRepos(Repos rp);
	
}

	

	