/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parchisb59226.modelo;

/**
 *
 * @author Joselyn Ledezma V
 */
public class CeldaEspecialColor extends CeldaEspecial{
    private String color; 
    
    public CeldaEspecialColor(Posicion posicion, String tipo, String color){
    super(posicion,tipo);
    this.color=color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

  
    
}
