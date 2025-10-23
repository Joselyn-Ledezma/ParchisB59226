/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parchisb59226.modelo;

/**
 *
 * @author Joselyn Ledezma V
 */
public class Jugador {
    private String nombre;
    private String color;
    private int puntos;

    public Jugador(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
        puntos = 5;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public String getNombre() {
        return nombre;
    }

    public String getColor() {
        return color;
    }

    public int getPuntos() {
        return puntos;
    }
    
    
    
}
