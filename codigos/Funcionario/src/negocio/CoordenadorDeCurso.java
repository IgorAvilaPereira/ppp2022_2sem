/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author iapereira
 */
public class CoordenadorDeCurso extends CargoDecorator {
    
    public CoordenadorDeCurso(Funcionario funcionario) {
        super(funcionario);
        this.descricao = "Coordenador";
        this.salario = 2.0;
    }
    
}
