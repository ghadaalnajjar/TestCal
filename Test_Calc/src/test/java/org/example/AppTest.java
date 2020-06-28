package org.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.validator.ValidateWith;

public class AppTest {

    @Test
    public void shouldAnswerWithTrue() {
        assertTrue( true );
    }
    @Test
    public void testadd(){
        double[] arr = { -7, 5, 3 };
        double result = App.add(arr);
        assertEquals(1, result, 0.001);
    }

    @Test
    public void testsub(){
        double[] arr = { -7, 5, 3 };
        double result = App.sub(arr);
        assertEquals(-15, result, 0.001);
    }

    @Test
    public void testDivideByZero(){
        double resultDiv = App.div(5, 0);
        assertTrue(Double.isInfinite(resultDiv));
        assertEquals(" Divide by zero gives infinity as result ", true, Double.isInfinite(resultDiv));

    }
}
