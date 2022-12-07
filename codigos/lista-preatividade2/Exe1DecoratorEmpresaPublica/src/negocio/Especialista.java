/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author iapereira
 */
public class Especialista extends Cargo {

    @Override
    public double calcSalario() {
        return super.salario + 2500;
    }

    @Override
    public String mostraNome() {
        return "Especialista";
    }
    
}
