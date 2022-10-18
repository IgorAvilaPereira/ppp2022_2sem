/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author iapereira
 */
public class Vodka extends CondimentDecorator {
    
    public Vodka(Bebida beverage) {
        super(beverage);
        this.descricao = "Vodka";
        this.custo = 3.0;
    }
    
}
