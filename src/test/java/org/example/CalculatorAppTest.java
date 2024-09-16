package org.example;

import junit.framework.TestCase;


/**
 * Unit test for simple App.
 */
public class CalculatorAppTest
    extends TestCase
{
    CalculatorApp calc = new CalculatorApp();

    private void testAssertEqualsSum(Double a, Double b, Double expected) {
        assertEquals(expected, calc.sum(a, b));
    }
    private void testAssertEqualsSub(Double a, Double b, Double expected) {
        assertEquals(expected, calc.sub(a, b));
    }

    private void testAssertEqualsMulti(Double a, Double b, Double expected) {
        assertEquals(expected, calc.mul(a, b));
    }
    private void testAssertEqualsDiv(Double a, Double b, Double expected) {
        assertEquals(expected, calc.div(a, b));
    }

    public void testSum(){
        testAssertEqualsSum(2.0, 2.0, 4.0);
    }
    public void testSub(){
        testAssertEqualsSub(2.0, 2.0, 0.0);
    }
    public void testMulti(){
        testAssertEqualsMulti(2.0, 2.0, 4.0);
    }
    public void testDiv(){
        testAssertEqualsDiv(4.0, 2.0, 2.0);
        testAssertEqualsDiv(4.0, 0.0, Double.MAX_VALUE);
    }
}
