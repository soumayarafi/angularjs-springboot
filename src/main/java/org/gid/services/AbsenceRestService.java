package org.gid.services;

import java.util.List;


import org.gid.dao.AbsenceRepository;
import org.gid.entities.Absence;
import org.gid.entities.Repos;
import org.gid.metier.AbsenceMetier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AbsenceRestService {
@Autowired
private AbsenceMetier absenceMetier;

@Secured(value={"ROLE_ADMIN"})
@RequestMapping(value="/absence/{absenceid}",method=RequestMethod.GET)
public Absence getAbsence(@PathVariable Long absenceid){
	
	return absenceMetier.getAbsence(absenceid);
	}
@Secured(value={"ROLE_ADMIN"})
@RequestMapping(value="/absence/{absenceid}",method=RequestMethod.DELETE)
public void supprimer(@PathVariable Long absenceid){
	absenceMetier.deleteAbsence(absenceid);
	;
}
@Secured(value={"ROLE_ADMIN"})
@RequestMapping(value="/absences",method=RequestMethod.POST)
public Absence saveAbsence(@RequestBody Absence a) {
	return absenceMetier.saveAbsence(a);
}
@Secured(value={"ROLE_ADMIN"})
@RequestMapping(value="/absences/{absenceid}",method=RequestMethod.PUT)
public Absence save(@PathVariable Long absenceid,@RequestBody Absence a){
	a.setAbsenceid(absenceid);
	return absenceMetier.saveAndFlushAbsence(a);
	}
@Secured(value={"ROLE_ADMIN"})
@ RequestMapping(value="/allabsences",method=RequestMethod.GET)
public List<Absence> listAbsence() {
	return absenceMetier.listAbsence();
}
/*@RequestMapping(value="/chercherAbsences",method=RequestMethod.GET)
public Page<Absence> cherhcer( 	 String mc,
		@RequestParam int page,
		@RequestParam int size) {
	
	return absenceMetier.chercherAbsences("%"+mc+"%",new PageRequest( page, size));
}*/
@Secured(value={"ROLE_ADMIN"})

@RequestMapping(value="/absencesParMC",method=RequestMethod.GET)
public Page<Absence> getAbsences( 	 String mc,
		 int page)
		{
	
	return absenceMetier.absencesParMC("%"+mc+"%",new PageRequest( page, 3));
}
}
