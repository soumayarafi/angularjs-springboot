package org.gid.entities;

import java.io.Serializable;





import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import javax.persistence.Table;





@Entity
@Table(name = "Absences")


public class Absence implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name="Absence_Id")
	private Long absenceid;
	private String nom;
	private String prenom;
	
	
	
	private String datedebut;
	
	
	private String datefin;
	private String motif;
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getPrenom() {
		return prenom;
	}

	public void setPrénom(String prenom) {
		this.prenom = prenom;
	}
	public Long getAbsenceid() {
		return absenceid;
	}
	
	public void setAbsenceid(Long absenceid) {
		this.absenceid = absenceid;
	}
	public String getDatedebut() {
		return datedebut;
	}
	
	public void setDatedebut(String datedebut) {
		this.datedebut = datedebut;
	}
	public String getDatefin() {
		return datefin;
	}
	
	public void setDatefin(String datefin) {
		this.datefin = datefin;
	}
	public String getMotif() {
		return motif;
	}
	
	public void setMotif(String motif) {
		this.motif = motif;
	}
	public Absence() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Absence(String nom, String prenom, String datedebut, String datefin, String motif) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.datedebut = datedebut;
		this.datefin = datefin;
		this.motif = motif;
	}
	
	

}
