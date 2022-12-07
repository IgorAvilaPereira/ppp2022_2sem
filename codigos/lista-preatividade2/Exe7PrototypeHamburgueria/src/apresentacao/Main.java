/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apresentacao;

import negocio.Hamburguer;
import negocio.HamburguerStore;

/**
 *
 * @author iapereira
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws CloneNotSupportedException {
        HamburguerStore hamburguerStore = new HamburguerStore();
        Hamburguer x = hamburguerStore.getChave("vegano").clone();
        x.setPreco(0);
        x.setNome("vegano com preco reduzido");
        System.out.println(x.getNome());
        System.out.println(x.getPreco());

        Hamburguer vegano = hamburguerStore.getChave("vegano").clone();
        System.out.println(vegano.getNome());
        System.out.println(vegano.getPreco());
    }

}
