package com.unbosque.edu.co.entity;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "user")
public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "login", nullable = false, length = 8)
    private String login;

    @Column(name = "clave", nullable = false, length = 256)
    private String clave;

    @Column(name = "nombre_usuario", nullable = false, length = 40)
    private String nombreUsuario;

    @Column(name = "apellido_usuario", nullable = false, length = 40)
    private String apellidoUsuario;

    @Column(name = "tipo_usuario", nullable = false)
    private String tipoUsuario;

    @Column(name = "fecha_ultima_clave", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaUltimaClave;

    @Column(name = "intentos", nullable = false)
    private short intentos;

    @Column(name = "fecha_ultimo_ingreso", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaUltimoIngreso;

    @Column(name = "nombre_corto", nullable = false, length = 15)
    private String nombreCorto;

    @Column(name = "estado", nullable = false, length = 1)
    private String estado;

    @Column(name = "telefono", nullable = false, length = 10)
    private String telefono;

    @Column(name = "correo", nullable = false, length = 50)
    private String correo;

    @Column(name = "direccion", nullable = false, length = 100)
    private String direccion;

    @Column(name = "documento", nullable = false, length = 20)
    private String documento;

    // Constructor, getters, and setters

    public User() {
    }

    public User(String login, String clave, String nombreUsuario, String apellidoUsuario, String tipoUsuario, Date fechaUltimaClave, short intentos, Date fechaUltimoIngreso, String nombreCorto, String estado, String telefono, String correo, String direccion, String documento) {
        this.login = login;
        this.clave = clave;
        this.nombreUsuario = nombreUsuario;
        this.apellidoUsuario = apellidoUsuario;
        this.tipoUsuario = tipoUsuario;
        this.fechaUltimaClave = fechaUltimaClave;
        this.intentos = intentos;
        this.fechaUltimoIngreso = fechaUltimoIngreso;
        this.nombreCorto = nombreCorto;
        this.estado = estado;
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
        this.documento = documento;
    }

    // Getters and setters

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

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getApellidoUsuario() {
        return apellidoUsuario;
    }

    public void setApellidoUsuario(String apellidoUsuario) {
        this.apellidoUsuario = apellidoUsuario;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }
}