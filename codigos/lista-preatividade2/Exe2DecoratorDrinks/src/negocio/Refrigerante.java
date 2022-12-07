/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author iapereira
 */
public class Refrigerante extends CoquetelDecorator {

    public Refrigerante(Coquetel prox) {
        super(prox);
    }

    @Override
    public double getPreco() {
        return super.umCoquetel.getPreco() + 10;
        
    }

    @Override
    public String getNome() {
        return super.umCoquetel.getNome() + "\n"+ "Refrigerante";
    }
    
}
