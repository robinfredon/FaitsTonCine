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
@Table(name = "Idee")
public class Idee implements Serializable {

	@Id@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idIdee")
	private Long idIdee;
	@Temporal(TemporalType.TIMESTAMP)
    private Date dateCreation;
    private String idee;
    private String titre;
    private Genre genre;
    private TypeIdee typeTdee;
    private Utilisateur utilisateur;
    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
        name = "Idee", 
        joinColumns = { @JoinColumn(name = "idIdee") }, 
        inverseJoinColumns = { @JoinColumn(name = "idProjet") }
    )
    private Set<Projet> projets  = new HashSet<Projet>(0);
    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
        name = "Idee", 
        joinColumns = { @JoinColumn(name = "idIdee") }, 
        inverseJoinColumns = { @JoinColumn(name = "idMotsCle") }
    )
    private Set<MotsCle> motcles  = new HashSet<MotsCle>(0);
    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
        name = "Idee", 
        joinColumns = { @JoinColumn(name = "idIdee") }, 
        inverseJoinColumns = { @JoinColumn(name = "idCategorieIdee") }
    )
    private Set<Categorie> categories  = new HashSet<Categorie>(0);

    public Idee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Idee(Date dateCreation, String idee, String titre) {
		super();
		this.dateCreation = dateCreation;
		this.idee = idee;
		this.titre = titre;
	}


	public Set<Projet> getProjets() {
		return projets;
	}
	public void setProjets(Set<Projet> projets) {
		this.projets = projets;
	}
	public Set<MotsCle> getMotcles() {
		return motcles;
	}
	public void setMotcles(Set<MotsCle> motcles) {
		this.motcles = motcles;
	}
	public Set<Categorie> getCategories() {
		return categories;
	}
	public void setCategories(Set<Categorie> categories) {
		this.categories = categories;
	}
	public Long getIdIdee() {
		return idIdee;
	}
	public void setIdIdee(Long idIdee) {
		this.idIdee = idIdee;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	public String getIdee() {
		return idee;
	}
	public void setIdee(String idee) {
		this.idee = idee;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "idGenre")
	public Genre getGenre() {
		return genre;
	}
	public void setGenre(Genre genre) {
		this.genre = genre;
	}
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "idTypeIdee")
	public TypeIdee getTypeTdee() {
		return typeTdee;
	}
	public void setTypeTdee(TypeIdee typeTdee) {
		this.typeTdee = typeTdee;
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