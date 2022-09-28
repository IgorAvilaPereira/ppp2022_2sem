/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author iapereira
 */
public abstract class Frete {

    public final double calcFrete(Produto produto) {
        return this.taxaModalidadeDistancia() + this.taxaPeso(produto) - this.desconto(produto);
    }
    
    protected abstract double taxaModalidadeDistancia();
    
    private double taxaPeso(Produto produto){
        return produto.getPeso();        
    }
    
    private double desconto(Produto produto){
        if (produto.getDesconto().length > 0) {
            double d = 0;
            for (int i = 0; i < produto.getDesconto().length; i++) {
                   d+= produto.getDesconto()[i];                
            }
            return d;
        } 
        return 0;
        
    }

}
