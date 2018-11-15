package org.sid.entities;


import java.io.Serializable;
import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "TypeIdee")
public class TypeIdee  implements Serializable{
 
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idTypeIdee")
	private Long idTypeIdee;
    private String typeIdee;
    private Set<Idee> idees  = new HashSet<Idee>(0);
    public TypeIdee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TypeIdee(String typeIdee) {
		super();
		this.typeIdee = typeIdee;
	}

	public Long getIdTypeIdee() {
		return idTypeIdee;
	}
	public void setIdTypeIdee(Long idTypeIdee) {
		this.idTypeIdee = idTypeIdee;
	}
	public String getTypeIdee() {
		return typeIdee;
	}
	public void setTypeIdee(String typeIdee) {
		this.typeIdee = typeIdee;
	}
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "TypeIdee")
	public Set<Idee> getIdees() {
		return idees;
	}
	public void setIdees(Set<Idee> idees) {
		this.idees = idees;
	}


}