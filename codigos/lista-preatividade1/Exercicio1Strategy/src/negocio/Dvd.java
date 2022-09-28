/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author iapereira
 */
public class Dvd extends Produto {
    private String urlCapa;
    
    public Dvd(String nome, double preco, String urlCapa){
        super();
        super.setNome(nome);
        super.setPreco(preco);
        this.urlCapa = urlCapa;
    }

    public String getUrlCapa() {
        return urlCapa;
    }

    public void setUrlCapa(String urlCapa) {
        this.urlCapa = urlCapa;
    }
    
    
    
}
