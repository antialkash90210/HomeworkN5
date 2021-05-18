//Programmer's day
package com.company;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int y = in.nextInt();
        boolean isLeap = y % 4 == 0 && (y % 100 != 0 || y % 400 == 0);
        int d = isLeap ? 12 : 13;

        System.out.printf("%02d/09/%04d", d, y);



    }
}
