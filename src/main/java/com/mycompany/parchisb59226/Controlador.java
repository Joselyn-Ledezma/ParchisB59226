/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parchisb59226;

import com.mycompany.parchisb59226.modelo.Cronometro;
import com.mycompany.parchisb59226.vista.NewJFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;


/**
 *
 * @author ITM
 */
public class Controlador implements ActionListener {

    private Timer timer;
    private Cronometro cronometro;
    private NewJFrame frame;
    

    

    public Controlador() {

        timer = new Timer(30, this);
        frame = new NewJFrame(this);
        cronometro = new Cronometro();
        update();
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand() != null) {
            switch (e.getActionCommand()) {
                case "Iniciar":
                     
                    cronometro.start();
                    timer.start();
                   
                    break;
                case "Detener":

                   cronometro.stop();
                   timer.stop();
                    break;
                case "Pausar":
                    cronometro.reset();
                    timer.restart();
                    break;

            }

        }
        if (timer.isRunning()) {
            update();
          
             if (cronometro.getElapsedTime()>= 20000) {
                        timer.stop();
                        cronometro.stop();
                    }
        }
    }

    public void update() {

        frame.setJlTime(cronometro.getFormattedTime());
    }

}
