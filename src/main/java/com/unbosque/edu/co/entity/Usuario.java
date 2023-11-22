package com.unbosque.edu.co.entity;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.*;

@Entity
@Table(name = "usuario")
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "login", nullable = false, length = 8)
	private String login;

	@Column(name = "clave", nullable = false, length = 256)
	private String clave;

	@Column(name = "nombre_usuario", nullable = false, length = 40)
	private String nombre_usuario;

	@Column(name = "apellido_usuario", nullable = false, length = 40)
	private String apellido_usuario;

	@Column(name = "tipo_usuario", nullable = false, length = 6)
	private short tipoUsuario;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fecha_ultima_clave", nullable = false)
	private Date fechaUltimaClave;

	@Column(name = "intentos", nullable = false, length = 6)
	private short intentos;

	@Column(name = "fecha_ultimo_ingreso", nullable = false)
	private Date fechaUltimoIngreso;

	@Column(name = "nombre_corto", nullable = false, length = 15)
	private String nombreCorto;

	@Column(name = "estado", nullable = false, length = 1)
	private String estado;
	
	public Usuario() {
		// TODO Auto-generated constructor stub
	}

	public Usuario(String login, String clave, String nombre_usuario, String apellido_usuario, short tipoUsuario,
			Date fechaUltimaClave, short intentos, Date fechaUltimoIngreso, String nombreCorto, String estado) {
		super();
		this.login = login;
		this.clave = clave;
		this.nombre_usuario = nombre_usuario;
		this.apellido_usuario = apellido_usuario;
		this.tipoUsuario = tipoUsuario;
		this.fechaUltimaClave = fechaUltimaClave;
		this.intentos = intentos;
		this.fechaUltimoIngreso = fechaUltimoIngreso;
		this.nombreCorto = nombreCorto;
		this.estado = estado;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getNombre_usuario() {
		return nombre_usuario;
	}

	public void setNombre_usuario(String nombre_usuario) {
		this.nombre_usuario = nombre_usuario;
	}

	public String getApellido_usuario() {
		return apellido_usuario;
	}

	public void setApellido_usuario(String apellido_usuario) {
		this.apellido_usuario = apellido_usuario;
	}

	public short getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(short tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

	public Date getFechaUltimaClave() {
		return fechaUltimaClave;
	}

	public void setFechaUltimaClave(Date fechaUltimaClave) {
		this.fechaUltimaClave = fechaUltimaClave;
	}

	public short getIntentos() {
		return intentos;
	}

	public void setIntentos(short intentos) {
		this.intentos = intentos;
	}

	public Date getFechaUltimoIngreso() {
		return fechaUltimoIngreso;
	}

	public void setFechaUltimoIngreso(Date fechaUltimoIngreso) {
		this.fechaUltimoIngreso = fechaUltimoIngreso;
	}

	public String getNombreCorto() {
		return nombreCorto;
	}

	public void setNombreCorto(String nombreCorto) {
		this.nombreCorto = nombreCorto;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
		
	}

