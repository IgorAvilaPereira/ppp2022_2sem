/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author iapereira
 */
public class Vereador extends Incorporados {

    public Vereador(Cargo prox) {
        super(prox);
    }

    @Override
    public double calcSalario() {
        return super.prox.calcSalario()  + 5000;
    }

    @Override
    public String mostraNome() {
                return super.prox.mostraNome() + "\n"+ "Vereador";

    }
    
}
