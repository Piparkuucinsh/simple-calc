package com.pipa.calc;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner calc = new Scanner(System.in);
        System.out.println("What do you want to do?\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division");
        int izvele = calc.nextInt();

        if (izvele == 1) {
            System.out.println("Enter the first number.");
            int cipars1 = calc.nextInt();
            System.out.println("Enter the second number.");
            int cipars2 = calc.nextInt();
            int rezultats = cipars1 + cipars2;
            System.out.println("Rezultats ir: " + rezultats);
        }
        else if (izvele == 2) {
            System.out.println("Enter the first number.");
            int cipars1 = calc.nextInt();
            System.out.println("Enter the second number.");
            int cipars2 = calc.nextInt();
            int rezultats = cipars1 - cipars2;
            System.out.println("Rezultats ir: " + rezultats);
        }
        else if (izvele == 3) {
            System.out.println("Enter the first number.");
            int cipars1 = calc.nextInt();
            System.out.println("Enter the second number.");
            int cipars2 = calc.nextInt();
            int rezultats = cipars1 * cipars2;
            System.out.println("Rezultats ir: " + rezultats);
        }
        else if (izvele == 4) {
            System.out.println("Enter the first number.");
            int cipars1 = calc.nextInt();
            System.out.println("Enter the second number.");
            int cipars2 = calc.nextInt();
            int rezultats = cipars1 / cipars2;
            System.out.println("Rezultats ir: " + rezultats);
        }
        else {
            System.out.println("Incorrect input");
        }
    }

}
