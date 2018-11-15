package org.sid.entities;


import java.io.Serializable;
import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Personnage")
public class Personnage implements Serializable{

	@Id  @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idPersonnage")
	private Long idPersonnage;
    private String nom;
    private String prenom;
    private String surnom;
    private int age;
    private char sexe;
    private String biographie;
    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
        name = "Personnage", 
        joinColumns = { @JoinColumn(name = "idPersonnage") }, 
        inverseJoinColumns = { @JoinColumn(name = "idCaracterePer") }
    )
    private Set<CaracterePersonnage> caracterPersonnage  = new HashSet<CaracterePersonnage>(0);
    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
        name = "Personnage", 
        joinColumns = { @JoinColumn(name = "idPersonnage") }, 
        inverseJoinColumns = { @JoinColumn(name = "idProjet") }
    )
    private Set<Projet> projets  = new HashSet<Projet>(0);
    public Personnage() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Personnage(String nom, String prenom, String surnom, int age, char sexe, String biographie) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.surnom = surnom;
		this.age = age;
		this.sexe = sexe;
		this.biographie = biographie;
	}
	
	public Long getIdPersonnage() {
		return idPersonnage;
	}
	public void setIdPersonnage(Long idPersonnage) {
		this.idPersonnage = idPersonnage;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getSurnom() {
		return surnom;
	}
	public void setSurnom(String surnom) {
		this.surnom = surnom;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getSexe() {
		return sexe;
	}
	public void setSexe(char sexe) {
		this.sexe = sexe;
	}
	public String getBiographie() {
		return biographie;
	}
	public void setBiographie(String biographie) {
		this.biographie = biographie;
	}
	

	public Set<CaracterePersonnage> getCaracterPersonnage() {
		return caracterPersonnage;
	}
	public void setCaracterPersonnage(Set<CaracterePersonnage> caracterPersonnage) {
		this.caracterPersonnage = caracterPersonnage;
	}
	
	
	public Set<Projet> getProjets() {
		return projets;
	}
	public void setProjets(Set<Projet> projets) {
		this.projets = projets;
	}

	
	
	

}