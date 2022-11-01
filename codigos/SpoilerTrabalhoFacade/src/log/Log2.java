package log;


import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import log.Log;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author iapereira
 */
public enum Log2 {
    instance;
    
    public static synchronized Log2 getInstance(){
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
