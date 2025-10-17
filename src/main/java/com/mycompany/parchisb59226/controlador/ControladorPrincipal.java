/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parchisb59226.controlador;

import com.mycompany.parchisb59226.vista.GUICreditos;
import com.mycompany.parchisb59226.vista.GUIHistoria;
import com.mycompany.parchisb59226.vista.GUIInstrucciones;
import com.mycompany.parchisb59226.vista.GUIPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Joselyn Ledezma V
 */
public class ControladorPrincipal implements ActionListener{
    private GUIPrincipal guiPrincipal;
    private GUICreditos guiCreditos;
    private GUIHistoria guiHistoria;
    private GUIInstrucciones guiInstrucciones; 
    private ControladorJuego controladorJuego;
    
    public ControladorPrincipal(){
    guiPrincipal=new GUIPrincipal(this);
    guiPrincipal.setVisible(true);
    guiCreditos=new GUICreditos(this);
    guiHistoria=new GUIHistoria(this);
    guiInstrucciones=new GUIInstrucciones(this);
    
    
    
    }
    @Override
    public void actionPerformed(ActionEvent e){
    switch(e.getActionCommand())
    {
        case "Jugar":
            guiPrincipal.setVisible(true);
            controladorJuego=new ControladorJuego(guiPrincipal);
                break;
         case "Instrucciones":
             guiPrincipal.setVisible(false);
             guiInstrucciones.setVisible(true);
                break;
         case "AtrasInstrucciones":
             guiInstrucciones.setVisible(false);
             guiPrincipal.setVisible(true);
             break;
         case "Creditos":
             guiPrincipal.setVisible(false);
             guiCreditos.setVisible(true);
                break;
         case "atrasCreditos":
             guiCreditos.setVisible(false);
             guiPrincipal.setVisible(true);
             break;
          case "Historia":
             guiPrincipal.setVisible(false);
             guiHistoria.setVisible(true);
                break;
         case "AtrasHistoria":
             guiHistoria.setVisible(false);
             guiPrincipal.setVisible(true);
             break;
         case "Salir":
             System.exit(0);
                break;
                        
                        
                        
                        
    
    
    
    }
    }
}
