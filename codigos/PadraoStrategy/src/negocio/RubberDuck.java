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
public class RubberDuck extends Duck{
    
    public RubberDuck(){
        this.flyBehavior = new FlyNoWay();
    }
    
    public RubberDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior){
        super.setFlyBehavior(flyBehavior);
        super.setQuackBehavior(quackBehavior);
    }

    @Override
    public void display() {
        System.out.println("Mostrando na Tela o Pato de Borracha....");
          super.performFly();
        super.performQuack();
    }    
}
