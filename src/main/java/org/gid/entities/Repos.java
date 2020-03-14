package org.gid.entities;

import java.io.Serializable;


import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;


@Entity
public class Repos implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name="Id_Repos")
	private Long reposid;
	private String terminal;
	private String fonction;
	
	@Column (name="Date_Repos")
	private String daterepos;
	@Column (name="Nombre_Personnes")
	private int nombre;
	public Long getReposid() {
		return reposid;
	}
	public void setReposid(Long reposid) {
		this.reposid = reposid;
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
	
	public String getDaterepos() {
		return daterepos;
	}
	public void setDaterepos(String daterepos) {
		this.daterepos = daterepos;
	}
	public int getNombre() {
		return nombre;
	}
	public void setNombre(int nombre) {
		this.nombre = nombre;
	}
	public Repos() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Repos(String terminal, String fonction,  String daterepos, int nombre) {
		super();
		this.terminal = terminal;
		this.fonction = fonction;
	
		this.daterepos = daterepos;
		this.nombre = nombre;
	}
	




}
