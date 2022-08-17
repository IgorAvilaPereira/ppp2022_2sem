/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author iapereira
 */
public class PessoaFisica extends Pessoa {
    private String cpf;

    @Override
    public void update(String titulo) {
        System.out.println(this.nome+" como pessoa fisica recebi a noticia com titulo:"+titulo);
    }

    @Override
    public void update(Noticia noticia) {
        System.out.println(this.nome+" como pessoa fisica recebi a noticia toda:"+noticia.toString());
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public String getCpf() {
        return this.cpf;
    }
    
}
