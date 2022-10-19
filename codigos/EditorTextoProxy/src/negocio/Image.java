/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author iapereira
 */
public class Image extends Graphic {
    private String fileName;
    private String path;
    private int[] dimensions;

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public int[] getDimensions() {
        return dimensions;
    }

    public void setDimensions(int[] dimensions) {
        this.dimensions = dimensions;
    }
    
    

    @Override
    public void draw() {
        System.out.println("Renderizando a imagem");
    }

    @Override
    public int[] dimensions() {
        return this.dimensions;
    }

    @Override
    public void store() {
        System.out.println("Gravando a imagem...");
    }

    @Override
    public void load() {
        System.out.println("Carregando a imagem");
    }
    
}
