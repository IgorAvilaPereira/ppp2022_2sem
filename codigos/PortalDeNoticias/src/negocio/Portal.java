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
public class Portal implements Subject {

    private ArrayList<Noticia> vetNoticia;
    private ArrayList<Observer> vetAssinante;

    public Portal() {
        this.vetAssinante = new ArrayList();
        this.vetNoticia = new ArrayList();
    }

    public void addNoticia(Noticia novaNoticia) {
        this.vetNoticia.add(novaNoticia);
        this.notifyObservers();
    }

    public ArrayList<Observer> getVetAssinante() {
        return vetAssinante;
    }

    public void setVetAssinante(ArrayList<Observer> vetAssinante) {
        this.vetAssinante = vetAssinante;
    }

    @Override
    public void subscribeObserver(Observer observer) {
        this.vetAssinante.add(observer);
    }

    @Override
    public void unscribeObserver(Observer observer) {
        this.vetAssinante.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < vetAssinante.size(); i++) {
            Observer observer = vetAssinante.get(i);
            observer.update(this.vetNoticia.get(this.vetNoticia.size() - 1));

        }
    }

}
