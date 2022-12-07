/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author iapereira
 */
public abstract class Cargo {
    protected double salario;
    
    public Cargo(){
        this.salario = 1000;
    }
    
    public abstract double calcSalario();
    public abstract String mostraNome();
    
}
