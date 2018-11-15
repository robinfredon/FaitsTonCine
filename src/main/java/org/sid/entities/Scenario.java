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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name = "Scenario")
public class Scenario implements Serializable{
   
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idScenario")
	private Long idScenario;
    private String titre;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreation;
    private String synopsys;
    private Set<Projet> projets  = new HashSet<Projet>(0);
    private Utilisateur utilisateur;
    private Set<Projet> projet  = new HashSet<Projet>(0);
    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
        name = "Scenario", 
        joinColumns = { @JoinColumn(name = "idScenario") }, 
        inverseJoinColumns = { @JoinColumn(name = "idGenre") }
    )
    private Set<Genre> genres  = new HashSet<Genre>(0);
    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
        name = "Scenario", 
        joinColumns = { @JoinColumn(name = "idScenario") }, 
        inverseJoinColumns = { @JoinColumn(name = "idMotsCle") }
    )
    private Set<Categorie> categories  = new HashSet<Categorie>(0);
    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
        name = "Scenario", 
        joinColumns = { @JoinColumn(name = "idScenario") }, 
        inverseJoinColumns = { @JoinColumn(name = "idCategorieIdee") }
    )
    private Set<MotsCle> motcles  = new HashSet<MotsCle>(0);
    
    
    public Scenario() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Scenario(String titre, Date dateCreation, String synopsys) {
		super();
		this.titre = titre;
		this.dateCreation = dateCreation;
		this.synopsys = synopsys;
	}

	public Long getIdScenario() {
		return idScenario;
	}
	public void setIdScenario(Long idScenario) {
		this.idScenario = idScenario;
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
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Scenario")

	public Set<Projet> getProjets() {
		return projets;
	}
	public void setProjets(Set<Projet> projets) {
		this.projets = projets;
	}
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "idUtilisateur")
	public Utilisateur getUtilisateur() {
		return utilisateur;
	}
	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}
	public Set<Projet> getProjet() {
		return projet;
	}
	public void setProjet(Set<Projet> projet) {
		this.projet = projet;
	}
	public Set<Genre> getGenres() {
		return genres;
	}
	public void setGenres(Set<Genre> genres) {
		this.genres = genres;
	}
	public Set<Categorie> getCategories() {
		return categories;
	}
	public void setCategories(Set<Categorie> categories) {
		this.categories = categories;
	}
	public Set<MotsCle> getMotcles() {
		return motcles;
	}
	public void setMotcles(Set<MotsCle> motcles) {
		this.motcles = motcles;
	}


}