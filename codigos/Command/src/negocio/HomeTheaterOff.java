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
public class HomeTheaterOff implements Command {

    private HomeTheater homeTheater;
    
    public HomeTheaterOff(HomeTheater homeTheater){
        this.homeTheater = homeTheater;
    }

    @Override
    public void execute() {
        this.homeTheater.off();
    }
    
}
