package org.gid.metier;

import java.util.List;






import org.gid.entities.Absence;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;



public interface AbsenceMetier {
	public Absence saveAbsence(Absence a);

	 public List<Absence> listAbsence();

	public Page<Absence> absencesParMC(String string, PageRequest pageRequest);

	public Absence getAbsence(Long absenceid);

	public void deleteAbsence(Long absenceid);

	public Absence saveAndFlushAbsence(Absence a);
	


	

	/*public Page<Absence> chercherAbsences(String string, PageRequest pageRequest);*/

	
	 
	 

}
