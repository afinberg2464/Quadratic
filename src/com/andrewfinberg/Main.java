package com.andrewfinberg;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        boolean hasRealRoots;
        boolean negativeDiscriminant;
        double derivative;
        int isLarger;

        Quadratic quadratic1, quadratic2, quadratic3;

        quadratic1 = new Quadratic(2, 4, 7);
        hasRealRoots = quadratic1.hasRealRoots();
        negativeDiscriminant = quadratic1.negativeDiscriminant();
        derivative = quadratic1.derivative(1);
        quadratic1.roots();

        quadratic2 = new Quadratic(1, 3, 6);
        hasRealRoots = quadratic2.hasRealRoots();
        negativeDiscriminant = quadratic2.negativeDiscriminant();
        derivative = quadratic2.derivative(4);
        quadratic2.roots();

        quadratic3 = new Quadratic(0.45, 6.8, 2.23);
        hasRealRoots = quadratic1.hasRealRoots();
        negativeDiscriminant = quadratic1.negativeDiscriminant();
        derivative = quadratic1.derivative(1);
        quadratic1.roots();

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
