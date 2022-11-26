/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apresentacao;

import negocio.Matematica;

/**
 *
 * @author iapereira
 */
public class Main {
    public static void main(String[] args) {
        Matematica m = new Matematica();
        System.out.println("Resultado:"+m.divisao(1, 2));
    }
    
}
