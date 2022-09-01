/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

/**
 *
 * @author iapereira
 */
public class HomeTheater {
    private int volume;
    private int potencia;
    private int voltagem;
    private String marca;
    private double frequenciaRadio;

    public HomeTheater() {
        this.marca = "Sony";
        this.voltagem = 127;
        this.frequenciaRadio = 102.1;
    }

    public int getVolume() {
        return volume;
    }

    public int getPotencia() {
        return potencia;
    }

    public int getVoltagem() {
        return voltagem;
    }

    public String getMarca() {
        return marca;
    }
    
    
    public void on(){
        System.out.println("Ligando o Home");
        this.volume = 10;
    }
    
    public void off(){
        System.out.println("Desligando o Home...");
    }
            
            
    
    
}
