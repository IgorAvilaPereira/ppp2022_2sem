/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author iapereira
 */
public class Configuracao {
    private static Configuracao INSTANCE = null;
    
    private String nomeAplicacao;
    private String idioma;
    private int tamanhoMaximo;
    
    private Configuracao(){
        this.idioma = "";
        this.nomeAplicacao = "";
        this.tamanhoMaximo = 0;
        
    }
    
    public static synchronized Configuracao getInstance(){
        if (INSTANCE == null){
            INSTANCE = new Configuracao();
        }
        return INSTANCE;
    }

    public String getNomeAplicacao() {
        return nomeAplicacao;
    }

    public void setNomeAplicacao(String nomeAplicacao) {
        this.nomeAplicacao = nomeAplicacao;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public int getTamanhoMaximo() {
        return tamanhoMaximo;
    }

    public void setTamanhoMaximo(int tamanhoMaximo) {
        this.tamanhoMaximo = tamanhoMaximo;
    }
    
    
    
}
