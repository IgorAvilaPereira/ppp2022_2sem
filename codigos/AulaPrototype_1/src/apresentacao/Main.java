/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apresentacao;

import negocio.CarroPrototype;
import negocio.CarroPrototype;

/**
 *
 * @author iapereira
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CarroPrototype fiesta1 = CarroPrototype.clonar();
        fiesta1.setDescricao("fiesta");
        System.out.println(fiesta1);
        
        
        
        

    }
    
}
