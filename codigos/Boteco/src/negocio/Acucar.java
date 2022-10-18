/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author iapereira
 */
public class Acucar extends CondimentDecorator {
    
    public Acucar(Bebida bebida) {
        super(bebida);
        this.descricao = "Acucar";
        this.custo = 2.0;
    }
    
}
