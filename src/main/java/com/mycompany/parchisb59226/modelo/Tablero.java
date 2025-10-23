/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parchisb59226.modelo;

import static com.mycompany.parchisb59226.ParchisB59226.main;
import java.awt.Component;
import java.awt.Graphics;
import javax.swing.ImageIcon;

/**
 *
 * @author Joselyn Ledezma V
 */
public class Tablero {
    private Celda[] tablero;//REferencia de tipo celda
    private Casa casaJugador1;
    private Casa casaJugador2;

    public Tablero() {
        tablero=new Celda[68];
        iniciar();
    }
    
    
    public void iniciar(){
        int x=351;
        int y=589;
       
    for(int indice=0;indice<4;indice++){
    tablero[indice]= new Celda(new Posicion(x,y));
    tablero[indice].setFicha(new Ficha(new Posicion(x,y),new ImageIcon("./src/main/resources/imagenes/pieceblack.png"),"Black"));
    y-=30;
    }
    tablero[4]=new CeldaEspecialColor(new Posicion(x,y),"Salida Amarillo","Amarillo");
    tablero[4].setFicha(new Ficha(new Posicion(x,y),new ImageIcon("./src/main/resources/imagenes/pieceblack1.png"),"Black"));
    y-=30;
     for(int indice=5;indice<8;indice++){
    tablero[indice]= new Celda(new Posicion(x,y));
    tablero[indice].setFicha(new Ficha(new Posicion(x,y),new ImageIcon("./src/main/resources/imagenes/pieceblack.png"),"Black"));
    y-=30;
    }
     x=383;
     y=349;
        for(int indice=8;indice<11;indice++){
    tablero[indice]= new Celda(new Posicion(x,y));
    tablero[indice].setFicha(new Ficha(new Posicion(x,y),new ImageIcon("./src/main/resources/imagenes/pieceblack.png"),"Black"));
    x+=30;
      }
    tablero[11]=new CeldaEspecial(new Posicion(x,y),"Zona segura");
    tablero[11].setFicha(new Ficha(new Posicion(x,y),new ImageIcon("./src/main/resources/imagenes/pieceblack1.png"),"Black"));
   }
    public void crearCasa(String colorJugador1){
    if(colorJugador1.equals("Amarillo")){
    casaJugador1=new Casa ("Amarillo");
    casaJugador1.setFicha(0,new Ficha(new Posicion(455,462),new ImageIcon("./src/main/resources/imagenes/pieceyellow.png"),"Amarillo"));
     casaJugador1.setFicha(1,new Ficha(new Posicion(540,462),new ImageIcon("./src/main/resources/imagenes/pieceyellow.png"),"Amarillo"));
     casaJugador1.setFicha(2,new Ficha(new Posicion(455,526),new ImageIcon("./src/main/resources/imagenes/pieceyellow.png"),"Amarillo"));
     casaJugador1.setFicha(3,new Ficha(new Posicion(540,526),new ImageIcon("./src/main/resources/imagenes/pieceyellow.png"),"Amarillo"));
     casaJugador2=new Casa ("Roja");
      casaJugador2.setFicha(0,new Ficha(new Posicion(40,54),new ImageIcon("./src/main/resources/imagenes/piecered.png"),"Rojo"));
     casaJugador2.setFicha(1,new Ficha(new Posicion(131,54),new ImageIcon("./src/main/resources/imagenes/piecered.png"),"Rojo"));
     casaJugador2.setFicha(2,new Ficha(new Posicion(40,124),new ImageIcon("./src/main/resources/imagenes/piecered.png"),"Rojo"));
     casaJugador2.setFicha(3,new Ficha(new Posicion(131,124),new ImageIcon("./src/main/resources/imagenes/piecered.png"),"Rojo"));
    }
    if(colorJugador1.equals("Azul")){
    casaJugador1=new Casa ("Azul");
    casaJugador1.setFicha(0,new Ficha(new Posicion(455,54),new ImageIcon("./src/main/resources/imagenes/pieceblue.png"),"Amarillo"));
     casaJugador1.setFicha(1,new Ficha(new Posicion(540,54),new ImageIcon("./src/main/resources/imagenes/pieceblue.png"),"Amarillo"));
     casaJugador1.setFicha(2,new Ficha(new Posicion(455,124),new ImageIcon("./src/main/resources/imagenes/pieceblue.png"),"Amarillo"));
     casaJugador1.setFicha(3,new Ficha(new Posicion(540,124),new ImageIcon("./src/main/resources/imagenes/pieceblue.png"),"Amarillo"));
     casaJugador2=new Casa ("Verde");
      casaJugador2.setFicha(0,new Ficha(new Posicion(40,462),new ImageIcon("./src/main/resources/imagenes/piecegreen.png"),"Rojo"));
     casaJugador2.setFicha(1,new Ficha(new Posicion(131,462),new ImageIcon("./src/main/resources/imagenes/piecegreen.png"),"Rojo"));
     casaJugador2.setFicha(2,new Ficha(new Posicion(40,526),new ImageIcon("./src/main/resources/imagenes/piecegreen.png"),"Rojo"));
     casaJugador2.setFicha(3,new Ficha(new Posicion(131,526),new ImageIcon("./src/main/resources/imagenes/piecegreen.png"),"Rojo"));
    }}
    public void dibujar(Component componente, Graphics g){
    casaJugador1.dibujar(componente,g);
    casaJugador2.dibujar(componente, g);
    
    for(int indice=0;indice<tablero.length;indice++){
    if(tablero[indice]!=null){
    if(tablero[indice].getFicha()!=null){
    tablero[indice].getFicha().dibujar(componente, g);
    }
    }
    }
    }
}//fin clase
