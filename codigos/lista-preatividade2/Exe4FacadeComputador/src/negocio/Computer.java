/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author iapereira
 */
public class Computer {
    private CPU cpu;
    private HardDrive hardDrive;
    private Memory memory;
    
    public Computer(){
        this.cpu = new CPU();
        this.hardDrive = new HardDrive();
        this.memory = new Memory();
    }
    
    public void run(){
        this.hardDrive.load();
        this.memory.readData();
        this.cpu.processData();
    }
    
}
