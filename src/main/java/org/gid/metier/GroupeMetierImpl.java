package org.gid.metier;



import java.util.List;

import java.util.Optional;

import org.gid.dao.GroupeRepository;
import org.gid.entities.Collaborateur;
import org.gid.entities.Groupe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class GroupeMetierImpl implements GroupeMetier{
@Autowired 
private GroupeRepository groupeRepository;

	@Override
	public Groupe saveGroupe(Groupe gp) {
		// TODO Auto-generated method stub
		return groupeRepository.save(gp);
	}

	

	

	@Override
	public void deleteByNomgroupe(String nomgroupe) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Groupe> listGroupe() {
		// TODO Auto-generated method stub
		return groupeRepository.findAll();
	}
	





	
	





	@Override
	public Groupe getGroupe(String nomgroupe) {
		// TODO Auto-generated method stub
		return groupeRepository.findOne(nomgroupe);
	}



	

	
	}














	



	

	

