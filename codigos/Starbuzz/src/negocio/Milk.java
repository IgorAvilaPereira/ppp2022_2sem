/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author iapereira
 */
public class Milk extends CondimentDecorator {
    
    public Milk(Beverage beverage) {
        super(beverage);
        this.description = "Milk";
        this.cost = 3.0;
    }
    
}
