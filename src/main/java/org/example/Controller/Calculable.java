package org.example.Controller;

import org.example.Controller.Calculator;
import org.example.Data.ComplexNumber;

public interface Calculable {

    Calculator sum(ComplexNumber arg);
    Calculator sub(ComplexNumber arg);
    Calculator multi(ComplexNumber arg);
    Calculator divide(ComplexNumber arg);


    ComplexNumber getResult();

}