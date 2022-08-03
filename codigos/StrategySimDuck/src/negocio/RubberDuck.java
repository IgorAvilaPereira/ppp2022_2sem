/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author iapereira
 */
public class RubberDuck extends Duck {

    public RubberDuck(){
//        this.setFlyBehavior(new FlyNoWay());
//        this.setQuackBehavior(new Squeak());
        this.flyBehavior = new FlyNoWay();
        this.quackBehavior = new Squeak();
    }
    
    @Override
    public void display() {
        System.out.println("Renderizando o Pato de Borracha....");
    }
    
}
