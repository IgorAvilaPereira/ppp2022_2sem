/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.util.ArrayList;

/**
 *
 * @author iapereira
 */
public class Painel implements Subject {
    private ArrayList<Observer> vetObserver;
    private int nroCaixa;
    
    public Painel(){
        this.vetObserver = new ArrayList();
        this.nroCaixa = 0;
    }

    public ArrayList<Observer> getVetObserver() {
        return vetObserver;
    }

    public void setVetObserver(ArrayList<Observer> vetObserver) {
        this.vetObserver = vetObserver;
    }

    public int getNroCaixa() {
        return nroCaixa;
    }

    public void setNroCaixa(int nroCaixa) {
        this.nroCaixa = nroCaixa;
        this.notification();
    }
    
    

    @Override
    public void subscribe(Observer observer) {
        this.vetObserver.add(observer);
    }

    @Override
    public void unsubscribe(int i) {
        this.vetObserver.remove(i);
    }

    @Override
    public void notification() {
        for (int i = 0; i < vetObserver.size(); i++) {
            Observer o = vetObserver.get(i);
            o.update(this.nroCaixa);            
        }
    }   
}
