package com.lgs.lab.interface1;

import ua.lviv.lga.task02.Devide;
import ua.lviv.lga.task02.Minus;
import ua.lviv.lga.task02.Multiply;
import ua.lviv.lga.task02.Plus;

public interface Numerable extends Plus, Minus, Multiply, Devide {
    public double devFunction();
    public double minusFunction();
    public double multFunction();
    public double addFunсtion();

}
