/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author iapereira
 */
public class SMS implements FormaDeNotificacao {

    @Override
    public void notificacao(String nome, String info) {
        System.out.println(nome+" recebeu por sms a info:"+info);
    }
    
}
