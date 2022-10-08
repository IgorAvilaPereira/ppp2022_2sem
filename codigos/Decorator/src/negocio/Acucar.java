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
public class Acucar extends CondimentDecorator {
    
    public Acucar(Beverage beverage){
        super();
        super.component = beverage;
    }
    
    @Override
    public String getDescription(){
        return super.component.getDescription() + "\n-Acucar";
    }

    @Override
    public double cost() {
        return super.component.cost() + 1.0;
    }
    
}
