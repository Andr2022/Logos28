package com.company.lesson5.homework.task1;

public class PerimeterRectangle extends Rectangle {
    public PerimeterRectangle(double length, double width) {
        super(length, width);
    }

    public double Perimeter() {
        return ((getLength() + getWidth()) * 2);
    }
}
