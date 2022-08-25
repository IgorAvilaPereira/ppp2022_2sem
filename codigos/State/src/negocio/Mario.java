/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

/**
 *
 * @author iapereira
 */
public class Mario {

    protected MarioState estado;

    public Mario() {
        this.estado = new MarioPequeno();
    }

    public void pegarCogumelo() {
        this.estado = this.estado.pegarCogumelo();
    }

    public void pegarFlor() {
        this.estado = this.estado.pegarFlor();
    }

    public void pegarPena() {
        this.estado = this.estado.pegarPena();
    }

    public void levarDano() {
        this.estado = this.estado.levarDano();
    }

}
