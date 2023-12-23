package com.lgs.interface2;

import com.lgs.lab.interface1.Numerable;

public class MainCalculator {
    public static void main(String[] args) {
        MyCalculator num = new MyCalculator(1243.8, 23.44);

        System.out.println("Можна в такому вигляді:");
        num.resView(num.addFunсtion());
        num.resView(num.minusFunction());
        num.resView(num.multFunction());
        num.resView(num.devFunction());

        System.out.println();
        System.out.println("А Можна в іншому вигляді:");
        System.out.println("Сума= " + num.addFunсtion());
        System.out.println("Різниця= " + num.minusFunction());
        System.out.println("Добуток= " + num.multFunction());
        System.out.println("Частка= " + num.devFunction());


    }
}
