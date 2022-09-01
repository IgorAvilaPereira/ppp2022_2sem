/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apresentacao;

import negocio.Noticia;
import negocio.PessoaFisica;
import negocio.PessoaJuridica;
import negocio.Portal;

/**
 *
 * @author iapereira
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        var i = 1;
//        var p = new Portal();
        Portal portal = new Portal();
        PessoaFisica igor = new PessoaFisica();
        igor.setNome("Igor");
        igor.setCpf("176.585.860-73");
        portal.subscribeObserver(igor);
        PessoaJuridica ifrs = new PessoaJuridica();
        ifrs.setNome("ifrs");
        ifrs.setCnpj("1212344/0000-1");
        portal.subscribeObserver(ifrs);
        portal.addNoticia(new Noticia("titulo1", "texto1"));
        
        
    }
    
}
