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
public class ControladorResidencial {    
    private Command slot1[];
    private Command slot2[];
    
    public void setSlot1(Command on, Command off){
        this.slot1 = new Command[2];
        this.slot1[0] = on;
        this.slot1[1] = off;
    }
    
    
      public void setSlot2(Command on, Command off){
        this.slot2 = new Command[2];
        this.slot2[0] = on;
        this.slot2[1] = off;
    }


//    public Command getSlot2() {
//        return slot2;
//    }
//
//    public void setSlot2(Command slot2) {
//        this.slot2 = slot2;
//    }
    
    
    public void buttonOn1(){
        this.slot1[0].execute();
    }
    
    public void buttonOff1(){
        this.slot1[1].execute();
    }
    
    public void buttonOn2(){
        this.slot2[0].execute();
    }
    
    public void buttonOff2(){
        this.slot2[1].execute();
    }


      
}
