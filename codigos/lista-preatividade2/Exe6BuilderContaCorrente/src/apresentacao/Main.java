/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apresentacao;

import negocio.ContaCorrente;
import negocio.ContaCorrenteBuilder;

/**
 *
 * @author iapereira
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrenteBuilder(123131).nomeTitular("igor").numeroTelefone("(53) 3234324").saldo(10000).build();
        System.out.println(conta.getNomeTitular());
    }
    
}
