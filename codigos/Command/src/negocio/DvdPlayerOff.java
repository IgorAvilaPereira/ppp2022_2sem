/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import negocio.Command;
import negocio.DvdPlayer;

/**
 *
 * @author iapereira
 */
public class DvdPlayerOff implements Command {

    private final DvdPlayer dvdPlayer;

    public DvdPlayerOff(DvdPlayer dvdPlayer) {
        this.dvdPlayer = dvdPlayer;
    }

    @Override
    public void execute() {
        this.dvdPlayer.off();
    }
    
}
