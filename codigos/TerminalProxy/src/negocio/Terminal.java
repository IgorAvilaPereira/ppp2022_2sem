/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author iapereira
 */
public class Terminal implements ITerminal {

    @Override
    public void execute(String cmd) {
        Process p = null;
        try {
            p = Runtime.getRuntime().exec(cmd);
            BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));
            System.out.println(in.readLine());
        } catch (IOException ex) {
            Logger.getLogger(Terminal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
