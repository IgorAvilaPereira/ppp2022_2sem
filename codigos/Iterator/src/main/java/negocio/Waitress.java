/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import java.util.ArrayList;

/**
 *
 * @author iapereira
 */
public class Waitress {

    private PancakeMenu pancakeMenu;
    private DinerMenu dinerMenu;

    public Waitress() {
        this.pancakeMenu = new PancakeMenu();
        this.dinerMenu = new DinerMenu();
    }

    public void printMenu() {
        
   
//        ArrayList vetMenuPancake = this.pancakeMenu.getMenuItems();
        Iterator pancakeIterator = this.pancakeMenu.createIterator();
//        MenuItem[] vetMenuDiner = this.dinerMenu.getMenuItems();
        Iterator dinerIterator = this.dinerMenu.createIterator();

        this.printMenu(pancakeIterator);
        this.printMenu(dinerIterator);

//        for (int i = 0; i < this.dinerMenu.getNumberOfItems(); i++) {
//            MenuItem menuItem = vetMenuDiner[i];
//            System.out.println("Name:" + menuItem.getName());
//        }
//        for (int i = 0; i < vetMenuPancake.size(); i++) {
//            MenuItem menuItem = (MenuItem) vetMenuPancake.get(i);
//            System.out.println("Name:" + menuItem.getName());
//        }
    }

    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.println("Name:" + menuItem.getName());
        }

    }

}
