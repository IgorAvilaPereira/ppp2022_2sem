/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author iapereira
 */
public class Oi {

    // fatorial
    public int x(int z) {
        if (z < 0) {
            throw new IllegalArgumentException("xabum!");
        }
        if (z == 1 || z == 0) {
            return 1;
        } else {
            return z * x(z - 1);
        }
    }

    // eh primo
    public boolean w(int z) {
        if (z <= 1) {
            return false;
        }
        if (z == 2) {
            return true;
        }
        if (z % 2 == 0) {
            return false;
        }
        int o = 1;
        while (z % o != 0 || o != z) {
            o++;
        }
        return o == z;
    }

//    fibonacci
    public int y(int z) {
        if (z < 0) {
            throw new IllegalArgumentException("xabum!");
        }
        if (z == 0) {
            return 0;
        }
        if (z == 1 || z == 2) {
            return 1;
        } else {
            return y(z - 1) + y(z - 2);
        }
    }
}
