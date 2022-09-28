/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apresentacao;

import negocio.Noticia;
import negocio.Pessoa;
import negocio.RevistaFofoca;

/**
 *
 * @author iapereira
 */
public class Main {
    public static void main(String[] args) {
        RevistaFofoca caras = new RevistaFofoca();
        Pessoa igor = new Pessoa("Igor");
        Pessoa marcio = new Pessoa("Márcio");
        caras.registerObserver(igor);
        caras.registerObserver(marcio);
        caras.novaNoticia(new Noticia("Brasil ganha de Tunisia", "foi de goleada"));
    }
    
}
