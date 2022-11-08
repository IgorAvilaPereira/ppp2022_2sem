/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apresentacao;

import java.time.LocalDate;
import negocio.Pessoa;

/**
 *
 * @author iapereira
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Pessoa p = new Pessoa.PessoaBuilder(1).nome("igor")
                    .sobrenome("pereira")
                    .cpf("111.111.111.11").build();
        
        System.out.println(p.getNome());
        
    
    }
    
    
}
