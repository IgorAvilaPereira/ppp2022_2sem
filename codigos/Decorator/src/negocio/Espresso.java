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
public class Espresso extends Beverage {
    
    public Espresso(){
        super();
        super.description = "Espresso";
    
    }

    @Override
    public double cost() {
        return 1.0;
    }
    
}
