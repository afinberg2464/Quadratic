package com.andrewfinberg;

import org.apache.commons.math3.complex.Complex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        boolean hasRealRoots;
        boolean negativeDiscriminant;
        double derivative;
        int isLarger;
        double root1;
        double root2;
        List<Double> realRoots = new ArrayList<>();
        List<Complex> complexRoots = new ArrayList<>();

        Quadratic quadratic1, quadratic2, quadratic3;

        quadratic1 = new Quadratic(2, 4, 7);
        hasRealRoots = quadratic1.hasRealRoots();
        negativeDiscriminant = quadratic1.negativeDiscriminant();
        derivative = quadratic1.derivative(1);
        realRoots = quadratic1.calculateRealRoots();
        complexRoots = quadratic1.calculateComplexRoots();

        quadratic2 = new Quadratic(1, 3, 6);
        hasRealRoots = quadratic2.hasRealRoots();
        negativeDiscriminant = quadratic2.negativeDiscriminant();
        derivative = quadratic2.derivative(4);
        realRoots = quadratic2.calculateRealRoots();
        complexRoots = quadratic2.calculateComplexRoots();

        quadratic3 = new Quadratic(0.45, 6.8, 2.23);
        hasRealRoots = quadratic1.hasRealRoots();
        negativeDiscriminant = quadratic1.negativeDiscriminant();
        derivative = quadratic1.derivative(1);
        realRoots = quadratic3.calculateRealRoots();
        complexRoots = quadratic3.calculateComplexRoots();

        isLarger = quadratic1.compareTo(quadratic3);
        isLarger = quadratic3.compareTo(quadratic2);
        isLarger = quadratic2.compareTo(quadratic1);

        ArrayList<Quadratic> quadraticArrayList = new ArrayList<>();
        quadraticArrayList.add(quadratic1);
        quadraticArrayList.add(quadratic2);
        quadraticArrayList.add(quadratic3);
        Collections.sort(quadraticArrayList);
    }
}
