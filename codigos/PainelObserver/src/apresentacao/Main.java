/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apresentacao;

import negocio.Cliente;
import negocio.Painel;

/**
 *
 * @author iapereira
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Cliente igor = new Cliente();
        Cliente marcio = new Cliente();
        
        Painel painel = new Painel();
        painel.subscribe(igor);
        painel.subscribe(marcio);        
        painel.setNroCaixa(4);
        
        
        painel.setNroCaixa(2);
    }
    
}
