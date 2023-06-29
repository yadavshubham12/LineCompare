package com.blz.lineComparison;

import java.util.Scanner;

public class LineComparison {
    public static void main(String[] args) {
        System.out.println("Welcome to line Comparison Program");
        double x1, y1, x2, y2;
       double lengthOfLine;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of x1");
          x1 = scanner.nextDouble();
        System.out.println("Enter the value of x2");
         x2 = scanner.nextDouble();
        System.out.println("Enter the value of y1");
        y1 = scanner.nextDouble();
        System.out.println("Enter the value of y2");
        y2 = scanner.nextDouble();

        lengthOfLine = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2 - y1),2));
        System.out.println("Length of line is : " +lengthOfLine);




    }
}
