/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apresentacao;

/**
 *
 * @author iapereira
 */
public class Livro {
    private LivroState state;
    
    public Livro(){
        this.state = new Disponivel(this);
    }
    
    public void realizarEmprestimo(){
        this.state = this.state.realizarEmprestimo();
    }
    
    public void realizarEntrega(){
        this.state = this.state.realizarEntrega();
    }
    
    public void danificado(){
        this.state = this.state.realizarDano();
    }
    
    public void realizarRestauracao(){
        this.state = this.state.realizarRestauracao();
    }

    public LivroState getState() {
        return state;
    }

    public void setState(LivroState state) {
        this.state = state;
    }
    
   
    
    
    
}
