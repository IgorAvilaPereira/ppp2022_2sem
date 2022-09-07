/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import javax.swing.JOptionPane;
import negocio.Command;

/**
 *
 * @author iapereira
 */
public class NoCommand implements Command {
    
    @Override
    public void execute() {
        JOptionPane.showMessageDialog(null, "Escolha um Dispositivo", "Controlador SmarthHome", JOptionPane.ERROR_MESSAGE);
    }

    @Override
    public void undo() {
        JOptionPane.showMessageDialog(null, "Escolha um Dispositivo", "Controlador SmarthHome", JOptionPane.ERROR_MESSAGE);

    }
    
}
