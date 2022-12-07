/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author iapereira
 */
public class Hamburguer implements Cloneable {
    private String nome;
    private boolean pao;
    private boolean molhoEspecial;
    private double preco;

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isPao() {
        return pao;
    }

    public void setPao(boolean pao) {
        this.pao = pao;
    }

    public boolean isMolhoEspecial() {
        return molhoEspecial;
    }

    public void setMolhoEspecial(boolean molhoEspecial) {
        this.molhoEspecial = molhoEspecial;
    }
    
    @Override
    public Hamburguer clone() throws CloneNotSupportedException{
        return (Hamburguer) super.clone();
    }
    
    
    
}
