/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apresentacao;

import negocio.Acucar;
import negocio.Beverage;
import negocio.Espresso;
import negocio.Milk;

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
        
        Beverage cafeExpressoComCondimentos = new Espresso();
        cafeExpressoComCondimentos =  new Milk(cafeExpressoComCondimentos);
        cafeExpressoComCondimentos =  new Milk(cafeExpressoComCondimentos);   
        cafeExpressoComCondimentos = new Acucar(cafeExpressoComCondimentos);
        System.out.println(cafeExpressoComCondimentos.getDescription() + " R$"+cafeExpressoComCondimentos.cost());
    }
    
}
