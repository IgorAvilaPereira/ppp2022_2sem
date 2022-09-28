/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import java.util.ArrayList;

/**
 *
 * @author iapereira
 */
public class CanaisDeEsporteIterator implements Iterator {

    private ArrayList<Canal> vetCanal;
    private int posicao;
    
    
    public CanaisDeEsporteIterator(CanaisDeEsporte canaisDeEsporte){
        this.vetCanal = canaisDeEsporte.getVetCanal();
        this.posicao = 0;
    }

    @Override
    public boolean hasNext() {
        return posicao < this.vetCanal.size();
    }

    @Override
    public Canal next() {
        Canal canal = this.vetCanal.get(posicao);
        posicao++;
        return canal;
    }
    
}
