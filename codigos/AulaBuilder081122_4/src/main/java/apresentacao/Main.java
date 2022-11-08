/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package apresentacao;

import negocio.Pessoa;
import negocio.PessoaBuilder;

/**
 *
 * @author iapereira
 */
public class Main {

    public static void main(String[] args) {
        Pessoa p = new PessoaBuilder().id(1).nome("igor").sobrenome("pereira").cpf("111.111.111-11").ehAssinante(true).temDependente(true).build();
        System.out.println(p.getNome());
    }
}
