package com.unbosque.edu.co.entity;

import java.io.Serializable;
import jakarta.persistence.*;
import java.util.Date;


/**
 * The persistent class for the usuario database table.
 * 
 */
@Entity
@NamedQuery(name="Usuario.findAll", query="SELECT u FROM Usuario u")
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="my_row_id")
	private long myRowId;

	@Column(name="apellido_usuario")
	private String apellidoUsuario;

	private String clave;

	private String estado;

	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaUltimaClave;

	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaUltimoIngreso;

	private short intentos;

	private String login;

	@Column(name="nombre_usuario")
	private String nombreUsuario;

	private String nombreCorto;

	private short tipoUsuario;

	public Usuario() {
	}

	public long getMyRowId() {
		return this.myRowId;
	}

	public void setMyRowId(long myRowId) {
		this.myRowId = myRowId;
	}

	public String getApellidoUsuario() {
		return this.apellidoUsuario;
	}

	public void setApellidoUsuario(String apellidoUsuario) {
		this.apellidoUsuario = apellidoUsuario;
	}

	public String getClave() {
		return this.clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Date getFechaUltimaClave() {
		return this.fechaUltimaClave;
	}

	public void setFechaUltimaClave(Date fechaUltimaClave) {
		this.fechaUltimaClave = fechaUltimaClave;
	}

	public Date getFechaUltimoIngreso() {
		return this.fechaUltimoIngreso;
	}

	public void setFechaUltimoIngreso(Date fechaUltimoIngreso) {
		this.fechaUltimoIngreso = fechaUltimoIngreso;
	}

	public short getIntentos() {
		return this.intentos;
	}

	public void setIntentos(short intentos) {
		this.intentos = intentos;
	}

	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getNombreUsuario() {
		return this.nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getNombreCorto() {
		return this.nombreCorto;
	}

	public void setNombreCorto(String nombreCorto) {
		this.nombreCorto = nombreCorto;
	}

	public short getTipoUsuario() {
		return this.tipoUsuario;
	}

	public void setTipoUsuario(short tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

}