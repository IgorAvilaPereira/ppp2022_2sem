/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import java.util.HashMap;

/**
 *
 * @author iapereira
 */
public class DocumentRegistry {
    private static final DocumentRegistry INSTANCE = new DocumentRegistry();
    private final HashMap<String, Documento> registry;
    
    private DocumentRegistry(){
        this.registry = new HashMap<>();
        
        Documento pdf = new Documento();
        pdf.setLocalizacao("/home/iapereira/pdfs");
        pdf.setNome("teste.pdf");
        pdf.setTipo("pdf");
        pdf.setVisualidade("privada");
        pdf.setIcone("pdf.icon");
        this.registry.put("pdf", pdf);
        
        
        Documento odt = new Documento();
        odt.setLocalizacao("/home/iapereira/odts");
        odt.setTipo("odt");
        this.registry.put("odt", odt);
        
        Documento mp3 = new Documento();
        mp3.setLocalizacao("/home/iapereira/Musicas");
        mp3.setTipo("mp3");
        mp3.setVisualidade("publica");
        this.registry.put("mp3", mp3);
        
    }
    
    public synchronized static DocumentRegistry getInstance(){
        return INSTANCE;
    }
    
    public Documento getDocumento(String key) throws CloneNotSupportedException{
        if (INSTANCE.registry.containsKey(key)) {
            return INSTANCE.registry.get(key).clone();
        } else {
            throw new IllegalArgumentException("chave invalida");
        }
    }
    
    public void addDocumentoPrototype(String key, Documento documento){
        INSTANCE.registry.put(key, documento);
    }

//    public HashMap<String, Documento> getRegistry() {
//        return registry;
//    }
    
    
    
}
