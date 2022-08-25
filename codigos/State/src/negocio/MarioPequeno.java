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
public class MarioPequeno implements MarioState {
    
    
    public MarioPequeno(){
        System.out.println("Pequeno...");
    }
    

    @Override
    public MarioState pegarCogumelo() {      
        return new MarioGrande();
    }

    @Override
    public MarioState pegarFlor() {
        return new MarioFogo();
    }

    @Override
    public MarioState pegarPena() {
        return new MarioCapa();
    }

    @Override
    public MarioState levarDano() {       
        return new MarioMorto();
    }
    
}
