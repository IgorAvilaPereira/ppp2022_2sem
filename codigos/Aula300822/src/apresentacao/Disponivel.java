/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apresentacao;

/**
 *
 * @author iapereira
 */
public class Disponivel extends LivroState {

    private Livro livro;

    public Disponivel(Livro livro) {
        System.out.println("Livro Disponivel.");
        this.livro = livro;
    }

    @Override
    public LivroState realizarEmprestimo() {
        return new Alugado(this.livro);
    }

    @Override
    public LivroState realizarEntrega() {

        throw new RuntimeException("n dá pra entregar algo ja entregue!");

//        return this;
    }

    @Override
    public LivroState realizarDano() {
        return new Danificado(this.livro);
    }

    @Override
    public LivroState realizarRestauracao() {
        throw new RuntimeException("n dá pra restaura algo ja disponivel!");

    }

}
