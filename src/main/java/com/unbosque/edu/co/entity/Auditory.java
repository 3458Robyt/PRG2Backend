package com.unbosque.edu.co.entity;


import java.io.Serializable;

import java.util.Date;

import jakarta.persistence.*;
/**
 * The persistent class for the auditory database table.
 * 
 */
@Entity
@NamedQuery(name="Auditory.findAll", query="SELECT a FROM Auditory a")
@Table(name="auditory")
public class Auditory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id", nullable = false)
	private int id;

	@Column(name="accion_audtria", nullable = false, length = 1)
	private String accionAudtria;

	@Column(name="address_audtria", nullable = false, length = 20)
	private String addressAudtria;

	@Column(name="comentario_audtria", nullable = false, length = 60)
	private String comentarioAudtria;

	@Temporal(TemporalType.DATE)
	@Column(name="fcha_audtria", nullable = false)
	private Date fchaAudtria;

	@Column(name="usrio_audtria", nullable = false, length = 8)
	private String usrioAudtria;

	public Auditory() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAccionAudtria() {
		return this.accionAudtria;
	}

	public void setAccionAudtria(String accionAudtria) {
		this.accionAudtria = accionAudtria;
	}

	public String getAddressAudtria() {
		return this.addressAudtria;
	}

	public void setAddressAudtria(String addressAudtria) {
		this.addressAudtria = addressAudtria;
	}

	public String getComentarioAudtria() {
		return this.comentarioAudtria;
	}

	public void setComentarioAudtria(String comentarioAudtria) {
		this.comentarioAudtria = comentarioAudtria;
	}

	public Date getFchaAudtria() {
		return this.fchaAudtria;
	}

	public void setFchaAudtria(Date fchaAudtria) {
		this.fchaAudtria = fchaAudtria;
	}

	public String getUsrioAudtria() {
		return this.usrioAudtria;
	}

	public void setUsrioAudtria(String usrioAudtria) {
		this.usrioAudtria = usrioAudtria;
	}

}