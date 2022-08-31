/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apresentacao;

/**
 *
 * @author iapereira
 */
public abstract class LivroState {

    public abstract LivroState realizarEmprestimo();

    public abstract LivroState realizarEntrega();

    public abstract LivroState realizarDano();
    
    public abstract LivroState realizarRestauracao();
}
