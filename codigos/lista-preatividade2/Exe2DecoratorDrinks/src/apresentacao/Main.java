/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apresentacao;

import negocio.Coquetel;
import negocio.Cachaca;
import negocio.Refrigerante;
import negocio.Limao;
import negocio.Vodka;

/**
 *
 * @author iapereira
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Coquetel coquetel = new Cachaca();
        coquetel = new Refrigerante(coquetel);
        coquetel = new Limao(coquetel);
        System.out.println(coquetel.getNome());
        System.out.println(coquetel.getPreco());
        
        System.out.println(coquetel.getNome());
        System.out.println(coquetel.getPreco());
        System.out.println("=============");
        
        Coquetel coquetel2 = new Vodka();
        coquetel2 = new Limao(coquetel2);
        coquetel2 = new Limao(coquetel2);
        
        
        System.out.println(coquetel2.getNome());
        System.out.println(coquetel2.getPreco());
    }
    
}
