/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apresentacao;

import java.io.IOException;
import negocio.CommandExecutorImpl;
import negocio.CommandExecutorProxy;

/**
 *
 * @author iapereira
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, InterruptedException, Exception {
        
//        CommandExecutorImpl cmd = new CommandExecutorImpl();
//        cmd.runCommand("ls");

        CommandExecutorProxy cmdProxy = new CommandExecutorProxy("iapereira", "12dsfsdf3");
        cmdProxy.runCommand("mkdir igor");
        cmdProxy.runCommand("rmdir igor");
    }
    
}
