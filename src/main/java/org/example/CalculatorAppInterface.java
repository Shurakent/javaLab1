package org.example;

public interface CalculatorAppInterface< T extends Number> {
    T sum(T a, T b);
    T sub(T a, T b);
    Double div(T a, T b);
    T mul(T a, T b);

}
