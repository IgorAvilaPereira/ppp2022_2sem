/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author iapereira
 */
public class CanaisDeFilmes {
    private Canal vetCanal[];

    public CanaisDeFilmes() {
        this.vetCanal = new Canal[2];
        this.vetCanal[0] = new Canal(500, "tnt");
        this.vetCanal[1] = new Canal(602, "telecine");
    }
    
    

    public Canal[] getVetCanal() {
        return vetCanal;
    }

    public void setVetCanal(Canal[] vetCanal) {
        this.vetCanal = vetCanal;
    }
    
    
    
}
