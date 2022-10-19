/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author iapereira
 */
public class ImageProxy extends Graphic {

    private String fileName;
    private int dimensions[];
    private Image image;

    public ImageProxy(String filename, int dimensions[]) {
        this.fileName = filename;
        this.dimensions = dimensions;

    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public int[] getDimensions() {
        return dimensions;
    }

    public void setDimensions(int[] dimensions) {
        this.dimensions = dimensions;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }
    

    @Override
    public void draw() {
        System.out.println("Método inevitável: sou forçado a instanciar o objeto original e invocar o método que estava evitando");

        if (this.image == null) {
            this.image = new Image();
            this.image.setFileName(fileName);
            this.image.setDimensions(dimensions);
        }
        this.image.draw();
    }

    @Override
    public int[] dimensions() {
        System.out.println("Postergando ao máximo instanciar o objeto real");
        return this.dimensions;
    }

    @Override
    public void store() {
        System.out.println("Postergando ao máximo instanciar o objeto real");
        System.out.println("Filename:" + this.fileName);
    }

    @Override
    public void load() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
