/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apresentacao;

import negocio.Cargo;
import negocio.Gerente;
import negocio.Prefeito;
import negocio.Vereador;

/**
 *
 * @author iapereira
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cargo gerente = new Gerente();
        gerente = new Prefeito(gerente);
        gerente = new Vereador(gerente);
        System.out.println(gerente.mostraNome());
        System.out.println(gerente.calcSalario());
    }
    
}
