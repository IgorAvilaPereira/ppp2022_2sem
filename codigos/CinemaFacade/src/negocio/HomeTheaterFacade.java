/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author iapereira
 */
public class HomeTheaterFacade {

    private Amplifier amplifier;
    private DvdPlayer dvdPlayer;
    private Screen screen;
    
    
    public void watchMovie(){
        this.amplifier = new Amplifier();
        this.dvdPlayer = new DvdPlayer(amplifier);
        this.amplifier.on();
        this.dvdPlayer.on();
        this.dvdPlayer.play();
        this.screen = new Screen();
        this.screen.on();
        
        
    }
    
    public void endMovie(){
        
        this.amplifier.off();
        this.dvdPlayer.stop();
        this.dvdPlayer.off();
        this.screen.off();
        
        
    }
    
    
}
