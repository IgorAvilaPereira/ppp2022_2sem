/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author iapereira
 */
public class Regular implements Promocao {
    private double variavel;
    
    public Regular(double variavel){
        if (variavel >= 0.05 && variavel <= 0.1) {
            this.variavel = variavel;
        }
        else {
            throw new IllegalArgumentException("Porcentagem variavel invalida!");
        } 
            
    }
    
    @Override
    public double descontar() {
        return 0.9*this.variavel;
    }
    
}
