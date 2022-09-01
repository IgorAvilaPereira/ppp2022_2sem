package apresentacao;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author iapereira
 */
public class Mario {
    private MarioState estadoAtual;

    public Mario() {
        this.estadoAtual = new MarioPequeno();
    }

    public void pegarCogumelo() {
        this.estadoAtual = this.estadoAtual.pegarCogumelo();
       
    }
    
    public void pegarFlor(){
        this.estadoAtual = this.estadoAtual.pegarFlor();
    }
    
    public void pegarPena() {
        this.estadoAtual = this.estadoAtual.pegarPena();
    }
    
    public void dano(){
        this.estadoAtual = this.estadoAtual.dano();
    }

}
