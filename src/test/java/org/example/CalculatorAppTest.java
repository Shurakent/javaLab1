package org.example;
import static junit.framework.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class CalculatorAppTest{
    private CalculatorApp calculator;

    @BeforeEach
    void setUp() {
        calculator = new CalculatorApp();
    }

    // Тесты для метода sum
    @Test
    void testSumPositiveNumbers() {
        assertEquals(5.0, calculator.sum(2.0, 3.0), 0.001);
    }

    @Test
    void testSumNegativeNumbers() {
        assertEquals(-5.0, calculator.sum(-2.0, -3.0), 0.001);
    }

    @Test
    void testSumWithZero() {
        assertEquals(2.0, calculator.sum(2.0, 0.0), 0.001);
    }

    // Тесты для метода sub
    @Test
    void testSubPositiveNumbers() {
        assertEquals(1.0, calculator.sub(3.0, 2.0), 0.001);
    }

    @Test
    void testSubNegativeNumbers() {
        assertEquals(1.0, calculator.sub(-2.0, -3.0), 0.001);
    }

    @Test
    void testSubWithZero() {
        assertEquals(2.0, calculator.sub(2.0, 0.0), 0.001);
    }

    // Тесты для метода mul
    @Test
    void testMulPositiveNumbers() {
        assertEquals(6.0, calculator.mul(2.0, 3.0), 0.001);
    }

    @Test
    void testMulNegativeNumbers() {
        assertEquals(-6.0, calculator.mul(-2.0, 3.0), 0.001);
    }

    @Test
    void testMulWithZero() {
        assertEquals(0.0, calculator.mul(2.0, 0.0), 0.001);
    }

    // Тесты для метода div
    @Test
    void testDivPositiveNumbers() {
        assertEquals(2.0, calculator.div(6.0, 3.0), 0.001);
    }

    @Test
    void testDivNegativeNumbers() {
        assertEquals(-2.0, calculator.div(-6.0, 3.0), 0.001);
    }

    @Test
    void testDivByZeroThrowsException() {
        RuntimeException exception = assertThrows(RuntimeException.class, () -> calculator.div(6.0, 0.0));
        assertTrue(exception.getCause() instanceof ArithmeticException);
    }

    @Test
    void testDivWithZeroNumerator() {
        assertEquals(0.0, calculator.div(0.0, 2.0), 0.001);
    }
//    private CalculatorApp calc;
//    @Override
//    protected void setUp() throws Exception {
//        super.setUp();
//        calc = new CalculatorApp();
//    }
//    private void testAssertEqualsSum(Double a, Double b, Double expected) {
//        assertEquals(expected, calc.sum(a, b));
//    }
//    private void testAssertEqualsSub(Double a, Double b, Double expected) {
//        assertEquals(expected, calc.sub(a, b));
//    }
//
//    private void testAssertEqualsMulti(Double a, Double b, Double expected) {
//        assertEquals(expected, calc.mul(a, b));
//    }
//    private void testAssertEqualsDiv(Double a, Double b, Double expected) {
//        assertEquals(expected, calc.div(a, b));
//    }
//
//    public void testSum(){
//        testAssertEqualsSum(2.0, 2.0, 4.0);
//    }
//    public void testSub(){
//        testAssertEqualsSub(2.0, 2.0, 0.0);
//    }
//    public void testMulti(){
//        testAssertEqualsMulti(2.0, 2.0, 4.0);
//    }
//    public void testDiv(){
//        testAssertEqualsDiv(4.0, 2.0, 2.0);
//    }
//    public void testDivByZero() {
//        try {
//            calc.div(4.0, 0.0); // Ожидается ArithmeticException
//            fail("Expected ArithmeticException to be thrown");
//        } catch (ArithmeticException e) {
//            // Успешный тест, исключение выброшено
//        }
//    }
}
