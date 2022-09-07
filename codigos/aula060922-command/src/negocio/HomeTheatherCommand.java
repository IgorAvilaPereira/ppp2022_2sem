/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import negocio.Command;
import negocio.HomeTheather;

/**
 *
 * @author iapereira
 */
public class HomeTheatherCommand implements Command {
    private HomeTheather homeTheather;
    
    public HomeTheatherCommand(HomeTheather homeTheather) {
        this.homeTheather = homeTheather;
    }

    @Override
    public void execute() {
        this.homeTheather.ligar();
    }

    @Override
    public void undo() {
        this.homeTheather.desligar();
    }
    
}
