/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apresentacao;

import negocio.DocumentRegistry;
import negocio.Documento;

/**
 *
 * @author iapereira
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws CloneNotSupportedException  {        
        DocumentRegistry documentRegistry = DocumentRegistry.getInstance();
        
        Documento novoODT = documentRegistry.getDocumento("odt");
        novoODT.setNome("novo odt");
        System.out.println("Novo ODT:");
        System.out.println(novoODT);
        
        
        Documento novoPDF = documentRegistry.getDocumento("pdf");
        novoPDF.setNome("novoPDF.pdf");
        novoPDF.setVisualidade("publica");
        System.out.println("NovoPDF");
        System.out.println(novoPDF);
        
        Documento novoMP3 = documentRegistry.getDocumento("mp3");
        novoMP3.setNome("kid abelha.mp3");
        System.out.println(novoMP3);
        
        Documento ppt = new Documento();
        ppt.setNome("exemplo.ppt");
        ppt.setTipo("ppt");
        ppt.setLocalizacao("/home/iapereira/slides/");
        ppt.setVisualidade("publica");
        
        documentRegistry.addDocumentoPrototype("ppt", ppt);
       
        Documento novoPPT = documentRegistry.getDocumento("ppt");
        System.out.println(novoPPT);
        
        
        
       
    }
    
}
