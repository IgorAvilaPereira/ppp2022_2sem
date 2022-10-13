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
public class Extent {
    private double width;
    private double heigth;

    public Extent(int w, int h) {
        this.width = w;
        this.heigth = h;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeigth() {
        return heigth;
    }

    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }
    
    public String toString(){
        return "Width:"+this.width+" Heigth:"+this.heigth;
    }
    
}
