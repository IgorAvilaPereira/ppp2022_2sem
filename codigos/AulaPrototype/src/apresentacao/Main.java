/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apresentacao;

import negocio.CarroPrototype;
import negocio.FiestaPrototype;
import negocio.PalioPrototype;

/**
 *
 * @author iapereira
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CarroPrototype fiestaPrototipo = new FiestaPrototype();
        CarroPrototype palioPrototipo = new PalioPrototype();
        fiestaPrototipo.setValorCompra(10000);
        
        CarroPrototype fiesta1 = fiestaPrototipo.clonar();
        CarroPrototype fiesta2 = fiestaPrototipo.clonar();
        
        CarroPrototype palio1 = palioPrototipo.clonar();
        
        System.out.println(fiesta1.getValorCompra());
        System.out.println(fiesta1.getDescricao());
        System.out.println(fiesta1.getAno());
        fiesta2.setValorCompra(fiesta2.getValorCompra()+1000);
        System.out.println(fiesta2.getValorCompra());
        System.out.println(palio1.getAno());
        
        
        

    }
    
}
