/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apresentacao;

/**
 *
 * @author iapereira
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
//        Mario mario = new Mario();
//        mario.pegarCogumelo();
//        mario.pegarPena();
//        mario.dano();
//        mario.dano();
//        mario.dano();
        Livro livro = new Livro();
        livro.realizarEmprestimo();
        livro.realizarEntrega();
        livro.danificado();
        livro.realizarRestauracao();
        livro.realizarEmprestimo();
        livro.realizarEntrega();

        Class b = Class.forName("apresentacao.Livro");
        Livro c = (Livro) b.newInstance();
        System.out.println(c.getClass().getSimpleName());

    }

}
