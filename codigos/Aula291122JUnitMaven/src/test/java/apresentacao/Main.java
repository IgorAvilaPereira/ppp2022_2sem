/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apresentacao;

import negocio.Fruta;
import negocio.Vitamina;

/**
 *
 * @author iapereira
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vitamina a = new Vitamina();
        a.setNome("a");
        a.setSigla("a");
        Vitamina c = new Vitamina();
        c.setNome("c");
        c.setSigla("c");
        
        
        Fruta f = new Fruta();
        f.setNome("maca");
        f.adicionarVitamina(a);        
        f.substituirVitamina(a, c);
        
        f.removerVitamina(c);
        
        System.out.println(f);
        
        
        
    }
    
}
