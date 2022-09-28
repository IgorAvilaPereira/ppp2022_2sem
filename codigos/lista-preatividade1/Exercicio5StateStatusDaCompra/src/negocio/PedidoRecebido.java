/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author iapereira
 */
public class PedidoRecebido implements Status {

    @Override
    public Status afterStep() {
        return new PagamentoAprovado();
    }

    @Override
    public Status beforeStep() {
        return new AindaNaoEfetuada();
    }
    
}
