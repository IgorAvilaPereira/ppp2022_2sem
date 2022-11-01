/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package log;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author iapereira
 */
public class Log {
    private static Log instance;


    private Log() {

    }
    
    public static synchronized Log getInstance(){
        if (instance == null){
            instance = new Log();
        }
        return instance;
    }

    public boolean registraLog(String mensagem) {
           try {
            FileWriter arq = new FileWriter("log.txt", true);
            PrintWriter gravarArq = new PrintWriter(arq);
            gravarArq.printf(mensagem + ":"+this.hashCode()+"\n================\n");
            arq.close();
        } catch (IOException ex) {
            Logger.getLogger(Log.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }

}
