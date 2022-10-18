/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author iapereira
 */
public class Professor extends Funcionario {
    
    public Professor(){
        this.descricao = "Professor";
        this.salario = 1.0;
    }

    @Override
    public String getDescricao() {
        return this.descricao;
    }

    @Override
    public double getSalario() {
        return this.salario;
    }
    
}
