/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author iapereira
 */
public class CopiarCommand implements Command {
    private Documento documento;
    
    public CopiarCommand(Documento documento){
        this.documento = documento;
    }

    @Override
    public void execute() {
        System.out.println("Copiando documento...");
    }

 
    
}
