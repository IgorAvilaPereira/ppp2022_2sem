/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author iapereira
 */
public class CargoDecorator extends Funcionario {
    protected Funcionario funcionario;
    
    public CargoDecorator(Funcionario funcionario){
        this.funcionario = funcionario;
    }
    

    @Override
    public String getDescricao() {
        return this.funcionario.getDescricao()+"\n"+this.descricao;
    }

    @Override
    public double getSalario() {
        return this.salario + this.funcionario.getSalario();
    }
    
}
