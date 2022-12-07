/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author iapereira
 */
public class Auxliar extends Cargo {

    @Override
    public double calcSalario() {
        return super.salario + 1000;
    }

    @Override
    public String mostraNome() {
        return "Auxiliar";
    }
    
}
