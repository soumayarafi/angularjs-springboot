package org.gid.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.gid.entities.Absence;
import org.gid.entities.Collaborateur;
import org.gid.entities.Repos;

import org.gid.metier.PageRepos;
import org.gid.metier.ReposMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReposRestService {
@Autowired
private ReposMetier reposMetier;
@Secured(value={"ROLE_ADMIN"})
@RequestMapping(value="/repos",method=RequestMethod.POST)
public Repos saveRepos(@RequestBody Repos rp) {
	return reposMetier.saveRepos(rp);
}
@Secured(value={"ROLE_ADMIN"})
@ RequestMapping(value="/repos",method=RequestMethod.GET)
public List<Repos> listRepos() {
	return reposMetier.listRepos();
}
@Secured(value={"ROLE_ADMIN"})
@RequestMapping(value="/repos/{reposid}",method=RequestMethod.GET)
public Repos getRepos(@PathVariable Long reposid){
	
	return reposMetier.getRepos(reposid);
	}
@Secured(value={"ROLE_ADMIN"})
@RequestMapping(value="/repos/{reposid}",method=RequestMethod.DELETE)
public void supprimer(@PathVariable Long reposid){
	reposMetier.deleteRepos(reposid);
	;
}
@Secured(value={"ROLE_ADMIN"})
@RequestMapping(value="/repos/{reposid}",method=RequestMethod.PUT)
public Repos save(@PathVariable Long reposid,@RequestBody Repos rp){
	rp.setReposid(reposid);
	return reposMetier.saveAndFlushRepos(rp);
	}
/*@RequestMapping(value="/chercherrepos",method=RequestMethod.GET)
public PageRepos getRepos(@RequestParam String daterepos, @RequestParam int page, @RequestParam int size) {
	
	return reposMetier.getRepos(daterepos, page, size);
}*/
@Secured(value={"ROLE_ADMIN"})
@RequestMapping(value="/reposParMC",method=RequestMethod.GET)
public Page<Repos> getRepos( 	 String mc,
		 int page)
		{
	
	return reposMetier.reposParMC("%"+mc+"%",new PageRequest( page, 3));
}

@RequestMapping(value="/getLogedUser")
public Map<String, Object> getLogedUser(HttpServletRequest httpServletRequest){
  HttpSession httpSession=httpServletRequest.getSession();
   SecurityContext securityContext=(SecurityContext)
		   httpSession.getAttribute("SPRING_SECURITY_CONTEXT");
   String username=securityContext.getAuthentication().getName();
	   List<String> roles=new ArrayList<>();
	   for(GrantedAuthority ga:securityContext.getAuthentication().getAuthorities()){
     roles.add(ga.getAuthority());
     
    
	   }
	   Map<String,Object> params=new HashMap<>();
	   params.put("username", username);
	   params.put("roles",roles);
return params;


}
}









