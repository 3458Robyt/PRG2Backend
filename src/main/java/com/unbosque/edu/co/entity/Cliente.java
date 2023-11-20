package com.unbosque.edu.co.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;

import java.math.BigDecimal;


/**
 * The persistent class for the cliente database table.
 * 
 */
@Entity
@NamedQuery(name="Cliente.findAll", query="SELECT c FROM Cliente c")
public class Cliente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="my_row_id")
	private long myRowId;

	@Column(name="compras_mes")
	private BigDecimal comprasMes;

	private String correo;

	private BigDecimal cupocredito;

	private String direccion;

	private String estado;

	private int id;

	private String identificacion;

	private String nombre;

	@Column(name="pagos_mes")
	private BigDecimal pagosMes;

	@Column(name="saldo_actual")
	private BigDecimal saldoActual;

	private String telefonos;

	public Cliente() {
	}

	public long getMyRowId() {
		return this.myRowId;
	}

	public void setMyRowId(long myRowId) {
		this.myRowId = myRowId;
	}

	public BigDecimal getComprasMes() {
		return this.comprasMes;
	}

	public void setComprasMes(BigDecimal comprasMes) {
		this.comprasMes = comprasMes;
	}

	public String getCorreo() {
		return this.correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public BigDecimal getCupocredito() {
		return this.cupocredito;
	}

	public void setCupocredito(BigDecimal cupocredito) {
		this.cupocredito = cupocredito;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIdentificacion() {
		return this.identificacion;
	}

	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public BigDecimal getPagosMes() {
		return this.pagosMes;
	}

	public void setPagosMes(BigDecimal pagosMes) {
		this.pagosMes = pagosMes;
	}

	public BigDecimal getSaldoActual() {
		return this.saldoActual;
	}

	public void setSaldoActual(BigDecimal saldoActual) {
		this.saldoActual = saldoActual;
	}

	public String getTelefonos() {
		return this.telefonos;
	}

	public void setTelefonos(String telefonos) {
		this.telefonos = telefonos;
	}

}