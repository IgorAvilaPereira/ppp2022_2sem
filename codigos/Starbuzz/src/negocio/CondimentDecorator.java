/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import java.io.BufferedInputStream;
import java.io.BufferedReader;

/**
 *
 * @author iapereira
 */
public class CondimentDecorator extends Beverage {
    protected Beverage beverage;
    
    public CondimentDecorator(Beverage beverage){
        this.beverage = beverage;
    }
    

    @Override
    public String getDescription() {
        return this.beverage.getDescription()+"\n"+this.description;
    }

    @Override
    public double cost() {
        return this.cost + this.beverage.cost();
    }
    
}
