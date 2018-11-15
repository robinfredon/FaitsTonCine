package org.sid.entities;

import java.io.Serializable;
import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Categorie")
public class Categorie implements Serializable {

   
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idCategorieIdee")
	private Long idCategorieIdee;
    private String categorieIdee;
    @ManyToMany(mappedBy = "Scenario")
    private Set<Scenario> scenarios  = new HashSet<Scenario>(0);
    @ManyToMany(mappedBy = "Idee")
    private Set<Idee> idees  = new HashSet<Idee>(0);

    public Categorie() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Categorie(String categorieIdee) {
		super();
		this.categorieIdee = categorieIdee;
	}

    
	public Long getIdCategorieIdee() {
		return idCategorieIdee;
	}
	public void setIdCategorieIdee(Long idCategorieIdee) {
		this.idCategorieIdee = idCategorieIdee;
	}
	public String getCategorieIdee() {
		return categorieIdee;
	}
	public void setCategorieIdee(String categorieIdee) {
		this.categorieIdee = categorieIdee;
	}
	public Set<Scenario> getScenarios() {
		return scenarios;
	}
	public void setScenarios(Set<Scenario> scenarios) {
		this.scenarios = scenarios;
	}
	public Set<Idee> getIdees() {
		return idees;
	}
	public void setIdees(Set<Idee> idees) {
		this.idees = idees;
	}



}