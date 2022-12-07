/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author iapereira
 */
public class Suco extends CoquetelDecorator {

    public Suco(Coquetel prox) {
        super(prox);
    }

    @Override
    public double getPreco() {
        return super.umCoquetel.getPreco() + 7;
    }

    @Override
    public String getNome() {
        return super.umCoquetel.getNome() + "\n"+ "Suco";
    }
    
}
