/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

/**
 *
 * @author iapereira
 */
public class DvdPlayer {
    private int volume;
    private int potencia;
    private String marca;
    private int qtdeDvds;
    private String formato;

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getQtdeDvds() {
        return qtdeDvds;
    }

    public void setQtdeDvds(int qtdeDvds) {
        this.qtdeDvds = qtdeDvds;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }
    
    public void on(){
        System.out.println("Ligando o DVD Player");
    }
    
    public void off(){
        System.out.println("Desligando Dvd Player");
    }    
    
    
    
}
