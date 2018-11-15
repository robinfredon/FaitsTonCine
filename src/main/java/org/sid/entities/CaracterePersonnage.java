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
@Table(name = "CaracterePersonnage")
public class CaracterePersonnage  implements Serializable{

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idCaracterePer")
	private Long idCaracterePer;
    private String caractere;
    
    @ManyToMany(mappedBy = "Personnage")
    private Set<Personnage> personnages  = new HashSet<Personnage>(0);
    public CaracterePersonnage() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CaracterePersonnage(String caractere) {
		super();
		this.caractere = caractere;
	}


	public Long getIdCaracterePer() {
		return idCaracterePer;
	}

	public void setIdCaracterePer(Long idCaractereP) {
		this.idCaracterePer = idCaracterePer;
	}

	public String getCaractere() {
		return caractere;
	}

	public void setCaractere(String caractere) {
		this.caractere = caractere;
	}

	public Set<Personnage> getPersonnages() {
		return personnages;
	}

	public void setPersonnages(Set<Personnage> personnages) {
		this.personnages = personnages;
	}

}