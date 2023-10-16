package org.example.Controller;

import org.example.Controller.Calculable;
import org.example.Data.ComplexNumber;

public interface ICalculableFactory {

    Calculable create(ComplexNumber primaryArg);

}