/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apresentacao;

/**
 *
 * @author iapereira
 */
public class Danificado extends LivroState {

    private Livro livro;

    public Danificado(Livro livro) {
        System.out.println("Danificado.");
        this.livro = livro;
    }

    @Override
    public LivroState realizarEmprestimo() {
        throw new UnsupportedOperationException("Danificado"); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody

    }

    @Override
    public LivroState realizarEntrega() {
        throw new UnsupportedOperationException("Danificado"); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public LivroState realizarDano() {
        return this;
    }

    @Override
    public LivroState realizarRestauracao() {
        return new Disponivel(this.livro);
    }

}
