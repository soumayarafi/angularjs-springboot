package org.gid.metier;
import org.gid.entities.Collaborateur;


import java.io.Serializable;
import java.util.List;
public class PageCollaborateur implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<Collaborateur> collaborateurs;
	private int page;
	private int nombreCollaborateurs;
	private int totalCollaborateurs;
	private int totalPages;
	public List<Collaborateur> getCollaborateurs() {
		return collaborateurs;
	}
	public void setCollaborateurs(List<Collaborateur> collaborateurs) {
		this.collaborateurs =collaborateurs;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getNombreCollaborateurs() {
		return nombreCollaborateurs;
	}
	public void setNombreCollaborateurs(int nombreCollaborateurs) {
		this.nombreCollaborateurs = nombreCollaborateurs;
	}
	public int getTotalCollaborateurs() {
		return totalCollaborateurs;
	}
	public void setTotalCollaborateurs(int totalCollaborateurs) {
		this.totalCollaborateurs = totalCollaborateurs;
	}
	public int getTotalPages() {
		return totalPages;
	}
	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}
	
	
}
