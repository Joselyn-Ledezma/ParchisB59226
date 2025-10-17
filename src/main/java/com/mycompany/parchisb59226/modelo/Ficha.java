/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parchisb59226.modelo;

import java.awt.Component;
import java.awt.Graphics;
import javax.swing.ImageIcon;

/**
 *
 * @author Joselyn Ledezma V
 */
public class Ficha {
    private Posicion posicion; 
    private ImageIcon imagen;
    private String color; 

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

    public void setImagen(ImageIcon imagen) {
        this.imagen = imagen;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public ImageIcon getImagen() {
        return imagen;
    }

    public String getColor() {
        return color;
    }

    public Ficha(Posicion posicion, ImageIcon imagen, String color) {
        this.posicion = posicion;
        this.imagen = imagen;
        this.color = color;
    }
    public void dibujar(Component c, Graphics g){
    imagen.paintIcon(c,g,posicion.getX(),posicion.getY());
    }
}
