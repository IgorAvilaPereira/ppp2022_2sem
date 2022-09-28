/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author iapereira
 */
public class Pessoa implements Observer {
    private String nome;
    
    public Pessoa(String nome){
        this.nome = nome;
    }

    @Override
    public void update() {
        System.out.println(this.nome+": ficou sabendo que o telefone está tocando");
    }
    
}
