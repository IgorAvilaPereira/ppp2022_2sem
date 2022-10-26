/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author iapereira
 */
public class DvdPlayer {
    private Amplifier amplifier;
    
    public DvdPlayer(Amplifier amplifier){
        this.amplifier = amplifier;
    }
    
    public void on(){
        System.out.println("on dvd player");
    }
    
    public void off(){
        System.out.println("off dvd player");
    }
    
    public void eject(){
        System.out.println("eject dvd player");
    }
    
    public void pause(){
        System.out.println("pause dvd player");
    }
    
    public void play(){
        System.out.println("play dvd player");
    }
    
    public void stop(){
        System.out.println("stop dvd player");
    }
    
}
