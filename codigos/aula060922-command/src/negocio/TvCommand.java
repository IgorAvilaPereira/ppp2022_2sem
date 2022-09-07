/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import javax.swing.JOptionPane;

/**
 *
 * @author iapereira
 */
public class TvCommand implements Command {

    private Tv tv;

    public TvCommand(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        if (!this.tv.isIsOn()) {
            JOptionPane.showMessageDialog(null, "Ligando a tv", "Controlador SmarthHome", JOptionPane.INFORMATION_MESSAGE);
            this.tv.on();
        }
    }

    @Override
    public void undo() {
        if (!this.tv.isIsOn()) {
            JOptionPane.showMessageDialog(null, "Tv ainda não foi ligada", "Controlador SmarthHome", JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Desligando a tv", "Controlador SmarthHome", JOptionPane.ERROR_MESSAGE);
            this.tv.off();
        }
    }

}
