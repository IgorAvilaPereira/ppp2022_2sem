/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author iapereira
 */
public class Livro extends Produto {
    private String isbn;
    private String sinopse;
    
    public Livro (String nome, double preco, String isbn, String sinopse) {
        super();
        super.setNome(nome);
        super.setPreco(preco);
        this.isbn = isbn;
        this.sinopse = sinopse;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }
    
    
    
}
