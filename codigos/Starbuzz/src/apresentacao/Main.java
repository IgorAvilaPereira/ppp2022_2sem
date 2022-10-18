/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apresentacao;

import negocio.Beverage;
import negocio.DarkRoast;
import negocio.Espresso;
import negocio.Milk;
import negocio.Sugar;

/**
 *
 * @author iapereira
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Beverage darkRoast = new DarkRoast();
        darkRoast = new Sugar(darkRoast);

        System.out.println(darkRoast.getDescription());
        System.out.println(darkRoast.cost());

//        Beverage espresso = new Espresso();
//        espresso = new Sugar(espresso);
//        espresso = new Sugar(espresso);
//        espresso = new Milk(espresso);
//        System.out.println(espresso.getDescription());
//        System.out.println(espresso.cost());
    }

}
