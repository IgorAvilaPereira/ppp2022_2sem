/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author iapereira
 */
public abstract class CoquetelDecorator extends Coquetel {
    protected Coquetel umCoquetel;
    
    public CoquetelDecorator(Coquetel prox){
        this.umCoquetel = prox;
    }
}
