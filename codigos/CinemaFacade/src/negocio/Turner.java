/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author iapereira
 */
class Turner {
    private Amplifier amplifier;
    private double frequency;
    
    public void on(){
        System.out.println("on turner");
    }
    
    public void off(){
        System.out.println("off turner");
    }
    
    public void enableAM(){
        System.out.println("enable AM");
    }
    
    public void enableFM(){
        System.out.println("enable FM");
    }
    
    public void setFrequency(double f){
        this.frequency = f;
        System.out.println("Set frequency:"+this.frequency);
    }
    
}
