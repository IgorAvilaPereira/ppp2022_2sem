/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author iapereira
 */
public class HomeTheather {
    private boolean isOn;
    private int volume;
    private int potencia;
    private int nroCaixas;
    
    
    public void ligar(){
        System.out.println("Ligando o home theather");
        this.isOn = true;
       
    }
    
    public void desligar(){
        System.out.println("desligando o home theather");
        this.isOn = false;
    }
}
