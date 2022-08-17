/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import javax.swing.JOptionPane;

/**
 *
 * @author iapereira
 */
public class NotificacaoApp implements FormaDeNotificacao{

    @Override
    public void notificacao(String nome, String info) {
        JOptionPane.showMessageDialog(null, nome+" recebeu a info:"+info, "supermercado igor corporation", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
