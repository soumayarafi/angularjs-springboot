package org.gid.metier;

import java.util.List;




import java.util.Optional;

import org.gid.dao.CollaborateurRepository;
import org.gid.entities.Absence;
import org.gid.entities.Collaborateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
@Service
public class CollaborateurMetierImpl implements CollaborateurMetier {
@Autowired
	private CollaborateurRepository collaborateurRepository;

	@Override
	public Collaborateur saveCollaborateur(Collaborateur c) {
		// TODO Auto-generated method stub
		return collaborateurRepository.save(c);
	}

	@Override
	
	public List<Collaborateur> listCollaborateur() {
		// TODO Auto-generated method stub
		return collaborateurRepository.findAll();
	}

	

	

	@Override
	public Collaborateur getCollaborateur(Long matricule) {
		// TODO Auto-generated method stub
		return collaborateurRepository.findOne(matricule);
	}

	@Override
	public Collaborateur saveAndFlush(Collaborateur c) {
		// TODO Auto-generated method stub
		return collaborateurRepository.saveAndFlush(c);
	}

	@Override
	public void deleteCollaborateur(Long matricule) {
		collaborateurRepository.delete(matricule);
		
	}
	@Override
	public PageCollaborateur getCollaborateurs(Long matricule,  int page, int size) {
		Page<Collaborateur> col=collaborateurRepository.getCollaborateurs(matricule,new PageRequest(page, size));
		PageCollaborateur pc=new PageCollaborateur();
		pc.setCollaborateurs(col.getContent());
		pc.setNombreCollaborateurs(col.getNumberOfElements());
		pc.setPage(col.getNumber());
		pc.setTotalPages(col.getTotalPages());
		pc.setTotalCollaborateurs((int)col.getTotalElements());
		return  pc;
		
		
		
		 
	}

	

	

	
	
	
	
	

	
	

	

	
	
}