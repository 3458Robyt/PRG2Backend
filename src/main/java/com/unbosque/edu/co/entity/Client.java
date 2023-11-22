package com.unbosque.edu.co.entity;

import java.io.Serializable;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.math.BigDecimal;


/**
 * The persistent class for the client database table.
 * 
 */
@Entity
@Table(name="client")
public class Client implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id", nullable = false, length = 30)
	private int id;
	@Column(name="documento", nullable = false)
	private int documento;
	@Column(name="nombre", nullable = false, length = 40)
	private String nombre;
	@Column(name="telefono", nullable = false, length = 30)
	private String telefono;
	@Column(name="valor", nullable = false)
	private BigDecimal valor;

	public Client() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDocumento() {
		return this.documento;
	}

	public void setDocumento(int documento) {
		this.documento = documento;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public BigDecimal getValor() {
		return this.valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

}