/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apresentacao;

import negocio.Amplifier;
import negocio.DvdPlayer;
import negocio.HomeTheaterFacade;
import negocio.Screen;

/**
 *
 * @author iapereira
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//        sem facade
//        Amplifier amplifier = new Amplifier();
//        DvdPlayer dvdPlayer = new DvdPlayer(amplifier);
//        amplifier.on();
//        dvdPlayer.on();
//        dvdPlayer.play();
//        Screen screen = new Screen();
//        screen.on();

// com facade
//        System.out.println("======================");
        HomeTheaterFacade facade = new HomeTheaterFacade();
        facade.watchMovie();
        facade.endMovie();

    }

}
