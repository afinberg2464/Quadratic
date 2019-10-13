package com.andrewfinberg;

import org.apache.commons.math3.complex.Complex;

import java.util.ArrayList;
import java.util.List;

public class Quadratic implements Comparable<Quadratic> {

    private double a;
    private double b;
    private double c;
    private double discriminant;
    private List<Double> realRoots = new ArrayList<>();
    private List<Complex> complexRoots = new ArrayList<>();

    /**
     * Default constructor of the Quadratic class
     */
    public Quadratic() {
        this(1, 0, 0);
    }

    /**
     * Constructor allows user to set the values of a, b, and c
     *
     * @param a Double value for the quadratic coefficient
     * @param b Double value for the linear coefficient
     * @param c Double value for the constant
     */
    public Quadratic(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.discriminant = (Math.pow(this.b, 2)) - (4 * this.a * this.c);

        if (this.a == 0) {
            throw new IllegalArgumentException("The value of 'a' cannot be 0");
        }
    }

    /**
     * Method sorts by the quadratic coefficient 'a'
     *
     * @param o Accepts second object for comparison
     * @return Result of the comparison
     */
    @Override
    public int compareTo(Quadratic o) {
        int result = 1;
        if (getA() <= o.getA())
            if (getA() < o.getA()) {
                result = -1;
            } else if (!(getA() > o.getA()))
                if (getA() < o.getA()) {
                    result = -1;
                } else {
                    result = 0;
                }
        return result;
    }

    /**
     * This method returns whether the quadratic equation
     * contains one real root, two real roots, or two complex roots
     *
     * @return Returns the appropriate String response to the user
     */
    public boolean hasRealRoots() {

        if (this.discriminant >= 0) {
            return true;
        }
        return false;
    }

    /**
     * This method returns whether the discriminant
     * is positive or negative
     *
     * @return Returns the appropriate String response to the user
     */
    public boolean negativeDiscriminant() {
        if (this.discriminant < 0) {
            return true;
        }
        return false;
    }

    /**
     * This method determines the roots of the quadratic
     *
     * @return Returns a HashMap of the roots
     */
    public List<Double> calculateRealRoots() {

        if (hasRealRoots() == true) {
            double root1 = (-this.b + Math.sqrt(this.discriminant)) / (2 * this.a);
            double root2 = (-this.b - Math.sqrt(this.discriminant)) / (2 * this.a);

            realRoots.add(root1);
            realRoots.add(root2);

            return realRoots;
        }
        return null;
    }

    public List<Complex> calculateComplexRoots() {

        if (hasRealRoots() == false) {
            double realPart = -this.b / (2 * this.a);
            double imaginaryPart = Math.sqrt(Math.abs(this.discriminant)) / (2 * this.a);

            Complex complex1 = new Complex(realPart, imaginaryPart);
            Complex complex2 = new Complex(realPart, -imaginaryPart);

            complexRoots.add(complex1);
            complexRoots.add(complex2);

            return complexRoots;
        }
        return null;
    }

    /**
     * This method accepts a value for 'x' and returns the derivative
     * of the quadratic equation
     *
     * @param x The value of 'x' provided by the user
     * @return Returns the derivative as a double
     */
    public double derivative(double x) {
        double derivative = (2 * this.a * x) + this.b;
        return derivative;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "Quadratic{" +
                "a = " + a +
                ", b = " + b +
                ", c = " + c +
                '}';
    }

}

