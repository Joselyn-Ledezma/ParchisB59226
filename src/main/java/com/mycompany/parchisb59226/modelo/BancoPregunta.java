/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parchisb59226.modelo;

import java.util.ArrayList;

/**
 *
 * @author Joselyn Ledezma V
 */
public class BancoPregunta {
    private ArrayList<Pregunta>  listaPreguntas;

    public BancoPregunta() {
        listaPreguntas=new ArrayList<Pregunta>();
    }
    public void crearPreguntas(){
agregar(new Pregunta("¿Bruselas es  la capital de bélgica?",0));//Verdad 0- false 1
agregar(new Pregunta("¿Carlos se va a quedar en ITM",0));
agregar(new Pregunta("¿El tomate es una fruta",0));
agregar(new Pregunta("¿Maria siempre llega temprano",1));
agregar(new Pregunta("¿Es posible acceder a un atributos con visibilidad privada directamente desde otra clase",1));
agregar(new Pregunta("¿Carlos se va a quedar en ITM",0));
    }
   
    public void agregar (Pregunta pregunta){
        listaPreguntas.add(pregunta);
    }
    
    public Pregunta getPregunta(int posicion){
    return listaPreguntas.get(posicion);
    }
    
    public int getElementos(){
    return listaPreguntas.size();
    }
    
}//Fin clase
