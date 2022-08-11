/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

/**
 *
 * @author iapereira
 */
public class Cliente implements Observer {

    @Override
    public void update(int i) {
        System.out.println("----------------------------");
        System.out.println("A caixa livre eh:"+i);        
        System.out.println("----------------------------");
    }
    
}
