package org.gid.metier;

import java.util.List;


import org.gid.dao.AbsenceRepository;

import org.gid.entities.Absence;
import org.gid.entities.Repos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;

import org.springframework.stereotype.Service;
import org.springframework.data.domain.PageRequest;
@Service

public class AbsenceMetierImpl  implements AbsenceMetier{
	@Autowired
	private AbsenceRepository absenceRepository;

	@Override
	public Absence saveAbsence(Absence a) {
		// TODO Auto-generated method stub
		return absenceRepository.save(a);
	}

	@Override
	public List<Absence> listAbsence() {
		// TODO Auto-generated method stub
		return absenceRepository.findAll();
	}

	@Override
	public Page<Absence> absencesParMC(String string, PageRequest pageRequest) {
		// TODO Auto-generated method stub
		return absenceRepository.absencesParMC(string, pageRequest);
	}

	/*@Override
	public Page<Absence> cherhcerAbsences(String string, PageRequest pageRequest) {
		// TODO Auto-generated method stub
		return absenceRepository.chercherAbsences(string, pageRequest);}
	*/
	
	@Override
	public Absence getAbsence(Long absenceid) {
		return absenceRepository.findOne(absenceid);
	}
	@Override
	public void deleteAbsence(Long absenceid) {
		absenceRepository.delete(absenceid);
		
	}

	@Override
	public Absence saveAndFlushAbsence(Absence a) {
		// TODO Auto-generated method stub
		return absenceRepository.saveAndFlush(a);
		}

}
	

	

	

	

	
	


