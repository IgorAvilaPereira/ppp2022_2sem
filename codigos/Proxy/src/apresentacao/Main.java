/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
        // TODO code application logic here
        String filename = "desenho.jpg";
        ImageProxy imageProxy = new ImageProxy(filename);
        System.out.println("Ainda nao preciso acessar o image real");
        System.out.println("Retorna o nome:"+imageProxy.getFilename());
        System.out.println("Retorna dimensoes:"+imageProxy.getExtent().toString());
        System.out.println("===============================");
        System.out.println("Agora tive que instanciar o objeto image (realsubject)");
        imageProxy.draw();
    } 
}
