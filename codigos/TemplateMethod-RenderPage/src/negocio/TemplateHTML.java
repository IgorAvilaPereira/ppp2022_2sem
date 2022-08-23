/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author iapereira
 */
public abstract class TemplateHTML {
    
    public final void renderHTML(){
        this.cabecalho();
        this.conteudo();
        this.rodape();
    }

    private void rodape() {
        System.out.println("Igor Corporation LTDA.\n"
                + "Rua Alfredo Huch \n"
                + "Telefone: (53) 999842323");
    }
     


    private void cabecalho() {
        System.out.println("Seja bem-vindo....Olá Usuário");
    }
    
        protected abstract void conteudo();

    
}
