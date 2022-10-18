/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apresentacao;

import negocio.Funcionario;
import negocio.Professor;
import negocio.CoordenadorDeCurso;

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
        Funcionario igor = new Professor();
//        igor = new CoordenadorDeCurso(igor);
        System.out.println(igor.getDescricao());
        System.out.println(igor.getSalario());
    }

}
