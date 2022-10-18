/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author iapereira
 */
public class Caipira extends Bebida {
    
    public Caipira(){
        this.descricao =  "Caipira";
        this.custo = 10;
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
