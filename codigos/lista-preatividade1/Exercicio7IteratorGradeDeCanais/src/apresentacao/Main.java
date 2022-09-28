/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apresentacao;

import java.util.ArrayList;
import negocio.CanaisDeEsporte;
import negocio.CanaisDeEsporteIterator;
import negocio.CanaisDeFilmes;
import negocio.CanaisDeFilmesIterator;
import negocio.Canal;
import negocio.Iterator;

/**
 *
 * @author iapereira
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//        CanaisDeEsporte canaisDeEsporte = new CanaisDeEsporte();
//        for (int i = 0; i < canaisDeEsporte.getVetCanal().size(); i++) {
//            Canal canal = canaisDeEsporte.getVetCanal().get(i);
//            System.out.println(canal);
//            
//        }
//        
//        CanaisDeFilmes canaisDeFilmes = new CanaisDeFilmes();
//        for (int i = 0; i < canaisDeFilmes.getVetCanal().length; i++) {
//            Canal canal = canaisDeFilmes.getVetCanal()[i];
//            System.out.println(canal);
//            
//        }
        CanaisDeEsporteIterator canaisDeEsporteIterator = new CanaisDeEsporteIterator(new CanaisDeEsporte());
        CanaisDeFilmesIterator canaisDeFilmesIterator = new CanaisDeFilmesIterator(new CanaisDeFilmes());

        printCanais(canaisDeEsporteIterator);
        printCanais(canaisDeFilmesIterator);

    }

    private static void printCanais(Iterator iterator) {
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
