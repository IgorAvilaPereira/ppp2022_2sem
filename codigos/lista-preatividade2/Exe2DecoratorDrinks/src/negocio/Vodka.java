/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author iapereira
 */
public class Vodka extends Coquetel {

    @Override
    public double getPreco() {
        return super.preco + 100;
    }

    @Override
    public String getNome() {
        return "Vodka";
    }
    
}
