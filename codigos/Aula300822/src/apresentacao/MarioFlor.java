/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apresentacao;

/**
 *
 * @author iapereira
 */
public class MarioFlor implements MarioState {

    public MarioFlor() {
        System.out.println("estou com flor");
    }

    @Override
    public MarioState pegarCogumelo() {
        return this;
    }

    @Override
    public MarioState pegarPena() {
        return new MarioPena();
    }

    @Override
    public MarioState pegarFlor() {
        return this;
    }

    @Override
    public MarioState dano() {
        return new MarioGrande();
    }
    
}
