/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apresentacao;

import negocio.FlyNoWay;
import negocio.MuteQuack;
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

        RubberDuck patoBorracha = new RubberDuck();
//        patoBorracha.setFlyBehavior(new FlyNoWay());
//        patoBorracha.setQuackBehavior(new Squeak());
        patoBorracha.performQuack();
        patoBorracha.performFly();

        System.out.println("Perdi na banheira o negocinho de barulho do meu pato");
        patoBorracha.setQuackBehavior(new MuteQuack());
        patoBorracha.performQuack();

    }

}
