package com.pipa.calc;

import java.util.Scanner;

public class GetInfo {

    int cipars1;
    int cipars2;

    public void info() {
        Scanner calcGetInfo = new Scanner(System.in);
        System.out.println("Enter the first number.");
        cipars1 = calcGetInfo.nextInt();
        System.out.println("Enter the second number.");
        cipars2 = calcGetInfo.nextInt();
    }
    public int get1() {
        return cipars1;
    }
    public int get2() {
        return cipars2;
    }
}
