package com.andrewfinberg;

import org.apache.commons.math3.complex.Complex;

import java.util.HashMap;

public class Quadratic implements Comparable<Quadratic> {

    private double a;
    private double b;
    private double c;
    private double discriminant;

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
    public HashMap roots() {
        double root1;
        double root2;

        /**
         * If the discriminant is greater than zero
         * Return the two real roots
         */
        if (this.discriminant > 0) {
            HashMap<Integer, Double> roots = new HashMap<>();

            root1 = (-this.b + Math.sqrt(this.discriminant)) / (2 * this.a);
            root2 = (-this.b - Math.sqrt(this.discriminant)) / (2 * this.a);

            roots.put(0, root1);
            roots.put(1, root2);

            return roots();

            /**
             * If the discriminant is less than zero
             * Return the two complex roots
             */
        } else if (this.discriminant < 0) {
            HashMap<Integer, Complex> roots = new HashMap<>();

            double realPart = -this.b / (2 * this.a);
            double imaginaryPart = Math.sqrt(Math.abs(this.discriminant)) / (2 * this.a);

            Complex complex1 = new Complex(realPart, imaginaryPart);
            Complex complex2 = new Complex(realPart, -imaginaryPart);

            roots.put(0, complex1);
            roots.put(1, complex2);

            return roots;

            /**
             * If the discriminant is zero
             * Return zero as the only real root
             */
        } else {
            HashMap<Integer, Integer> roots = new HashMap<>();
            roots.put(0, 0);
            return roots;
        }
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

