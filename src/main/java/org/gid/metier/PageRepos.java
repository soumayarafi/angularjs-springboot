package org.gid.metier;
import org.gid.entities.Repos;

import java.io.Serializable;
import java.util.List;
public class PageRepos implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<Repos> repos;
	private int page;
	private int nombreRepos;
	private int totalRepos;
	private int totalPages;
	public List<Repos> getRepos() {
		return repos;
	}
	public void setRepos(List<Repos> repos) {
		this.repos = repos;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getNombreRepos() {
		return nombreRepos;
	}
	public void setNombreRepos(int nombreRepos) {
		this.nombreRepos = nombreRepos;
	}
	public int getTotalRepos() {
		return totalRepos;
	}
	public void setTotalRepos(int totalRepos) {
		this.totalRepos = totalRepos;
	}
	public int getTotalPages() {
		return totalPages;
	}
	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}
	
}
