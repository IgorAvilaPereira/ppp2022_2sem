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
public interface Subject {
    public void subscribe(Observer observer);  
    public void unsubscribe(int i);
    public void notification();
}
