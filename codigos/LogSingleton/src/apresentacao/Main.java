/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apresentacao;

import negocio.Contato;
import log.Log;

/**
 *
 * @author iapereira
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Contato contato1 = new Contato();
            contato1.setNome("igor");
            Contato contato2 = new Contato();
            contato2.setNome("igor");
            
            if (contato1 == contato2) {
                System.out.println("iguais");
            } else {
                System.out.println("diferente");
            }
                
                
                        Contato contato3 = new Contato();
                        
                        
                        Log x = Log.getInstance();
                        Log y = Log.getInstance();
                        if (x == y) System.out.println("eh o mesmo..");

    }
    
}
