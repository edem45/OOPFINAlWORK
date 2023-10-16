package org.example;

import org.example.Controller.ConsoleLogger;
import org.example.Controller.ICalculableFactory;
import org.example.Controller.LogCalculableFactory;
import org.example.View.ViewCalculator;

public class Main {
    public static void main(String[] args) {
        ICalculableFactory calculableFactory = new LogCalculableFactory(new ConsoleLogger());
        ViewCalculator view = new ViewCalculator(calculableFactory);
        view.run();
    }
}