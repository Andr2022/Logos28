package com.company.lesson5.homework.task1;

public class SquareRectangle extends Rectangle {
    public SquareRectangle(double length, double width) {
        super(length, width);
    }


    public double Square() {
        return getLength() * getWidth();
    }
}
