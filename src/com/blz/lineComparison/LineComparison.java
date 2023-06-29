package com.blz.lineComparison;

import java.util.Scanner;

public class LineComparison {
    public static void main(String[] args) {
        double x1, y1, x2, y2;
        double lengthOfLine1;
        System.out.println("Welcome to line Comparison Program");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of x1");
        x1 = scanner.nextDouble();
        System.out.println("Enter the value of x2");
        x2 = scanner.nextDouble();
        System.out.println("Enter the value of y1");
        y1 = scanner.nextDouble();
        System.out.println("Enter the value of y2");
        y2 = scanner.nextDouble();

        lengthOfLine1 = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        System.out.println("Length of line1 is : " + lengthOfLine1);

        double lengthOfLine2;
        double x3, y3, x4, y4;
        System.out.println("Enter the value of x3");
        x3 = scanner.nextDouble();
        System.out.println("Enter the value of y3");
        y3 = scanner.nextDouble();
        System.out.println("Enter the value of x4");
        x4 = scanner.nextDouble();
        System.out.println("Enter the value of y4");
        y4 = scanner.nextDouble();

        lengthOfLine2 = Math.sqrt(Math.pow((x4 - x3), 2) + Math.pow((y4 - y3), 2));
        System.out.println("Length of line2 is : " + lengthOfLine2);

        if (lengthOfLine1 == (lengthOfLine2)) {
            System.out.println("Length of line is equal ");
        } else if (lengthOfLine1 > lengthOfLine2) {
            System.out.println("Length of line1 is greater than line2");
        } else if (lengthOfLine1 < lengthOfLine2) {
            System.out.println("Length of line1 is less than line2");
        } else {
            System.out.println("Both lines are not equal");
        }
    }
}
