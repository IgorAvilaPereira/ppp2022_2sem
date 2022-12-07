/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import static junit.framework.Assert.assertEquals;
import negocio.Oi;
import org.junit.Test;

/**
 *
 * @author iapereira
 */
public class OiTeste {

    @Test
    public void x() {
        Oi oi = new Oi();
        assertEquals(1, oi.x(0));
        assertEquals(1, oi.x(1));
        assertEquals(2, oi.x(2));
        assertEquals(6, oi.x(3));
        assertEquals(120, oi.x(5));
        assertEquals(720, oi.x(6));
    }

    @Test(expected = IllegalArgumentException.class)
    public void xNegativo() {
        Oi oi = new Oi();
        oi.x(-1);
    }

    @Test
    public void w() {
        Oi oi = new Oi();
        assertEquals(false, oi.w(-1));
        assertEquals(false, oi.w(0));
        assertEquals(false, oi.w(1));
        assertEquals(true, oi.w(2));
        assertEquals(true, oi.w(3));
        assertEquals(false, oi.w(4));
        assertEquals(true, oi.w(5));
        assertEquals(false, oi.w(6));

    }

    @Test
    public void y() {
        Oi oi = new Oi();
        assertEquals(0, oi.y(0));
        assertEquals(1, oi.y(1));
        assertEquals(1, oi.y(2));
        assertEquals(2, oi.y(3));
        assertEquals(3, oi.y(4));
        assertEquals(5, oi.y(5));
        assertEquals(8, oi.y(6));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void yNegativo(){
        Oi oi = new Oi();
        oi.y(-1);

    }


}
