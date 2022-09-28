/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author iapereira
 */
public class ACaminhoDaRegiao implements Status {

    @Override
    public Status afterStep() {
        return new PedidoEntregue();
    }

    @Override
    public Status beforeStep() {
        return new NotaDisponivel();
    }

   
    
}
