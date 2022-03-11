package com.bridgelabz;

import java.util.Scanner;

public class LineComparison {

    public static void main(String[] args) {
        System.out.println("Welcome to line comparison code");
        LineComparison LineComparison = new LineComparison();
        LineComparison.UC1();
        LineComparison.UC2();
        LineComparison.UC3();
        LineComparison.UC4();

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

    public void UC3(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter start point of line ");
        int a1=sc.nextInt();
        System.out.println("enter end point of line ");
        int a2=sc.nextInt();
        System.out.println("enter start point of line ");
        int b1=sc.nextInt();
        System.out.println("enter end point of  line ");
        int b2=sc.nextInt();

        double length = Math.sqrt((a2 - a1) * 2 + (b2 - b1) * 2 );
        String str = length+"";
        System.out.println("Length of first Line is :" + str);

        System.out.println("enter start point of line ");
        int x1=sc.nextInt();
        System.out.println("enter end point of line ");
        int x2=sc.nextInt();
        System.out.println("enter start point of line ");
        int y1=sc.nextInt();
        System.out.println("enter end point of line ");
        int y2=sc.nextInt();


        double length2 = Math.sqrt((x2 - x1) * 2 + (y2 - y1) * 2 );
        String str1 = length2+"";
        System.out.println("Length of second Line is :" + str1);

        int var1 = str.compareTo( str1 );
        System.out.println("line comparison = "+var1);


        if(var1==0)
        {
            System.out.println("Lines are equal");
        }
        else if(var1 >=1)
        {
            System.out.println("first Line is greater-");
        }
        else if(var1 < 0)
        {
            System.out.println("first line is small-");
        }
        else
        {
            System.out.println("Not found");
        }

    }

    public void UC4(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter x co-ordinate of first point: ");
        int x1 = s.nextInt();
        System.out.println("Enter y co-ordinate of first point: ");
        int y1 = s.nextInt();
        System.out.println("Enter x co-ordinate of second point: ");
        int x2 = s.nextInt();
        System.out.println("Enter y co-ordinate of second point: ");
        int y2 = s.nextInt();

        System.out.println("Enter x co-ordinate of third point: ");
        int p1 = s.nextInt();
        System.out.println("Enter y co-ordinate of third point: ");
        int q1 = s.nextInt();
        System.out.println("Enter x co-ordinate of forth point: ");
        int p2 = s.nextInt();
        System.out.println("Enter y co-ordinate of forth point: ");
        int q2 = s.nextInt();
        LineComparison lc = new LineComparison();
        lc.lengthOfLines(x1, y1, x2, y2, p1, q1, p2, q2);
    }

    // length of the line
    private void lengthOfLines(int x1, int y1, int x2, int y2, int p1, int q1, int p2, int q2) {
        Double length_of_line1 = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        Double length_of_line2 = Math.sqrt((p2-p1)*(p2-p1)+(q2-q1)*(q2-q1));

        System.out.printf("length of 1st end points are : %.2f %n", length_of_line1);
        System.out.printf("length of 2nd end points are : %.2f %n", length_of_line2);
        equal(length_of_line1, length_of_line2);
        compare(length_of_line1, length_of_line2);
    }
    // Checking whether Two lines are equal or not
    private void equal(Double length_of_line1, Double length_of_line2) {
        boolean ans = length_of_line1.equals(length_of_line2);
        if(ans)
            System.out.println("Both lines are equal.");
        else
            System.out.println("Both lines are not equal.");
    }

    //  which line is greater
    private void compare(Double length_of_line1, Double length_of_line2) {
        int res = length_of_line1.compareTo(length_of_line2);
        if(res > 0)
            System.out.println("Length of first end points is greater than length of second end points");
        else if(res < 0)
            System.out.println("Length of first end points is less than length of second end points");
        else
            System.out.println("Both lines are equal.");

    }
}
