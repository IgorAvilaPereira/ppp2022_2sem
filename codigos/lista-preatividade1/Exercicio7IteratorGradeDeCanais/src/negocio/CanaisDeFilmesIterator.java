/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author iapereira
 */
public class CanaisDeFilmesIterator implements Iterator {

    private Canal[] vetCanal;
    private int posicao;
    
    public CanaisDeFilmesIterator(CanaisDeFilmes canaisDeFilmes){
        this.vetCanal = canaisDeFilmes.getVetCanal();
        this.posicao = 0;
    }

    @Override
    public boolean hasNext() {
        return this.posicao < this.vetCanal.length;
    }

    @Override
    public Canal next() {
        Canal canal = this.vetCanal[posicao];
        posicao++;
        return canal;
    }
    
}
