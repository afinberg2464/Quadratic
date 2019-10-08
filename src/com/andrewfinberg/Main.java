package com.andrewfinberg;

import org.apache.commons.math3.complex.Complex;

public class Main {

    public static void main(String[] args) {

        Quadratic quadratic = new Quadratic(2, 4, 7);

        quadratic.toString();
        quadratic.negativeDiscriminant();
        quadratic.hasRealRoots();
        quadratic.derivative(1);
        quadratic.roots();

    }
}
