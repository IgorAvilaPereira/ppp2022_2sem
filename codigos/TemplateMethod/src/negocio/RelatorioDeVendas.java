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
public class RelatorioDeVendas extends Relatorio {

    @Override
    protected void exibirConteudo() {
        System.out.println("Conteúdo: Vendas: R$ bermudas R$ 50");
    }    
}