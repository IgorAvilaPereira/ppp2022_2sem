/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author iapereira
 */
public abstract class Incorporados extends Cargo {
    protected Cargo prox;
    
    public Incorporados(Cargo prox){
        this.prox = prox;
    }
}
