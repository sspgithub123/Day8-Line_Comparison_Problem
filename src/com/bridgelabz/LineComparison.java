package com.bridgelabz;

import java.util.Scanner;

public class LineComparison {

    public static void main(String[] args) {
        LineComparison LineComparison = new LineComparison();
        LineComparison.UC1();

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
}
