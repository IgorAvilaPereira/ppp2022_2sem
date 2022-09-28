/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apresentacao;

import negocio.BlocoDeNotas;
import negocio.ColarCommand;
import negocio.Documento;
import negocio.CopiarCommand;
import negocio.CopiarEColarCommand;

/**
 *
 * @author iapereira
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Documento documento = new Documento();
        BlocoDeNotas bloco = new BlocoDeNotas();
//        bloco.setMenu(new CopiarCommand(documento));
//        bloco.executeCommand();
//          bloco.setMenu(new ColarCommand(documento));
//          bloco.executeCommand();
        bloco.setMenu(new CopiarEColarCommand(documento));
        bloco.executeCommand();
    }
    
}
