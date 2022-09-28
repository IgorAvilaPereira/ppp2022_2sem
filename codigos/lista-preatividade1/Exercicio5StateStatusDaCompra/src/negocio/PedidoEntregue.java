/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author iapereira
 */
public class PedidoEntregue implements Status {

    @Override
    public Status afterStep() {
        return this;
    }

    @Override
    public Status beforeStep() {
        return new ACaminhoDaRegiao();
    }
   
    
}
