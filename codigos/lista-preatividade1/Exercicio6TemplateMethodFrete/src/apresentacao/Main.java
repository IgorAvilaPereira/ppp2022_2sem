/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apresentacao;

import negocio.Correio;
import negocio.Produto;
import negocio.Sedex;

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
        Produto hiphone = new Produto();
        hiphone.setNome("Hiphone");
        hiphone.setPeso(1.0);
        hiphone.setPreco(1500);
        hiphone.setDesconto(new double[]{0.1, 0.2});
        
        Sedex sedex = new Sedex();
        System.out.println("Valor:"+sedex.calcFrete(hiphone));
        
        Correio correio = new Correio();
        System.out.println("Valor:"+correio.calcFrete(hiphone));
        
    }
    
}
