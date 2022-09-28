/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author iapereira
 */
public class Compra {

    private Status status;

    public Compra() {
        this.status = new AindaNaoEfetuada();
        System.out.println(this.status.getClass().getSimpleName());

    }

    public void request() {
        this.status = this.status.afterStep();
        System.out.println(this.status.getClass().getSimpleName());
    }
    
    public void problem(){
        this.status = this.status.beforeStep();
        System.out.println(this.status.getClass().getSimpleName());
    }

}
