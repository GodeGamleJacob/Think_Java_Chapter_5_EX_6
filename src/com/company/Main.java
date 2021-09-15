package com.company;

import java.util.Scanner;

public class Main {
    
    public static void calculate (double a, double b, double c) {

        double divide = 2/a;
        double square = Math.sqrt(Math.pow(b,2)-4*a*c);
        double xPlus = (-(b) + square)/divide;
        double xMinus = ((-b) - square)/divide;
        double root = Math.pow(b,2)-4*a*c;
        double plusResult = a*Math.pow(xPlus, 2) + b * xPlus + c;
        double minusResult = a*Math.pow(xMinus, 2) + b * xMinus + c;

        if (xMinus == xPlus) {
            System.out.println("There is only one, or no solution to this problem.");
        }
        else if (divide == 0) {
                System.out.println("You can't divide by zero.");
        }
        else if (root < 0) {
                System.out.println("You can't take the square root of a negative.");
        }
        else {
                System.out.print("+ result: ");
                System.out.println(plusResult);
                System.out.print("- result: ");
                System.out.println(minusResult);
            }
        }

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please state a value for a.");
        double a = scanner.nextDouble();
        System.out.println("Please state a value for b.");
        double b = scanner.nextDouble();
        System.out.println("Please state a value for c.");
        double c = scanner.nextDouble();

        calculate(a, b, c);
    }
}