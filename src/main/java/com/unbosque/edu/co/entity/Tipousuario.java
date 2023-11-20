package com.unbosque.edu.co.entity;

import java.io.Serializable;
import jakarta.persistence.*;


/**
 * The persistent class for the tipousuario database table.
 * 
 */
@Entity
@NamedQuery(name="Tipousuario.findAll", query="SELECT t FROM Tipousuario t")
public class Tipousuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="my_row_id")
	private long myRowId;

	private String descripcion;

	private String estado;

	private short id;

	public Tipousuario() {
	}

	public long getMyRowId() {
		return this.myRowId;
	}

	public void setMyRowId(long myRowId) {
		this.myRowId = myRowId;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public short getId() {
		return this.id;
	}

	public void setId(short id) {
		this.id = id;
	}

}