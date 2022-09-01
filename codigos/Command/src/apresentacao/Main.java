/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apresentacao;

import negocio.DvdPlayerOff;
import negocio.ControladorResidencial;
import negocio.DvdPlayer;
import negocio.DvdPlayerOn;
import negocio.HomeTheater;
import negocio.HomeTheaterOff;
import negocio.HomeTheaterOn;

/**
 *
 * @author iapereira
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ControladorResidencial controle = new ControladorResidencial();
        HomeTheater homeTheater = new HomeTheater();
        DvdPlayer dvdPlayer = new DvdPlayer();
        controle.setSlot1(new HomeTheaterOn(homeTheater), new HomeTheaterOff(homeTheater));
        controle.setSlot2(new DvdPlayerOn(dvdPlayer), new DvdPlayerOff(dvdPlayer));
        
        controle.buttonOn1();
        controle.buttonOn2();
        
        
        controle.buttonOff2();
        
    }
    
}
