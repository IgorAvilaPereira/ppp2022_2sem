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
public abstract class Beverage {
    protected String description;
    
    
    public String getDescription(){
        return this.description;
    }
    
    
    public abstract double cost();
    
}
