/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author iapereira
 */
public class PalioPrototype extends CarroPrototype {
    
    public PalioPrototype(){
        
    }

    public PalioPrototype(PalioPrototype palio) {
        this.valorCompra = palio.getValorCompra();
        this.descricao = palio.getDescricao();
        this.ano = palio.getAno();
    }

    @Override
    public String exibirInfo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public CarroPrototype clonar() {
        return new PalioPrototype(this);
    }
    
}
