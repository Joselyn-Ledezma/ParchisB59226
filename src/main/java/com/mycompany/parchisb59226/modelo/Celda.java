/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parchisb59226.modelo;

/**
 *
 * @author Joselyn Ledezma V
 */
public class Celda {
    protected Posicion posicion;
    protected Ficha ficha;

    public Celda(Posicion posicion) {
        this.posicion = posicion;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public Ficha getFicha() {
        return ficha;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

    public void setFicha(Ficha ficha) {
        this.ficha = ficha;
    }
    
    
}
