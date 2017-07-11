package com.pipa.calc;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        GetInfo darbiba = new GetInfo();
        Scanner calc = new Scanner(System.in);
        System.out.println("What do you want to do?\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division");
        int izvele = calc.nextInt();

        if (izvele == 1) {
            darbiba.info();
            int cipars1 = darbiba.get1();
            int cipars2 = darbiba.get2();
            int rezultats = cipars1 + cipars2;
            System.out.println("The result is: " + rezultats);
        }
        else if (izvele == 2) {
            darbiba.info();
            int cipars1 = darbiba.get1();
            int cipars2 = darbiba.get2();
            int rezultats = cipars1 - cipars2;
            System.out.println("The result is: " + rezultats);
        }
        else if (izvele == 3) {
            darbiba.info();
            int cipars1 = darbiba.get1();
            int cipars2 = darbiba.get2();
            int rezultats = cipars1 * cipars2;
            System.out.println("The result is: " + rezultats);
        }
        else if (izvele == 4) {
            darbiba.info();
            int cipars1 = darbiba.get1();
            int cipars2 = darbiba.get2();
            int rezultats = cipars1 / cipars2;
            System.out.println("The result is: " + rezultats);
        }
        else {
            System.out.println("Incorrect input");
        }
    }

}
