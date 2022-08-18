/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

/**
 *
 * @author iapereira
 */
public class RelatorioDeCompras extends Relatorio{

    @Override
    protected void exibirConteudo() {
        System.out.println("Conteúdo: Compras: 26/06 - 22 camisetas R$ 100");
    }
    
}
