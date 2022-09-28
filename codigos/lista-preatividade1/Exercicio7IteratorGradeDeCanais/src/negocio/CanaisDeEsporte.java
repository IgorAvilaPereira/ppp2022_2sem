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
public class CanaisDeEsporte {

    private ArrayList<Canal> vetCanal;

    public CanaisDeEsporte() {

        this.vetCanal = new ArrayList();
        this.vetCanal.add(new Canal(539, "Sportv"));
        this.vetCanal.add(new Canal(578, "Fox"));

    }

    public ArrayList<Canal> getVetCanal() {
        return vetCanal;
    }

    public void setVetCanal(ArrayList<Canal> vetCanal) {
        this.vetCanal = vetCanal;
    }

}
