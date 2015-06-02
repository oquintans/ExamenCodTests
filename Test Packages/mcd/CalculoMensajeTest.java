/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mcd;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author oquintansocampo
 */
public class CalculoMensajeTest {
    
    public CalculoMensajeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of setNumero1 method, of class Calculo.
     */
    @Test
    public void testSetNumero1() {
        System.out.println("setNumero1");
        int numero = 0;
        Calculo instance = new Calculo();
        instance.setNumero1(numero);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumero2 method, of class Calculo.
     */
    @Test
    public void testSetNumero2() {
        System.out.println("setNumero2");
        int numero = 0;
        Calculo instance = new Calculo();
        instance.setNumero2(numero);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerMCD method, of class Calculo.
     */
    @Test
    public void testObtenerMCD() {
        System.out.println("obtenerMCD");
        int num1 = 0;
        int num2 = 0;
        Calculo instance = new Calculo();
        int expResult = 0;
        int result = instance.obtenerMCD(num1, num2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
