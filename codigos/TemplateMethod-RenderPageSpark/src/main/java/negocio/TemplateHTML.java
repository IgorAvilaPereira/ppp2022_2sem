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
    
    public final String renderHTML(){
        return this.cabecalho() + this.conteudo() + this.rodape();
    }

    private String rodape() {
        return "<b> Igor Corporation LTDA.\n"
                + "Rua Alfredo Huch \n"
                + "Telefone: (53) 999842323 </b>";
    }
     


    protected String cabecalho() {
        return "<i> Seja bem-vindo....Olá Usuário</i>";
    }
    
        protected abstract String conteudo();

    
}
