package com.company.lesson5.homework.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double x, y;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ведіть значення довжини чотирикутника x = ");
        x = scanner.nextDouble();
        System.out.println("Ведіть значення ширини чотирикутника y = ");
        y = scanner.nextDouble();

        SquareRectangle squareRectangle = new SquareRectangle(x, y);
        System.out.println("Площа прямокутника = " + squareRectangle.Square());

        PerimeterRectangle perimeterRectangle = new PerimeterRectangle(x, y);
        System.out.println("Периметр прямокутника = " + perimeterRectangle.Perimeter());
    }
}
