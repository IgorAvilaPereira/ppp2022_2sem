/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author iapereira
 */
public class CondimentDecorator extends Bebida {
    protected Bebida bebida;
    
    public CondimentDecorator(Bebida bebida){
        this.bebida = bebida;
    }
    

    @Override
    public String getDescricao() {
        return this.bebida.getDescricao()+"\n"+this.descricao;
    }

    @Override
    public double custo() {
        return this.custo + this.bebida.custo();
    }
    
}
