/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author iapereira
 */
public class DinerMenu {
    private static final int MAX_ITEMS = 6;
    private int numberOfItems = 0;
    private MenuItem[] menuItems;

    public DinerMenu() {
        this.menuItems = new MenuItem[MAX_ITEMS];
        this.addItem("Brocolis assado", "um maravilhoso brocolis assado", true, 10);
        this.addItem("Hot dog", "melhor hotdog da cidade", false, 20);

    }

    private void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (numberOfItems >= MAX_ITEMS) {
            System.err.println("Sorry");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems++;
        }
    }
    
//    public MenuItem[] getMenuItems(){
//        return this.menuItems;
//    }
    
    public Iterator createIterator(){
        return new DinerMenuIterator(this.menuItems);
    }
    
    public int getNumberOfItems(){
        return this.numberOfItems;
    }
}
