package org.example.Data;

public class ComplexNumber {

    private double realPart;
    private double imagePart;

    public ComplexNumber(double realPart, double imagPart) {
        this.realPart = realPart;
        this.imagePart = imagPart;
    }

    public double getRealPart() {
        return realPart;
    }

    public double getImagPart() {
        return imagePart;
    }

    @Override
    public String toString() {
        if (imagePart < 0) {
            return "ComplexNumber{" +
                    "realPart=" + realPart + "+" +
                    ", imagePart=" + imagePart + "i" +
                    '}';
        }
        else {
            return realPart + "+" + imagePart + "i";
        }
    }
}
