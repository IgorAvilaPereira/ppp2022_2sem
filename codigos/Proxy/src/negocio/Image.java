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
public class Image implements Graphics {
    private String filename;
    private String location;
    private Extent extent;

    public Image(String filename) {
        this.filename = filename;
        this.load();
    }

    public Image() {
    }
    
    
    
    @Override
    public void draw() {
        System.out.println("Renderizando a imagem....");
    }

    @Override
    public void load() {
        System.out.println("Buscando a imagem no HD...");
        System.out.println("Atualizando dimensoes da imagem...");
        this.extent = new Extent(400, 20);
        
    }

    @Override
    public void store() {
        System.out.println("Salvando a imagem....");
    }

    @Override
    public Extent getExtent() {
        return this.extent;
    }

    @Override
    public String getFilename() {
        return this.filename;
    }
    
}
