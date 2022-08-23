/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apresentacao;

import negocio.PaginaCliente;
import persistencia.PaginaNoticia;

/**
 *
 * @author iapereira
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        PaginaCliente paginaCliente = new PaginaCliente();
        paginaCliente.renderHTML();

//        PaginaNoticia paginaNoticia = new PaginaNoticia();
//        paginaNoticia.renderHTML();
        
    }
    
}
