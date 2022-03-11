package com.bridgelabz;

import java.util.Scanner;

public class LineComparison {

    public static void main(String[] args) {
        System.out.println("Welcome to line comparison code");
        LineComparison LineComparison = new LineComparison();
        LineComparison.UC1();
        LineComparison.UC2();

    }
    public void UC1(){
        int x1, x2, y1, y2;

        double Dist;
        Scanner sc = new Scanner(System.in);

        System.out.println("enter x1 point: ");
        x1 = sc.nextInt();
        System.out.println("enter y1 point: ");
        y1 = sc.nextInt();
        System.out.println("enter x2point: ");
        x2 = sc.nextInt();
        System.out.println("enter y2 point: ");
        y2 = sc.nextInt();
        Dist = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        System.out.println("Distance Between" + "(" + x1 + "," + y1 + ")," + "(" + x2 + "," + y2 + ")===>" + Dist);

    }

    public void UC2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter start point of line ");
        int a1 = sc.nextInt();
        System.out.println("enter end point of line ");
        int a2 = sc.nextInt();
        System.out.println("enter start point of line ");
        int b1 = sc.nextInt();
        System.out.println("enter end point of  line ");
        int b2 = sc.nextInt();

        double length = Math.sqrt((a2 - a1) * 2 + (b2 - b1) * 2);
        String str = length + "";
        System.out.println("Length of first Line is :" + str);

        System.out.println("enter start point of line ");
        int x1 = sc.nextInt();
        System.out.println("enter end point of line ");
        int x2 = sc.nextInt();
        System.out.println("enter start point of line ");
        int y1 = sc.nextInt();
        System.out.println("enter end point of line ");
        int y2 = sc.nextInt();

        double length2 = Math.sqrt((x2 - x1) * 2 + (y2 - y1) * 2);
        String str1 = length2 + "";
        System.out.println("Length of second Line is :" + str1);


        if (str.equals(str1)) {
            System.out.println("lines are equal");
        } else {
            System.out.println("lines are not equal");
        }
    }
}
