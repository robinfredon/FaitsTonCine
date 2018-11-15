package org.sid.entities;
import java.io.Serializable;
import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Genre")
public class Genre implements Serializable {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idGenre")
	private Long idGenre;
    private String genre;
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Genre")
    private Set<Idee> idees  = new HashSet<Idee>(0);
    @ManyToMany(mappedBy = "Scenario")
    private Set<Scenario> scenarios  = new HashSet<Scenario>(0);
  
    public Genre() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Genre(String genre) {
		super();
		this.genre = genre;
	}

	public Long getIdGenre() {
		return idGenre;
	}
	public void setIdGenre(Long idGenre) {
		this.idGenre = idGenre;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}

	public Set<Idee> getIdees() {
		return idees;
	}
	public void setIdees(Set<Idee> idees) {
		this.idees = idees;
	}
	public Set<Scenario> getScenarios() {
		return scenarios;
	}
	public void setScenarios(Set<Scenario> scenarios) {
		this.scenarios = scenarios;
	}


}