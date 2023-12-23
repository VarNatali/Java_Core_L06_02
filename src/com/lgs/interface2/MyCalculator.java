package com.lgs.interface2;

import com.lgs.lab.interface1.Numerable;

public class MyCalculator implements Numerable {
     double a;
     double b;

    public MyCalculator(double a, double b) {
        this.a = a;
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

     public void resView(double res){
        System.out.println("Result= " +res);    }


}
