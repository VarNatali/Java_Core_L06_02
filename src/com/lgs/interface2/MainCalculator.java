package com.lgs.interface2;

import com.lgs.lab.interface1.Numerable;

public class MainCalculator {
    public static void main(String[] args) {
        Numerable num = new MyCalculator(1243.8, 23.44);

        System.out.println("Сума= " + num.addFunсtion());
        System.out.println("Різниця= " + num.minusFunction());
        System.out.println("Добуток= " + num.multFunction());
        System.out.println("Частка= " + num.devFunction());
    }
}
