package com.unbosque.edu.co.entity;

import java.io.Serializable;
import jakarta.persistence.*;


/**
 * The persistent class for the parametro database table.
 * 
 */
@Entity
@NamedQuery(name="Parametro.findAll", query="SELECT p FROM Parametro p")
public class Parametro implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="my_row_id")
	private long myRowId;

	@Column(name="codigo_parametro")
	private String codigoParametro;

	@Column(name="descripcion_parametro")
	private String descripcionParametro;

	@Column(name="estado_parametro")
	private String estadoParametro;

	private short id;

	@Column(name="valor_numerico_parametro")
	private int valorNumericoParametro;

	@Column(name="valor_texto_parametro")
	private String valorTextoParametro;

	public Parametro() {
	}

	public long getMyRowId() {
		return this.myRowId;
	}

	public void setMyRowId(long myRowId) {
		this.myRowId = myRowId;
	}

	public String getCodigoParametro() {
		return this.codigoParametro;
	}

	public void setCodigoParametro(String codigoParametro) {
		this.codigoParametro = codigoParametro;
	}

	public String getDescripcionParametro() {
		return this.descripcionParametro;
	}

	public void setDescripcionParametro(String descripcionParametro) {
		this.descripcionParametro = descripcionParametro;
	}

	public String getEstadoParametro() {
		return this.estadoParametro;
	}

	public void setEstadoParametro(String estadoParametro) {
		this.estadoParametro = estadoParametro;
	}

	public short getId() {
		return this.id;
	}

	public void setId(short id) {
		this.id = id;
	}

	public int getValorNumericoParametro() {
		return this.valorNumericoParametro;
	}

	public void setValorNumericoParametro(int valorNumericoParametro) {
		this.valorNumericoParametro = valorNumericoParametro;
	}

	public String getValorTextoParametro() {
		return this.valorTextoParametro;
	}

	public void setValorTextoParametro(String valorTextoParametro) {
		this.valorTextoParametro = valorTextoParametro;
	}

}