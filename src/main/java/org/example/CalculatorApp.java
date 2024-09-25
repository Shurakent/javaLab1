package org.example;


public class CalculatorApp implements CalculatorAppInterface<Double> {

    @Override
    public Double sum(Double a, Double b) {
        return a + b;
    }

    @Override
    public Double sub(Double a, Double b) {
        return a - b;
    }

    @Override
    public Double div(Double a, Double b) {
        if (b==0) {
            try {
                throw new ArithmeticException();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        return a * 1.0 / b;
    }

    @Override
    public Double mul(Double a, Double b) {
        return a * b;
    }
}
