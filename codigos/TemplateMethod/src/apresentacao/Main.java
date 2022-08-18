/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apresentacao;

import negocio.RelatorioDeCompras;
import negocio.RelatorioDeVendas;

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
        
        RelatorioDeVendas relatorioDeVendas = new RelatorioDeVendas();
        relatorioDeVendas.exibir();
        
        System.out.println("=================");        
        
        RelatorioDeCompras relatorioDeCompras = new RelatorioDeCompras();
        relatorioDeCompras.exibir();
    }
    
}
