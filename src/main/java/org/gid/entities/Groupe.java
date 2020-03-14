package org.gid.entities;

import java.io.Serializable;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlTransient;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;


@Entity
public class Groupe implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	
	
	
  
	private String nomgroupe;
	private String terminal;
	private String fonction;
	
	
	
	@OneToMany (mappedBy = "groupe",fetch=FetchType.LAZY)
	private Collection<Collaborateur> collaborateurs ;



	public String getNomgroupe() {
		return nomgroupe;
	}


	@JsonSetter
	public void setNomgroupe(String nomgroupe) {
		this.nomgroupe = nomgroupe;
	}



	@JsonIgnore
	@XmlTransient
	
	public String getTerminal() {
		return terminal;
	}


	@JsonSetter
	public void setTerminal(String terminal) {
		this.terminal = terminal;
	}

	
	@JsonIgnore
	
	@XmlTransient
	
	public String getFonction() {
		return fonction;
	}


	@JsonSetter
	public void setFonction(String fonction) {
		this.fonction = fonction;
	}


	
	public Collection<Collaborateur> getCollaborateurs() {
		return collaborateurs;
	}



	public void setCollaborateurs(Collection<Collaborateur> collaborateurs) {
		this.collaborateurs = collaborateurs;
	}



	public Groupe() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Groupe(String nomgroupe, String terminal, String fonction) {
		super();
		this.nomgroupe = nomgroupe;
		this.terminal = terminal;
		this.fonction = fonction;
	}

	
	

	
	
	
	
	
	
	
	
	
}