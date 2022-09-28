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
public class RevistaFofoca implements Subject {
    private ArrayList<Observer> vetObserver;
    private ArrayList<Noticia> vetNoticia;
    
    public RevistaFofoca(){
//        System.out.println("0i");
        this.vetObserver = new ArrayList();
        this.vetNoticia = new ArrayList();
    }
    
    public void novaNoticia(Noticia noticia) {
        this.vetNoticia.add(noticia);
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
//        System.out.println("Tamanho:"+vetObserver.size());
        for (int i = 0; i < vetObserver.size(); i++) {
            Observer observer = vetObserver.get(i);
//            System.out.println("oooo");
            observer.update(this.vetNoticia.get(this.vetNoticia.size()-1));            
        }
    }
    
}
