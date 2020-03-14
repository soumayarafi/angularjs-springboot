package org.gid.metier;


import java.util.List;

import java.util.Optional;

import org.gid.entities.Collaborateur;
import org.gid.entities.Groupe;

public interface GroupeMetier {
public Groupe saveGroupe(Groupe gp);


public void deleteByNomgroupe(String nomgroupe);
public List<Groupe> listGroupe();




 public Groupe getGroupe(String nomgroupe);





	

}
