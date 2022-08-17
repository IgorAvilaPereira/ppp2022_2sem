/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package negocio;

/**
 *
 * @author iapereira
 */
public abstract class Observer {
    protected String nome;
    protected FormaDeNotificacao formaDeNotificacao;

    public void enviarNotificacao(int caixaVago){
        this.formaDeNotificacao.notificacao(this.nome, String.valueOf(caixaVago));
    }
    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setFormaDeNotificacao(FormaDeNotificacao formaDeNotificacao) {
        this.formaDeNotificacao = formaDeNotificacao;
    }
    
    
}
