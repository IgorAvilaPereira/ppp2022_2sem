/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apresentacao;

import negocio.Pessoa;
import negocio.Telefone;

/**
 *
 * @author iapereira
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Telefone telefone = new Telefone();
        Pessoa igor = new Pessoa("Igor");
        Pessoa marcio = new Pessoa("Márcio");
        telefone.registerObserver(igor);
        telefone.registerObserver(marcio);
//        telefone.chamando();
    }

}
