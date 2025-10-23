/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parchisb59226.controlador;

import com.mycompany.parchisb59226.modelo.AreaJuego;
import com.mycompany.parchisb59226.modelo.Ficha;
import com.mycompany.parchisb59226.modelo.Posicion;
import com.mycompany.parchisb59226.vista.GUIJuego;
import com.mycompany.parchisb59226.vista.GUIPrincipal;
import com.mycompany.parchisb59226.vista.PanelControl;
import com.mycompany.parchisb59226.vista.PanelJuego;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;

/**
 *
 * @author Joselyn Ledezma V
 */
public class ControladorJuego implements ActionListener,MouseListener{
    
    private GUIJuego guiJuego;
    private PanelJuego panelJuego;
    private PanelControl panelControl;
    private GUIPrincipal guiPrincipal;
    private Ficha ficha;
    private AreaJuego areaJuego;
    
    
    public ControladorJuego(GUIPrincipal guiPrincipal){
    this.guiPrincipal=guiPrincipal;
    guiJuego=new GUIJuego(this);
    panelJuego=guiJuego.getPanelJuego();
    panelControl=guiJuego.getPanelControl();
    guiJuego.setVisible(true);
    areaJuego=new AreaJuego();
    ficha=new Ficha(new Posicion(100,100),new ImageIcon("./src/main/resources/imagenes/pieceyellow.png"),"Amarillo");
    }//453,468
    public void dibujar(Component c, Graphics g){
    ficha.dibujar(c, g);
    areaJuego.dibujar(c, g);
    } 
            
            
    @Override
    public void actionPerformed(ActionEvent e){
    switch(e.getActionCommand()){
        case "Dado":
            System.out.println("Presiono el dado");
            break;
         case"atras" :
             guiJuego.dispose();
             guiPrincipal.setVisible(true);
             break;
    }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("X"+e.getX()+"Y"+e.getY());
        ficha.getPosicion().setX(e.getX());
        ficha.getPosicion().setY(e.getY());
        panelJuego.repaint();
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
     
    
}
