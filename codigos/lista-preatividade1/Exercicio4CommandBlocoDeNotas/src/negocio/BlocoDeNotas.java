/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author iapereira
 */
public class BlocoDeNotas {
    private Command menu;

    public BlocoDeNotas() {
    }

    public void setMenu(Command command) {
        this.menu = command;
    }

    public void executeCommand() {
        this.menu.execute();
    }
    
}
