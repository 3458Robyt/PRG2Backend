package com.unbosque.edu.co.entity;

import java.io.Serializable;
import jakarta.persistence.*;


/**
 * The persistent class for the producto database table.
 * 
 */
@Entity
@NamedQuery(name="Producto.findAll", query="SELECT p FROM Producto p")
public class Producto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="my_row_id")
	private long myRowId;

	@Column(name="cdgo_elemnto")
	private String cdgoElemnto;

	@Column(name="cntdad_elemnto")
	private int cntdadElemnto;

	@Column(name="csto_vnta")
	private int cstoVnta;

	@Column(name="ctgria_elemnto")
	private short ctgriaElemnto;

	@Column(name="estdo_elemnto")
	private String estdoElemnto;

	@Column(name="iva_elemnto")
	private String ivaElemnto;

	@Column(name="mrgen_utldad")
	private double mrgenUtldad;

	@Column(name="nmbre_elemnto")
	private String nmbreElemnto;

	@Column(name="prcio_vnta_ac")
	private int prcioVntaAc;

	@Column(name="prcio_vnta_an")
	private int prcioVntaAn;

	@Column(name="stock_minmo")
	private short stockMinmo;

	@Column(name="stock_mxmo")
	private short stockMxmo;

	@Column(name="und_elemnto")
	private short undElemnto;

	public Producto() {
	}

	public long getMyRowId() {
		return this.myRowId;
	}

	public void setMyRowId(long myRowId) {
		this.myRowId = myRowId;
	}

	public String getCdgoElemnto() {
		return this.cdgoElemnto;
	}

	public void setCdgoElemnto(String cdgoElemnto) {
		this.cdgoElemnto = cdgoElemnto;
	}

	public int getCntdadElemnto() {
		return this.cntdadElemnto;
	}

	public void setCntdadElemnto(int cntdadElemnto) {
		this.cntdadElemnto = cntdadElemnto;
	}

	public int getCstoVnta() {
		return this.cstoVnta;
	}

	public void setCstoVnta(int cstoVnta) {
		this.cstoVnta = cstoVnta;
	}

	public short getCtgriaElemnto() {
		return this.ctgriaElemnto;
	}

	public void setCtgriaElemnto(short ctgriaElemnto) {
		this.ctgriaElemnto = ctgriaElemnto;
	}

	public String getEstdoElemnto() {
		return this.estdoElemnto;
	}

	public void setEstdoElemnto(String estdoElemnto) {
		this.estdoElemnto = estdoElemnto;
	}

	public String getIvaElemnto() {
		return this.ivaElemnto;
	}

	public void setIvaElemnto(String ivaElemnto) {
		this.ivaElemnto = ivaElemnto;
	}

	public double getMrgenUtldad() {
		return this.mrgenUtldad;
	}

	public void setMrgenUtldad(double mrgenUtldad) {
		this.mrgenUtldad = mrgenUtldad;
	}

	public String getNmbreElemnto() {
		return this.nmbreElemnto;
	}

	public void setNmbreElemnto(String nmbreElemnto) {
		this.nmbreElemnto = nmbreElemnto;
	}

	public int getPrcioVntaAc() {
		return this.prcioVntaAc;
	}

	public void setPrcioVntaAc(int prcioVntaAc) {
		this.prcioVntaAc = prcioVntaAc;
	}

	public int getPrcioVntaAn() {
		return this.prcioVntaAn;
	}

	public void setPrcioVntaAn(int prcioVntaAn) {
		this.prcioVntaAn = prcioVntaAn;
	}

	public short getStockMinmo() {
		return this.stockMinmo;
	}

	public void setStockMinmo(short stockMinmo) {
		this.stockMinmo = stockMinmo;
	}

	public short getStockMxmo() {
		return this.stockMxmo;
	}

	public void setStockMxmo(short stockMxmo) {
		this.stockMxmo = stockMxmo;
	}

	public short getUndElemnto() {
		return this.undElemnto;
	}

	public void setUndElemnto(short undElemnto) {
		this.undElemnto = undElemnto;
	}

}