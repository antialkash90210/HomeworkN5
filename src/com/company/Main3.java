//Programmer's day
package com.company;

import java.io.*;
import java.util.*;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter output = new PrintWriter(System.out);

        int y = in.nextInt();

        boolean isLeap = y % 4 == 0 && (y % 100 != 0 || y % 400 == 0);
        int d = isLeap ? 12 : 13;

        output.printf("%02d/09/%04d", d, y);

        output.flush();
    }
}


//    public static void main(String[] args) {
//
//        Scanner input = new Scanner(System.in);
//        PrintWriter output = new PrintWriter(System.out);
//
//        final int month = 9;
//        int year,day;
//
//        year = input.nextInt();
//
//        if ((year % 400 == 0) ||
//                (year % 4 == 0 && year%100 !=0)){
//            day = 12;
//        }
//        else {
//            day = 13;
//        }
//        output.printf("%02d/%02d/%04d", day,month,year);
//        output.flush();
//    }
