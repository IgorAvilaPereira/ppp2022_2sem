/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author iapereira
 */
public class CopiarEColarCommand implements Command {

    private Documento documento;
    
    private CopiarCommand copiarCommand;
    private ColarCommand colarCommand;
    
    public CopiarEColarCommand(Documento documento){
        this.documento = documento;
        this.copiarCommand = new CopiarCommand(this.documento);
        this.colarCommand = new ColarCommand(this.documento);        
    }

    @Override
    public void execute() {
        this.copiarCommand.execute();
        this.colarCommand.execute();
    }
    
}
