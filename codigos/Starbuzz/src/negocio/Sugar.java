/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author iapereira
 */
public class Sugar extends CondimentDecorator {
    
    public Sugar(Beverage beverage) {
        super(beverage);
        this.description = "Sugar";
        this.cost = 2.0;
    }
    
}
