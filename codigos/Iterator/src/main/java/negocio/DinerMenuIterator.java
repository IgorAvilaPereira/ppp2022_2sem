/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author iapereira
 */
public class DinerMenuIterator implements Iterator {
    MenuItem items[];
    int position = 0;
    
    public DinerMenuIterator(MenuItem items[]) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if (this.position >= this.items.length || items[position] == null){
            return false;
        } 
        return true;
    }

    @Override
    public Object next() {
        MenuItem menuItem = items[position];
        position++;
        return menuItem;
    }
    
}
