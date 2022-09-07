/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author iapereira
 */
public class ArCondicionadoCommand implements Command {
    private ArCondicionado ArCondicionado;
    
    public ArCondicionadoCommand(ArCondicionado arCondicionado){
        this.ArCondicionado = arCondicionado;
    }
    
    @Override
    public void execute() {
        System.out.println("Ligando o ar condicionado");
        this.ArCondicionado.on();
    }

    @Override
    public void undo() {
        System.out.println("Desligando o ar condicionado com timer de 3 segundos");
        this.ArCondicionado.sleepMode(3000);
    }
    
}
