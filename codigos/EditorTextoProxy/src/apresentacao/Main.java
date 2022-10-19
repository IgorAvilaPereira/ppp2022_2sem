/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apresentacao;

import negocio.ImageProxy;

/**
 *
 * @author iapereira
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ImageProxy imageProxy = new ImageProxy("igor.png", new int[]{200, 200});
        System.out.println(imageProxy.getFileName());
        System.out.println(imageProxy.getDimensions()[0] + "," + imageProxy.getDimensions()[1]);
        imageProxy.draw();

    }

}
