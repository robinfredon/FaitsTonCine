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
@Table(name = "MotsCle")
public class MotsCle implements Serializable{
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idMotsCle")
	private Long idMotsCle;
    private String motCle;
    @ManyToMany(mappedBy = "Scenario")
    private Set<Scenario> scenarios  = new HashSet<Scenario>(0);
    @ManyToMany(mappedBy = "Idee")
    private Set<Idee> idees  = new HashSet<Idee>(0);
    @ManyToMany(mappedBy = "Projet")
    private Set<Projet> projet  = new HashSet<Projet>(0);
	
    public MotsCle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MotsCle(String motCle) {
		super();
		this.motCle = motCle;
	}
	
	public Long getIdMotsCle() {
		return idMotsCle;
	}
	public void setIdMotsCle(Long idMotsCle) {
		this.idMotsCle = idMotsCle;
	}
	public String getMotCle() {
		return motCle;
	}
	public void setMotCle(String motCle) {
		this.motCle = motCle;
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
	public Set<Projet> getProjet() {
		return projet;
	}
	public void setProjet(Set<Projet> projet) {
		this.projet = projet;
	}


}