/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import static junit.framework.Assert.assertEquals;
import negocio.Matematica;
import org.junit.Test;


/**
 *
 * @author iapereira
 */
public class MatematicaTest {
    
    public MatematicaTest() {
    }
    
      
    @Test
    public void multiplicacao(){     
       assertEquals("Resultado:", 4, new Matematica().multiplicacao(2,2));
    }
    
    @Test
    public void divisao(){
       assertEquals("Resultado:", 1.0, new Matematica().divisao(2, 2));
    }
    
  
    
}
