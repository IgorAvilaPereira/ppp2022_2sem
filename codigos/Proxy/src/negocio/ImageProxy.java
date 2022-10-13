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
public class ImageProxy implements Graphics {
    private String filename;
    private Extent extent;
    private Image image;

    public ImageProxy(String filename) {
        this.filename = filename;
        this.extent = new Extent(200, 200);

    }

    @Override
    public void draw() {
        if (this.image == null) {
            this.image = new Image(filename);
        }
        this.image.draw();
    }

    @Override
    public void load() {
        if (this.image == null) {
            this.image = new Image(filename);
        }
        this.image.load();

    }

    @Override
    public void store() {
        if (this.image == null) {
            this.image = new Image(filename);
        }
        this.image.store();
    }

    @Override
    public Extent getExtent() {
        if (this.image == null) {
            return this.extent;
        } else {
            return this.image.getExtent();
        }
    }

    @Override
    public String getFilename() {
        if (this.image == null) {
            return this.filename;
        } else {
            return this.image.getFilename();
        }
    }

}
