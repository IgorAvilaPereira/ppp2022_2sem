/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apresentacao;

import java.util.ArrayList;
import negocio.Adolescente;
import negocio.Adulto;
import negocio.Email;
import negocio.NotificacaoApp;
import negocio.Observer;
import negocio.SMS;
import negocio.Supermercado;

/**
 *
 * @author iapereira
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Supermercado supermercado = new Supermercado();
        Adulto igor = new Adulto("Igor");
        igor.setFormaDeNotificacao(new SMS());
        Adulto marcio = new Adulto("Marcio");
        marcio.setFormaDeNotificacao(new Email());
        supermercado.subscribeObserver(igor);
        supermercado.subscribeObserver(marcio);
        supermercado.setCaixaVago(2);
        System.out.println("=========");
        igor.setFormaDeNotificacao(new NotificacaoApp());
        supermercado.setCaixaVago(3);
    }

}
