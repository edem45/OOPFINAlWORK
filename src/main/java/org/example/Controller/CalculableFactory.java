package org.example.Controller;


import org.example.Data.ComplexNumber;

public class CalculableFactory implements ICalculableFactory {

    public Calculable create(ComplexNumber primaryArg) {
        return new Calculator(primaryArg);
    }



}
