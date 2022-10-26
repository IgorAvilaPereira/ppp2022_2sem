/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author iapereira
 */
public class Amplifier {
    private Turner turner;
    private DvdPlayer dvdPlayer;
    private CdPlayer cdPlayer;
    
    public void on(){
        System.out.println("On Amplifier");
    }
    
    public void off(){
        System.out.println("Off Amplifier");
    }

    public Turner getTurner() {
        return turner;
    }

    public void setTurner(Turner turner) {
        this.turner = turner;
    }

    public DvdPlayer getDvdPlayer() {
        return dvdPlayer;
    }

    public void setDvdPlayer(DvdPlayer dvdPlayer) {
        this.dvdPlayer = dvdPlayer;
    }

    public CdPlayer getCdPlayer() {
        return cdPlayer;
    }

    public void setCdPlayer(CdPlayer cdPlayer) {
        this.cdPlayer = cdPlayer;
    }
    
   
    
    
}
