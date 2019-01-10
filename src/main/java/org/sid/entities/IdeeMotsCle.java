package org.sid.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name = "IdeeMotsCle")
public class IdeeMotsCle implements Serializable{
	//@EmbeddedId
	private Long Id;
	
private Long idIdee;

private Long idMotsCle;

//@AttributeOverrides({
//	@AttributeOverride(name = "idIdee", column = @Column(name = "idIdee", nullable = false)),
//	@AttributeOverride(name = "idMotsCle", column = @Column(name = "idMotsCle", nullable = false)) })
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name = "id")
public Long getId() {
	return Id;
}
public void setId(Long id) {
	Id = id;
}


public Long getIdIdee() {
	return idIdee;
}
public void setIdIdee(Long idIdee) {
	this.idIdee = idIdee;
}
public Long getIdMotsCle() {
	return idMotsCle;
}
public void setIdMotsCle(Long idMotsCle) {
	this.idMotsCle = idMotsCle;
}


}
