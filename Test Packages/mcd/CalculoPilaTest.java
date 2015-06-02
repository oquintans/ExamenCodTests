/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mcd;

import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author oquintansocampo
 */
@RunWith(Parameterized.class)
public class CalculoPilaTest {

    private int no1, no2, expResult;
    Calculo calc;

    public CalculoPilaTest(int num1, int num2, int result) {
        this.no1 = num1;
        this.no2 = num2;
        this.expResult = result;
    }

    @Before
    public void initialize() {
        calc = new Calculo();
    }

    /**
     * Test of main method, of class Controlador.
     */
    @Parameterized.Parameters
    public static Collection primeNumbers() {
        return Arrays.asList(new Object[][]{
            {5, 3, 1},
            {6, 8, 2},
            {56, 10, 2},
            {3, 9, 3}
        });
    }

    @Test
    public void testMain() {
        System.out.println("Parameterized Number is : " + no1 + ", " + no2 + " ---> " + expResult);
        assertEquals(expResult,
                calc.obtenerMCD(no1, no2), 0.0);
    }
}
