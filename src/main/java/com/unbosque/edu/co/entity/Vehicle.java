package com.unbosque.edu.co.entity;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "vehicle")
public class Vehicle implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "tipo_vehiculo", nullable = false)
    private String tipoVehiculo;

    @Column(name = "matricula_vehiculo", nullable = false)
    private String matriculaVehiculo;

    @Column(name = "identificacion_propietario", nullable = false)
    private String identificacionPropietario;

    @Column(name = "modelo_vehiculo", nullable = false)
    private short modeloVehiculo;

    @Column(name = "vencimiento_soat", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date vencimientoSoat;

    @Column(name = "lugar_inspeccion", nullable = false)
    private String lugarInspeccion;

    @Column(name = "estado", nullable = false)
    private String estado;

    // Constructor, getters, and setters

    public Vehicle() {
    }

    public Vehicle(String tipoVehiculo, String matriculaVehiculo, String identificacionPropietario, short modeloVehiculo, Date vencimientoSoat, String lugarInspeccion, String estado) {
        this.tipoVehiculo = tipoVehiculo;
        this.matriculaVehiculo = matriculaVehiculo;
        this.identificacionPropietario = identificacionPropietario;
        this.modeloVehiculo = modeloVehiculo;
        this.vencimientoSoat = vencimientoSoat;
        this.lugarInspeccion = lugarInspeccion;
        this.estado = estado;
    }

    // Getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public String getMatriculaVehiculo() {
        return matriculaVehiculo;
    }

    public void setMatriculaVehiculo(String matriculaVehiculo) {
        this.matriculaVehiculo = matriculaVehiculo;
    }

    public String getIdentificacionPropietario() {
        return identificacionPropietario;
    }

    public void setIdentificacionPropietario(String identificacionPropietario) {
        this.identificacionPropietario = identificacionPropietario;
    }

    public short getModeloVehiculo() {
        return modeloVehiculo;
    }

    public void setModeloVehiculo(short modeloVehiculo) {
        this.modeloVehiculo = modeloVehiculo;
    }

    public Date getVencimientoSoat() {
        return vencimientoSoat;
    }

    public void setVencimientoSoat(Date vencimientoSoat) {
        this.vencimientoSoat = vencimientoSoat;
    }

    public String getLugarInspeccion() {
        return lugarInspeccion;
    }

    public void setLugarInspeccion(String lugarInspeccion) {
        this.lugarInspeccion = lugarInspeccion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}