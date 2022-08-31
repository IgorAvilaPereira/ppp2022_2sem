/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apresentacao;

/**
 *
 * @author iapereira
 */
public class MarioMorte implements MarioState {

    public MarioMorte() {
        System.out.println("Morri");
    }

    @Override
    public MarioState pegarCogumelo() {
        return this;
    }

    @Override
    public MarioState pegarPena() {
        return this;
    }

    @Override
    public MarioState pegarFlor() {
        return this;
    }

    @Override
    public MarioState dano() {
        return this;
    }
    
}
