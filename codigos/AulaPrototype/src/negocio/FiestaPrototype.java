/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author iapereira
 */
public class FiestaPrototype extends CarroPrototype {
    
    protected FiestaPrototype(FiestaPrototype fiestaPrototype){
        this.valorCompra = fiestaPrototype.getValorCompra();
        this.descricao = fiestaPrototype.getDescricao();
        this.ano = fiestaPrototype.getAno();
    }
    
    public FiestaPrototype(){
        valorCompra = 0.0;
    }

    @Override
    public String exibirInfo() {
        return "Modelo: "+getDescricao()+", Ano:"+getAno()+",Marca: Ford, Valor: R$"+getValorCompra();
    }

    @Override
    public CarroPrototype clonar() {
        return new FiestaPrototype(this);
    }
    
    
    
}
