package org.gid.services;

import java.util.List;



import java.util.Optional;

import org.gid.entities.Collaborateur;
import org.gid.metier.CollaborateurMetier;

import org.gid.metier.PageCollaborateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CollaborateurRestService {
@Autowired
private CollaborateurMetier collaborateurMetier;
@Secured(value={"ROLE_ADMIN"})
@RequestMapping(value="/collaborateurs",method=RequestMethod.POST)
public Collaborateur saveCollaborateur(@RequestBody Collaborateur c) {
	return collaborateurMetier.saveCollaborateur(c);
}
@Secured(value={"ROLE_ADMIN"})
@ RequestMapping(value="/collaborateurs",method=RequestMethod.GET)
public List<Collaborateur> listCollaborateur() {
	return collaborateurMetier.listCollaborateur();
}
@Secured(value={"ROLE_ADMIN"})
@RequestMapping(value="/collaborateurs/{matricule}",method=RequestMethod.GET)
public Collaborateur getCollaborateur(@PathVariable Long matricule){
	
	return collaborateurMetier.getCollaborateur(matricule);
	}
@Secured(value={"ROLE_ADMIN"})
@RequestMapping(value="/collaborateurs/{matricule}",method=RequestMethod.DELETE)
public void supprimer(@PathVariable Long matricule){
	collaborateurMetier.deleteCollaborateur(matricule);
	
}
@Secured(value={"ROLE_ADMIN"})
@RequestMapping(value="/collaborateurs/{matricule}",method=RequestMethod.PUT)
public Collaborateur update(@PathVariable Long matricule,@RequestBody Collaborateur c){
	c.setMatricule(matricule);
	return collaborateurMetier.saveAndFlush(c);
	}


@Secured(value={"ROLE_ADMIN"})
@RequestMapping(value="/cherchercollaborateurs",method=RequestMethod.GET)
public PageCollaborateur getCollaborateurs(@RequestParam Long matricule, @RequestParam int page, @RequestParam int size) {
	
	return collaborateurMetier.getCollaborateurs(matricule, page, size);
}
}








