/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apresentacao;

import negocio.Dvd;
import negocio.Liquidacao;
import negocio.Livro;
import negocio.Regular;

/**
 *
 * @author iapereira
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//        Dvd dvdBregaBoys = new Dvd("BregaBoys", 10, "/capas/dvd_bregaboys.png");
//        dvdBregaBoys.setPromocao(new Liquidacao());
//        System.out.println(dvdBregaBoys.calcPreco());
//        dvdBregaBoys.setPromocao(new Regular(0.1));
//        System.out.println(dvdBregaBoys.calcPreco());

            Livro carasBook = new Livro("Caras Book", 20, "xxxxxx","as melhores caras e uma coleção" );
            carasBook.setPromocao(new Regular(0.1));
            System.out.println("Novo preco:"+carasBook.calcPreco());
    }

}
