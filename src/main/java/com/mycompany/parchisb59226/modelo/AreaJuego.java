/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parchisb59226.modelo;

import java.awt.Component;
import java.awt.Graphics;

/**
 *
 * @author Joselyn Ledezma V
 */
public class AreaJuego {
    private Tablero tablero;
    private Jugador jugador1;
    private Jugador jugador2;

    public AreaJuego() {
        tablero = new Tablero();
        tablero.crearCasa("Azul");
//        tablero.crearCasa("Amarillo");
//        tablero.crearCasa("Azul");
        
    }
    public void dibujar(Component componente, Graphics g){
    tablero.dibujar(componente, g);
    }
}
