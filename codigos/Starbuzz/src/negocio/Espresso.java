/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author iapereira
 */
public class Espresso extends Beverage {
    
    public Espresso(){
        this.description = "Espresso";
        this.cost = 1.0;
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public double cost() {
        return this.cost;
    }
    
}
