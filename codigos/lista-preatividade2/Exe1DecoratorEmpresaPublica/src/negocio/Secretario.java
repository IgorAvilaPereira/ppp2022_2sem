/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author iapereira
 */
public class Secretario extends Incorporados {

    public Secretario(Cargo prox) {
        super(prox);
    }

    @Override
    public double calcSalario() {
        return super.prox.calcSalario() + 2000;
    }

    @Override
    public String mostraNome() {
        return super.prox.mostraNome() + "\n"+ "Secretário";
    }
    
}
