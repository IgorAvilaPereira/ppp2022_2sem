/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author iapereira
 */
public abstract class Coquetel {
    protected double preco;
    protected String nome;
    
//    public Coquetel(){
//        this.preco = 1000;
//    }
    
    public abstract double getPreco();
    public abstract String getNome();
    
}
