package org.gid.metier;

import java.util.List;

import java.util.Optional;

import org.gid.dao.ReposRepository;
import org.gid.entities.Absence;
import org.gid.entities.Collaborateur;
import org.gid.entities.Repos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
@Service
public class ReposMetierImpl implements ReposMetier{

	@Autowired
	private ReposRepository reposRepository;

	@Override
	public Repos saveRepos(Repos rp) {
		// TODO Auto-generated method stub
		return reposRepository.save(rp);
	}

	@Override
	public List<Repos> listRepos() {
		// TODO Auto-generated method stub
		return reposRepository.findAll();
	}

	@Override
	public Repos getRepos(Long reposid) {
		return reposRepository.findOne(reposid);
	}
	@Override
	public void deleteRepos(Long reposid) {
		reposRepository.delete(reposid);
		
	}

	

	@Override
	public Page<Repos> reposParMC(String string, PageRequest pageRequest) {
		// TODO Auto-generated method stub
		return reposRepository.reposParMC(string, pageRequest);
	}

	@Override
	public Repos saveAndFlushRepos(Repos rp) {
		// TODO Auto-generated method stub
		return reposRepository.saveAndFlush(rp);
	}

	

	
	

	

	

	
}
