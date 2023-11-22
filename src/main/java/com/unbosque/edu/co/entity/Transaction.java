package com.unbosque.edu.co.entity;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "transactions")
public class Transaction implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "nombre", nullable = false, length = 40)
    private String nombre;

    @Column(name = "pagos_mes", length = 30)
    private String pagosMes;

    @Column(name = "documento", nullable = false, length = 20)
    private String documento;

    // Constructor, getters, and setters

    public Transaction() {
    }

    public Transaction(String nombre, String pagosMes, String documento) {
        this.nombre = nombre;
        this.pagosMes = pagosMes;
        this.documento = documento;
    }

    // Getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPagosMes() {
        return pagosMes;
    }

    public void setPagosMes(String pagosMes) {
        this.pagosMes = pagosMes;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }
}