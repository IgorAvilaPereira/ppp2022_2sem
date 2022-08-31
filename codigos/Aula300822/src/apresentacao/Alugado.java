/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apresentacao;

/**
 *
 * @author iapereira
 */
public class Alugado extends LivroState {

    private Livro livro;

    public Alugado(Livro livro) {
        System.out.println("Livro alugado");
        this.livro = livro;
    }

    @Override
    public LivroState realizarEmprestimo() {
        return this;
    }

    @Override
    public LivroState realizarEntrega() {
        return new Disponivel(this.livro);
    }

    @Override
    public LivroState realizarDano() {
        return new Danificado(this.livro);
    }

    @Override
    public LivroState realizarRestauracao() {
        throw new RuntimeException("n dá pra restaura algo ja alugado!");

    }

}
