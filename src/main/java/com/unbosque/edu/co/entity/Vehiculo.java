package com.unbosque.edu.co.entity;

import java.io.Serializable;
import jakarta.persistence.*;
import java.util.Date;


/**
 * The persistent class for the vehiculo database table.
 * 
 */
@Entity
@NamedQuery(name="Vehiculo.findAll", query="SELECT v FROM Vehiculo v")
public class Vehiculo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="my_row_id")
	private long myRowId;

	@Column(name="celular_vehiculo")
	private String celularVehiculo;

	@Column(name="clase_vehiculo")
	private String claseVehiculo;

	@Column(name="email_vehiculo")
	private String emailVehiculo;

	private String estado;

	@Temporal(TemporalType.DATE)
	@Column(name="fecha_caducidad")
	private Date fechaCaducidad;

	@Temporal(TemporalType.DATE)
	@Column(name="fecha_inspeccion_vehiculo")
	private Date fechaInspeccionVehiculo;

	private int id;

	@Column(name="id_empresa")
	private short idEmpresa;

	@Column(name="identificacion_propietario")
	private String identificacionPropietario;

	@Column(name="lugar_inspeccion")
	private String lugarInspeccion;

	@Column(name="matricula_vehiculo")
	private String matriculaVehiculo;

	@Column(name="modelo_vehiculo")
	private short modeloVehiculo;

	@Column(name="propietario_vehiculo")
	private String propietarioVehiculo;

	@Temporal(TemporalType.DATE)
	@Column(name="vencimiento_soat")
	private Date vencimientoSoat;

	public Vehiculo() {
	}

	public long getMyRowId() {
		return this.myRowId;
	}

	public void setMyRowId(long myRowId) {
		this.myRowId = myRowId;
	}

	public String getCelularVehiculo() {
		return this.celularVehiculo;
	}

	public void setCelularVehiculo(String celularVehiculo) {
		this.celularVehiculo = celularVehiculo;
	}

	public String getClaseVehiculo() {
		return this.claseVehiculo;
	}

	public void setClaseVehiculo(String claseVehiculo) {
		this.claseVehiculo = claseVehiculo;
	}

	public String getEmailVehiculo() {
		return this.emailVehiculo;
	}

	public void setEmailVehiculo(String emailVehiculo) {
		this.emailVehiculo = emailVehiculo;
	}

	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Date getFechaCaducidad() {
		return this.fechaCaducidad;
	}

	public void setFechaCaducidad(Date fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}

	public Date getFechaInspeccionVehiculo() {
		return this.fechaInspeccionVehiculo;
	}

	public void setFechaInspeccionVehiculo(Date fechaInspeccionVehiculo) {
		this.fechaInspeccionVehiculo = fechaInspeccionVehiculo;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public short getIdEmpresa() {
		return this.idEmpresa;
	}

	public void setIdEmpresa(short idEmpresa) {
		this.idEmpresa = idEmpresa;
	}

	public String getIdentificacionPropietario() {
		return this.identificacionPropietario;
	}

	public void setIdentificacionPropietario(String identificacionPropietario) {
		this.identificacionPropietario = identificacionPropietario;
	}

	public String getLugarInspeccion() {
		return this.lugarInspeccion;
	}

	public void setLugarInspeccion(String lugarInspeccion) {
		this.lugarInspeccion = lugarInspeccion;
	}

	public String getMatriculaVehiculo() {
		return this.matriculaVehiculo;
	}

	public void setMatriculaVehiculo(String matriculaVehiculo) {
		this.matriculaVehiculo = matriculaVehiculo;
	}

	public short getModeloVehiculo() {
		return this.modeloVehiculo;
	}

	public void setModeloVehiculo(short modeloVehiculo) {
		this.modeloVehiculo = modeloVehiculo;
	}

	public String getPropietarioVehiculo() {
		return this.propietarioVehiculo;
	}

	public void setPropietarioVehiculo(String propietarioVehiculo) {
		this.propietarioVehiculo = propietarioVehiculo;
	}

	public Date getVencimientoSoat() {
		return this.vencimientoSoat;
	}

	public void setVencimientoSoat(Date vencimientoSoat) {
		this.vencimientoSoat = vencimientoSoat;
	}

}