package org.sid.entities;


import java.io.Serializable;
import java.util.*;

import javax.persistence.CascadeType;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name = "Projet")
public class Projet implements Serializable {
	@Id  @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idProjet")
	private Long idProjet;
    private String titre;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreation;
    private String synopsys;
    private Scenario scenario;
    private Utilisateur utilisateur;
    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
        name = "Projet", 
        joinColumns = { @JoinColumn(name = "idProjet") }, 
        inverseJoinColumns = { @JoinColumn(name = "idMotsCle") }
    )
    private Set<MotsCle> motcles  = new HashSet<MotsCle>(0);
    @ManyToMany(mappedBy = "Idee")
    private Set<Idee> idees  = new HashSet<Idee>(0);
    @ManyToMany(mappedBy = "Personnage")
    private Set<Personnage> personnages  = new HashSet<Personnage>(0);
	public Projet() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Projet(String titre, Date dateCreation, String synopsys) {
		super();
		this.titre = titre;
		this.dateCreation = dateCreation;
		this.synopsys = synopsys;
	}

    public Long getIdProjet() {
		return idProjet;
	}
	public void setIdProjet(Long idProjet) {
		this.idProjet = idProjet;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	public String getSynopsys() {
		return synopsys;
	}
	public void setSynopsys(String synopsys) {
		this.synopsys = synopsys;
	}
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "idScenario")
	public Scenario getScenario() {
		return scenario;
	}
	public void setScenario(Scenario scenario) {
		this.scenario = scenario;
	}
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "idUtilisateur")
	public Utilisateur getUtilisateur() {
		return utilisateur;
	}
	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}


}