package com.lgs.interface2;

import com.lgs.lab.interface1.Numerable;

public class MyCalculator implements Numerable {
    private double a;
    private double b;

    public MyCalculator(double a, double b) {
        this.a = a;
        this.b = b;
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

    @Override
    public double multFunction() {
        return (this.a * this.b);
    }

    @Override
    public double minusFunction() {
        return (this.a - this.b);
    }

    @Override
    public double devFunction() {
        return (this.a / this.b);
    }

    @Override
    public double addFunсtion() {
        return (this.a + this.b);
    }
}
