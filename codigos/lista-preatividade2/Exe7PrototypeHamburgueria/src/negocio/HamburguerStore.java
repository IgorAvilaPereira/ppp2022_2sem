/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import java.util.HashMap;

/**
 *
 * @author iapereira
 */
public class HamburguerStore {
    private HashMap<String, Hamburguer> vetHamburger;
    
    public HamburguerStore(){
        this.vetHamburger = new HashMap<>();
        
        Hamburguer da_casa = new Hamburguer();
        da_casa.setNome("da_casa");
        da_casa.setMolhoEspecial(true);
        da_casa.setPao(true);
        da_casa.setPreco(40);
        
        Hamburguer vegano = new Hamburguer();
        vegano.setNome("vegano");
        vegano.setMolhoEspecial(false);
        vegano.setPao(false);
        vegano.setPreco(1);
        
        
        this.vetHamburger.put(da_casa.getNome(), da_casa);
        this.vetHamburger.put(vegano.getNome(), vegano);
        
        
    }
    
    public Hamburguer getChave(String key) throws CloneNotSupportedException{
        if (this.vetHamburger.containsKey(key)) {
            return this.vetHamburger.get(key).clone();
        } else {
            throw new IllegalArgumentException("chave invalida");
        }
     }
    
}
