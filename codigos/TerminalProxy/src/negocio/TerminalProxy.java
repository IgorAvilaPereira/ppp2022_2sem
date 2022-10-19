/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author iapereira
 */
public class TerminalProxy implements ITerminal {
    private Terminal terminal;
    
    public TerminalProxy(String login, String senha){
       if (!login.equals("igor") || !senha.equals("123")){
           try {
               throw new IllegalAccessException("daqui n passa");
           } catch (IllegalAccessException ex) {
               Logger.getLogger(TerminalProxy.class.getName()).log(Level.SEVERE, null, ex);
           }
       } else {
           this.terminal = new Terminal();
       }
       
    }

    @Override
    public void execute(String cmd) {
        this.terminal.execute(cmd);
    }
    
}
