/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author iapereira
 */
public class Adolescente extends Observer {
    
    public Adolescente(String nome){
        super();
        this.nome = nome;
    }

  

    @Override
    public String getNome() {
        return this.nome;
    }
    
}
