package org.gid.services;


import java.util.List;


import java.util.Optional;


import org.gid.entities.Groupe;

import org.gid.metier.GroupeMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GroupeRestService {
	@Autowired
	private GroupeMetier groupeMetier;
	@Secured(value={"ROLE_ADMIN"})
	@RequestMapping(value="/groupes",method=RequestMethod.POST)
	public Groupe saveGroupe(@RequestBody Groupe gp) {
		return groupeMetier.saveGroupe(gp);
	}
	@Secured(value={"ROLE_ADMIN"})
	@RequestMapping(value="/groupes/{nomgroupe}",method=RequestMethod.DELETE)
	public void supprimer(@PathVariable String nomgroupe){
		groupeMetier. deleteByNomgroupe( nomgroupe);
		
	}
	@Secured(value={"ROLE_ADMIN"})
	@ RequestMapping(value="/listegroupes",method=RequestMethod.GET)
	public List<Groupe> listGroupe() {
		return groupeMetier.listGroupe();
	}
	@Secured(value={"ROLE_ADMIN"})
	@RequestMapping(value="/groupes/{nomgroupe}",method=RequestMethod.GET)
	public Groupe getGroupe(@PathVariable String nomgroupe){
		
		return groupeMetier.getGroupe(nomgroupe);
		}
	
}
