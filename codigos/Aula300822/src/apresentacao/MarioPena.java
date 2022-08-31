/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apresentacao;

/**
 *
 * @author iapereira
 */
public class MarioPena implements MarioState {

    public MarioPena() {
        System.out.println("estou voando..");
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
        return new MarioFlor();
    }

    @Override
    public MarioState dano() {
        return new MarioGrande();
    }
    
}
