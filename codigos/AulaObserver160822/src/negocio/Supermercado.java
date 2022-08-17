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
public class Supermercado implements Subject {
    private int caixaVago;
    private ArrayList<Observer> vetObserver;

    public Supermercado() {
        this.vetObserver = new ArrayList();
    }
    
    

    public int getCaixaVago() {
        return caixaVago;
    }

    public void setCaixaVago(int caixaVago) {
        this.caixaVago = caixaVago;
        this.notifyObservers();
//        if (this.vetObserver.size() > 0) {
//            this.unscribeObserver(this.vetObserver.get(0));
//        }
    }

    public ArrayList<Observer> getVetObserver() {
        return vetObserver;
    }

    public void setVetObserver(ArrayList<Observer> vetObserver) {
        this.vetObserver = vetObserver;
    }
    
    

    @Override
    public void subscribeObserver(Observer observer) {
        this.vetObserver.add(observer);
    }

    @Override
    public void unscribeObserver(Observer observer) {
        this.vetObserver.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < vetObserver.size(); i++) {
            Observer observer = vetObserver.get(i);
            observer.enviarNotificacao(this.caixaVago);            
        }
    }
    
}
