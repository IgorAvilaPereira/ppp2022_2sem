/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author iapereira
 */
public class NotaDisponivel implements Status {

    @Override
    public Status afterStep() {
        return new ACaminhoDaRegiao();
    }

    @Override
    public Status beforeStep() {
        return new PagamentoAprovado();
    }

   
    
}
