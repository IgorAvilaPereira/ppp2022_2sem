/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author iapereira
 */
public class PessoaJuridica extends Pessoa {
    private String cnpj;

   @Override
    public void update(String titulo) {
        System.out.println(this.nome+" como pessoa juridica recebi a noticia com titulo:"+titulo);
    }

    @Override
    public void update(Noticia noticia) {
        System.out.println(this.nome+" como pessoa juridica recebi a noticia toda:"+noticia.toString());
    }
    
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
    public String getCnpj(){
        return this.cnpj;
    }
    
}
