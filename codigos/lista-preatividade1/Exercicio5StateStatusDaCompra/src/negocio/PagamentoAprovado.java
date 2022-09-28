/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author iapereira
 */
public class PagamentoAprovado implements Status {

    @Override
    public Status afterStep() {
        return new NotaDisponivel();
    }

    @Override
    public Status beforeStep() {
        return new PedidoRecebido();
    }

  
    
}
