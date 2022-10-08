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
public abstract class CondimentDecorator extends Beverage {
    protected Beverage component;
    
    @Override
    public String getDescription(){
        return component.getDescription();
    }
}
