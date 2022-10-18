/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author iapereira
 */
public class Cidra extends Bebida {
    
    public Cidra(){
        this.descricao = "Cidra";
        this.custo = 1.0;
    }

    @Override
    public String getDescricao() {
        return this.descricao;
    }

    @Override
    public double custo() {
        return this.custo;
    }
    
}
