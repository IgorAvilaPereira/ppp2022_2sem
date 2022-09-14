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
public class PancakeMenuIterator implements Iterator {
    ArrayList menuItems;
    int position = 0;
    
    public PancakeMenuIterator(ArrayList menuItems){
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        if (this.position < this.menuItems.size()) {
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        Object objeto = this.menuItems.get(position);
        position++;
        return objeto;
        
    }
    
}
