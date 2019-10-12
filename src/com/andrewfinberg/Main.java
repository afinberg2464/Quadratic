package com.andrewfinberg;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        // Create a few Quadratic objects
        Quadratic quadratic1, quadratic2, quadratic3;
        quadratic1 = new Quadratic(2, 4, 7);
        quadratic2 = new Quadratic(1, 3, 6);
        quadratic3 = new Quadratic(0.45, 6.8, 2.23);

        // Compare objects
        quadratic1.compareTo(quadratic3);
        quadratic3.compareTo(quadratic2);
        quadratic2.compareTo(quadratic1);

        // Create list of objects and sort
        ArrayList<Quadratic> quadraticArrayList = new ArrayList<>();
        quadraticArrayList.add(quadratic1);
        quadraticArrayList.add(quadratic2);
        quadraticArrayList.add(quadratic3);

        Collections.sort(quadraticArrayList);
    }
}
