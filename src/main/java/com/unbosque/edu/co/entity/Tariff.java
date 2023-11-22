package com.unbosque.edu.co.entity;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "tariff")
public class Tariff implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "my_row_id", nullable = false, columnDefinition = "bigint unsigned")
    private long myRowId;

    @Column(name = "valor_dia", nullable = false)
    private int valorDia;

    @Column(name = "valor_minuto", nullable = false)
    private int valorMinuto;

    @Column(name = "valor_mensual", nullable = false)
    private int valorMensual;

    // Constructor, getters, and setters

    public Tariff() {
    }

    public Tariff(int valorDia, int valorMinuto, int valorMensual) {
        this.valorDia = valorDia;
        this.valorMinuto = valorMinuto;
        this.valorMensual = valorMensual;
    }

    // Getters and setters

    public long getMyRowId() {
        return myRowId;
    }

    public void setMyRowId(long myRowId) {
        this.myRowId = myRowId;
    }

    public int getValorDia() {
        return valorDia;
    }

    public void setValorDia(int valorDia) {
        this.valorDia = valorDia;
    }

    public int getValorMinuto() {
        return valorMinuto;
    }

    public void setValorMinuto(int valorMinuto) {
        this.valorMinuto = valorMinuto;
    }

    public int getValorMensual() {
        return valorMensual;
    }

    public void setValorMensual(int valorMensual) {
        this.valorMensual = valorMensual;
    }
}