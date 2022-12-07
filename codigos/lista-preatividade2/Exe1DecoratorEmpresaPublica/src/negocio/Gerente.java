/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author iapereira
 */
public class Gerente extends Cargo {

    @Override
    public double calcSalario() {
        return super.salario + 3000;
    }

    @Override
    public String mostraNome() {
        return "Gerente";
    }
    
}
