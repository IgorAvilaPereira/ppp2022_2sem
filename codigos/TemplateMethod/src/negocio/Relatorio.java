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
public abstract class Relatorio {
    
    public void exibir(){
        this.exibirCabecalho();
        this.exibirConteudo();
        this.exibirRodape();
    }

    private void exibirCabecalho() {
        System.out.println("Cabeçalho: Igor Pereira Corporation - Relatórios");
    }
    
    private void exibirRodape() {
        System.out.println("Rodapé: Av. Presidente 500 - Rio Grande - RS");
    }   

    protected abstract void exibirConteudo();

   
}
