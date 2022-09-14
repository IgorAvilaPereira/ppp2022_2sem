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
public class PancakeMenu {

    private ArrayList menuItems;

    public PancakeMenu() {
        this.menuItems = new ArrayList();
        this.addItem("Panqueca de carne", "carne", true, 10);
        this.addItem("Panqueca de calabresa", "calabresa", false, 20);
    }

    private void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        this.menuItems.add(menuItem);

    }

    public ArrayList getMenuItems() {
        return this.menuItems;
    }

    public Iterator createIterator() {
        return new PancakeMenuIterator(this.menuItems);
    }

}
