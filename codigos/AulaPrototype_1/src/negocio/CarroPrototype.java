/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author iapereira
 */
public final class CarroPrototype {
    private double valorCompra;
    private String descricao;
    private int ano;
        
   
    
    private CarroPrototype(){
        valorCompra = 10000;
        descricao = "sem descricao";
        ano = 1990;
        
    }
    
    public static CarroPrototype clonar() {
        return new CarroPrototype();
        
    }

    @Override
    public String toString() {
        return "CarroPrototype{" + "valorCompra=" + valorCompra + ", descricao=" + descricao + ", ano=" + ano + '}';
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

  
    
    
    
    
}
