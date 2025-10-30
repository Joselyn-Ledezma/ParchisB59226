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
    
    //CERO es IGUAL a 1
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
//    y-=30;
     for(int indice=5;indice<9;indice++){
    tablero[indice]= new Celda(new Posicion(x,y));
    tablero[indice].setFicha(new Ficha(new Posicion(x,y),new ImageIcon("./src/main/resources/imagenes/pieceblack.png"),"Black"));
    y-=30;
    }
     x=383;
     y=349;
        for(int indice=9;indice<12;indice++){
    tablero[indice]= new Celda(new Posicion(x,y));
    tablero[indice].setFicha(new Ficha(new Posicion(x,y),new ImageIcon("./src/main/resources/imagenes/pieceblack.png"),"Black"));
    x+=30;
      }
    tablero[13]=new CeldaEspecial(new Posicion(x,y),"Zona segura");
    tablero[13].setFicha(new Ficha(new Posicion(x,y),new ImageIcon("./src/main/resources/imagenes/pieceblack1.png"),"Black"));
   
    for(int indice=13;indice<17;indice++){
    tablero[indice]= new Celda(new Posicion(x,y));
    tablero[indice].setFicha(new Ficha(new Posicion(x,y),new ImageIcon("./src/main/resources/imagenes/pieceblack.png"),"Black"));
    x+=30;
    }
   x=561;
   y=308;
    tablero[18]=new CeldaEspecial(new Posicion(x,y),"Zona segura");
    tablero[18].setFicha(new Ficha(new Posicion(x,y),new ImageIcon("./src/main/resources/imagenes/pieceblack1.png"),"Black"));
    
   x=558;
   y=241;
        for(int indice=19;indice<22;indice++){
    tablero[indice]= new Celda(new Posicion(x,y));
    tablero[indice].setFicha(new Ficha(new Posicion(x,y),new ImageIcon("./src/main/resources/imagenes/pieceblack.png"),"Black"));
    x-=30;
    }
    tablero[22]=new CeldaEspecialColor(new Posicion(x,y),"Salida Azul","Azul");
    tablero[22].setFicha(new Ficha(new Posicion(x,y),new ImageIcon("./src/main/resources/imagenes/pieceblack1.png"),"Black")); 
    x-=30;
    
    for(int indice=23;indice<26;indice++){
    tablero[indice]= new Celda(new Posicion(x,y));
    tablero[indice].setFicha(new Ficha(new Posicion(x,y),new ImageIcon("./src/main/resources/imagenes/pieceblack.png"),"Black"));
    x-=30;
    }
    x=353;
    y=208;
     for(int indice=26;indice<29;indice++){
    tablero[indice]= new Celda(new Posicion(x,y));
    tablero[indice].setFicha(new Ficha(new Posicion(x,y),new ImageIcon("./src/main/resources/imagenes/pieceblack.png"),"Black"));
    y-=30;
    }
    tablero[29]=new CeldaEspecial(new Posicion(x,y),"Zona segura");
    tablero[29].setFicha(new Ficha(new Posicion(x,y),new ImageIcon("./src/main/resources/imagenes/pieceblack1.png"),"Black"));
     
    for(int indice=30;indice<35;indice++){
    tablero[indice]= new Celda(new Posicion(x,y));
    tablero[indice].setFicha(new Ficha(new Posicion(x,y),new ImageIcon("./src/main/resources/imagenes/pieceblack.png"),"Black"));
    y-=30;
    }
//    curva 
   x=296;
   y=0;
    tablero[35]=new CeldaEspecial(new Posicion(x,y),"Zona segura");
    tablero[35].setFicha(new Ficha(new Posicion(x,y),new ImageIcon("./src/main/resources/imagenes/pieceblack1.png"),"Black"));  
  x=242;
  y=0;
// recta
    for(int indice=36;indice<40;indice++){
    tablero[indice]= new Celda(new Posicion(x,y));
    tablero[indice].setFicha(new Ficha(new Posicion(x,y),new ImageIcon("./src/main/resources/imagenes/pieceblack.png"),"Black"));
    y+=30;
    }
     tablero[40]=new CeldaEspecialColor(new Posicion(x,y),"Salida Azul","Azul");
    tablero[40].setFicha(new Ficha(new Posicion(x,y),new ImageIcon("./src/main/resources/imagenes/pieceblack1.png"),"Black"));
    y+=30; 
    for(int indice=41;indice<44;indice++){
    tablero[indice]= new Celda(new Posicion(x,y));
    tablero[indice].setFicha(new Ficha(new Posicion(x,y),new ImageIcon("./src/main/resources/imagenes/pieceblack.png"),"Black"));
    y+=30;
    }
    x=211;
    y=243;
 for(int indice=44;indice<47;indice++){
    tablero[indice]= new Celda(new Posicion(x,y));
    tablero[indice].setFicha(new Ficha(new Posicion(x,y),new ImageIcon("./src/main/resources/imagenes/pieceblack.png"),"Black"));
    x-=30;
    }
  tablero[47]=new CeldaEspecialColor(new Posicion(x,y),"Salida Azul","Azul");
    tablero[47].setFicha(new Ficha(new Posicion(x,y),new ImageIcon("./src/main/resources/imagenes/pieceblack1.png"),"Black"));
    x-=30; 
     
    for(int indice=48;indice<52;indice++){
    tablero[indice]= new Celda(new Posicion(x,y));
    tablero[indice].setFicha(new Ficha(new Posicion(x,y),new ImageIcon("./src/main/resources/imagenes/pieceblack.png"),"Black"));
    x-=30;
    }
   x=1;
   y=293;
    tablero[52]=new CeldaEspecial(new Posicion(x,y),"Zona segura");
    tablero[52].setFicha(new Ficha(new Posicion(x,y),new ImageIcon("./src/main/resources/imagenes/pieceblack1.png"),"Black"));  
    
    x=1;
    y=349;
 for(int indice=53;indice<57;indice++){
    tablero[indice]= new Celda(new Posicion(x,y));
    tablero[indice].setFicha(new Ficha(new Posicion(x,y),new ImageIcon("./src/main/resources/imagenes/pieceblack.png"),"Black"));
    x+=30;
    }
    tablero[57]=new CeldaEspecialColor(new Posicion(x,y),"Salida Verde","Verde");
    tablero[57].setFicha(new Ficha(new Posicion(x,y),new ImageIcon("./src/main/resources/imagenes/pieceblack1.png"),"Black"));
    x+=30; 
    for(int indice=58;indice<61;indice++){
    tablero[indice]= new Celda(new Posicion(x,y));
    tablero[indice].setFicha(new Ficha(new Posicion(x,y),new ImageIcon("./src/main/resources/imagenes/pieceblack.png"),"Black"));
    x+=30;
    }//fin 
    x=245;
    y=382;
     for(int indice=61;indice<64;indice++){
    tablero[indice]= new Celda(new Posicion(x,y));
    tablero[indice].setFicha(new Ficha(new Posicion(x,y),new ImageIcon("./src/main/resources/imagenes/pieceblack.png"),"Black"));
    y+=30;
    }
    tablero[64]=new CeldaEspecialColor(new Posicion(x,y),"Salida Amarillo","Amarillo");
    tablero[64].setFicha(new Ficha(new Posicion(x,y),new ImageIcon("./src/main/resources/imagenes/pieceblack1.png"),"Black"));
    y+=30; 
    for(int indice=65;indice<67;indice++){
    tablero[indice]= new Celda(new Posicion(x,y));
    tablero[indice].setFicha(new Ficha(new Posicion(x,y),new ImageIcon("./src/main/resources/imagenes/pieceblack.png"),"Black"));
    y+=30;
    }
    x=294;
    y=588;
    tablero[67]=new CeldaEspecial(new Posicion(x,y),"Zona segura descanso");
    tablero[67].setFicha(new Ficha(new Posicion(x,y),new ImageIcon("./src/main/resources/imagenes/pieceblack1.png"),"Black"));   
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
