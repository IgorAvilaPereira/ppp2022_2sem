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
public class Telefone implements Subject {
    private ArrayList<Observer> vetObserver;
    private boolean tocando;
    
    public Telefone(){
        this.vetObserver = new ArrayList();
    }
    
    public void chamando() {
        this.tocando = true;
        this.notifyObservers();
    }
    

    @Override
    public void registerObserver(Observer observer) {
        this.vetObserver.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.vetObserver.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < vetObserver.size(); i++) {
            Observer observer = vetObserver.get(i);
            observer.update();            
        }
        this.tocando = false;
    }
    
}
