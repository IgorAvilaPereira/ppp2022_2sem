/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author iapereira
 */
public class ArCondicionado {

    private boolean isOn;
    private float temperatura;
    private int btus;

    public ArCondicionado() {
        this.isOn = false;
        this.temperatura = Integer.MIN_VALUE;
        this.btus = 12000;
    }

    public void on() {
        this.isOn = true;
        this.temperatura = 24;

    }

    public void off() {
        this.isOn = false;
    }

    public void sleepMode(int milisegundos) {
        try {
            System.out.println("Começou o sleep");
            Thread.sleep(milisegundos);
            this.isOn = false;
            System.out.println("Terminou o sleep");
       } catch (InterruptedException ex) {
            Logger.getLogger(ArCondicionado.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
