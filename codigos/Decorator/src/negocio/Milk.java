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
public class Milk extends CondimentDecorator {
    
    public Milk(Beverage beverage){
        super();
        super.component = beverage;
    }
    
    @Override
    public String getDescription(){
        return super.component.getDescription() + "\n-Leite";
    }

    @Override
    public double cost() {
        return super.component.cost() + 3.0;
    }
    
}
