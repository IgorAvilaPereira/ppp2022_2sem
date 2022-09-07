/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author iapereira
 */
public class MacroTvArCondicionadoCommand implements Command {
    private TvCommand tvCommand;
    private ArCondicionadoCommand arCondicionadoCommand;
    
    
    public MacroTvArCondicionadoCommand(TvCommand tvCommand, ArCondicionadoCommand arCondicionadoCommand){
        this.tvCommand = tvCommand;
        this.arCondicionadoCommand = arCondicionadoCommand;
    }

    @Override
    public void execute() {
        this.tvCommand.execute();
        this.arCondicionadoCommand.execute();
    }

    @Override
    public void undo() {
        this.tvCommand.undo();
        this.arCondicionadoCommand.undo();
        
    }
    
}
