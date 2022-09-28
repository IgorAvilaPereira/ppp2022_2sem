/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author iapereira
 */
public abstract class Produto {
    private String nome;
    private double preco;
    private Promocao promocao;
    
    public Produto(){
        this.promocao = new SemPromocao();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
//
//    public double getPreco() {
//        return preco;
//    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Promocao getPromocao() {
        return promocao;
    }

    public void setPromocao(Promocao promocao) {
        this.promocao = promocao;
    }
    
    public double calcPreco(){
        return this.preco*this.promocao.descontar();
    }
    
}
