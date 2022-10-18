/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author iapereira
 */
public class DarkRoast extends Beverage {
    
    public DarkRoast(){
        this.description =  "DarkRoast";
        this.cost = 10;
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
