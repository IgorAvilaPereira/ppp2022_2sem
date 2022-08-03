/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apresentacao;

import negocio.FlyNoWay;
import negocio.FlyWithWings;
import negocio.Quack;
import negocio.QuickQuick;
import negocio.RedHeadDuck;
import negocio.RubberDuck;
import negocio.Squeak;

/**
 *
 * @author iapereira
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        RedHeadDuck redHeadDuck = new RedHeadDuck();
        redHeadDuck.setFlyBehavior(new FlyWithWings());
        redHeadDuck.setQuackBehavior(new Squeak());
        System.out.println("Meu pato voando...");
//        redHeadDuck.performFly();
//        System.out.println("Perdendo as asas...");
//        redHeadDuck.setFlyBehavior(new FlyNoWay());
//        redHeadDuck.performFly();
        
        RubberDuck rubberDuck = new RubberDuck(new FlyNoWay(), new QuickQuick());
//        rubberDuck.performFly(); 
//        rubberDuck.performQuack();
        rubberDuck.display();
    }
    
}
