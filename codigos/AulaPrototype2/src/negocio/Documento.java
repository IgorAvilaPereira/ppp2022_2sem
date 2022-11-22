/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author iapereira
 */
public final class Documento implements Cloneable {
    private String nome;
    private String localizacao;
    private String tipo;
    private String visualidade;
    private String icone;

    public String getIcone() {
        return icone;
    }

    public void setIcone(String icone) {
        this.icone = icone;
    }
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getVisualidade() {
        return visualidade;
    }

    public void setVisualidade(String visualidade) {
        this.visualidade = visualidade;
    }
    
    public Documento clone() throws CloneNotSupportedException{
        return (Documento) super.clone();
    }

    @Override
    public String toString() {
        return "Documento{" + "nome=" + nome + ", localizacao=" + localizacao + ", tipo=" + tipo + ", visualidade=" + visualidade + ", icone=" + icone + '}';
    }

   
    
    
    
}
