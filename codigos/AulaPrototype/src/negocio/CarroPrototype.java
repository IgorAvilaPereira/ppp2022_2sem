/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author iapereira
 */
public abstract class CarroPrototype {
    protected double valorCompra;
    protected String descricao;
    protected int ano;
    
    public CarroPrototype(){
        this.descricao = "Modelo Generico";
        this.valorCompra = 1000;
        this.ano = 1990;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    

    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }
    
    public abstract String exibirInfo();
  
    public abstract CarroPrototype clonar();
    
    
}
