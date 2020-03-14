package org.gid.entities;

import java.io.Serializable;




import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import javax.persistence.Table;
import javax.xml.bind.annotation.XmlTransient;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;

@Entity
@Table(name = "Collaborateurs")

public class Collaborateur implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name="Matricule_Collaborateur")
	@Id
	private Long matricule;
	private String  nom;
	private String prenom;
	private String terminal;
	private String fonction;
	


	@ManyToOne 
	@JoinColumn(name ="nomgroupe")
    
	private Groupe groupe;
	
	public Long getMatricule() {
		return matricule;
	}
	public void setMatricule(Long matricule) {
		this.matricule = matricule;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prénom) {
		this.prenom = prénom;
	}
	public String getTerminal() {
		return terminal;
	}
	public void setTerminal(String terminal) {
		this.terminal = terminal;
	}
	public String getFonction() {
		return fonction;
	}
	public void setFonction(String fonction) {
		this.fonction = fonction;
	}
	@JsonIgnore
	public Groupe getGroupe() {
		return groupe;
	}
	@JsonSetter
	public void setGroupe(Groupe groupe) {
		this.groupe = groupe;
	}
	
	
	public Collaborateur() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Collaborateur(String nom, String prenom, String terminal, String fonction) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.terminal = terminal;
		this.fonction = fonction;
		
	}
    
  
    
 

	
	
	
	
	


	


	


	
}


	
	
   
   
	
	



