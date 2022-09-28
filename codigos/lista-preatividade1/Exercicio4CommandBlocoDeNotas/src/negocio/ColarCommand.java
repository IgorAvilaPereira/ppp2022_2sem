/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author iapereira
 */
public class ColarCommand implements Command {

    private Documento documento;

    public ColarCommand(Documento documento) {
        this.documento = documento;
    }

    @Override
    public void execute() {
        System.out.println("Colando documento....");
    }

}
