/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apresentacao;

import negocio.Bebida;
import negocio.Caipira;
import negocio.Cidra;
import negocio.Vodka;
import negocio.Acucar;

/**
 *
 * @author iapereira
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//        Bebida caipira = new Caipira();
//        caipira = new Acucar(caipira);
//
//        System.out.println(caipira.getDescricao());
//        System.out.println(caipira.custo());

        Bebida  cidra = new Cidra();
         cidra = new Acucar( cidra);
         cidra = new Acucar( cidra);
        System.out.println( cidra.getDescricao());
        System.out.println( cidra.custo());
    }

}
