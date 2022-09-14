/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package apresentacao;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Vector;
import negocio.MenuItem;
import negocio.Waitress;

/**
 *
 * @author iapereira
 */
public class Main {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Waitress w = new Waitress();
        w.printMenu();

//        HashMap<Integer,Object> vet = new HashMap();
//        vet.put(0, new MenuItem("oi","ola", true, 0));
//        Class classDefinition = Class.forName("negocio.DinerMenu");
//        Object object = classDefinition.newInstance();
//        Method method = classDefinition.getDeclaredMethod("getMenuItems");
//        method.invoke(object);
//        System.out.println("Object: " + );
    }
}
