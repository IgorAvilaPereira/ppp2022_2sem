/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import negocio.DataIgor;
import negocio.Fruta;
import negocio.Vitamina;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;

/**
 *
 * @author iapereira
 */
public class MinhaClasseDeTeste {
    
    @BeforeClass
    public static void antesDeTudo(){
        System.out.println("Antes de tudo");
    }
    
    @AfterClass
    public static void depoisDeTudo(){
        System.out.println("depois de tudo");
    }
    
    @Before
    public void antesDeCadaTeste(){
        System.out.println("Hello World!");
    }
    @After
    public void depoisDeCadaTeste(){
        System.out.println("Hello World Final");
    }
    
    @Ignore
    public void teste1() {
        Fruta maca = new Fruta();
        maca.setNome("maca");
        Vitamina a = new Vitamina();
        a.setNome("a");
        a.setSigla("a");  
        maca.adicionarVitamina(a); 
        assertEquals("a", maca.getListVitamina().get("a").getSigla());
    }
    
    @Test
    public void teste2(){
                System.out.println("Teste2");

        DataIgor dataIgor = new DataIgor(20,01,1987);
        assertEquals("20/01/1987", dataIgor.toString());
    }
    
    @Test
    public void teste3(){
        DataIgor data1 = new DataIgor(20, 01, 1987);
        DataIgor data2 = new DataIgor(20, 01, 1987);
        assertTrue(data1.equals(data2));
        
    }
    
    @Test
    public void teste4(){
        DataIgor dataIgor = new DataIgor();
        assertEquals(1, dataIgor.dia);
        assertEquals(1, dataIgor.mes);
        assertEquals(1900, dataIgor.ano);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testeFatorial(){
        DataIgor data = new DataIgor();
        data.fatorial(-1);
    }
    
    
    @Test(timeout = 0)
    public void testeFatorial2(){
        DataIgor dataIgor = new DataIgor();
        assertEquals(3628800,dataIgor.fatorial(10));
    }
    
    @Test
    public void testeConstrutorInvertido(){
        DataIgor data1 = new DataIgor(20, 01, 1987);
        DataIgor data2 = new DataIgor(1987,01,20);
        assertTrue(data1.equals(data2));
   
    }
    
    @Test
    public void ehbissexto(){
        assertTrue(new DataIgor(01, 01, 2020).ehBissexto());
    }
}
