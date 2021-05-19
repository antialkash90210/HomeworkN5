package com.company;
import java.io.*;
import java.util.*;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int radiusField;
        int radius1;
        int radius2;

        Scanner input = new Scanner(System.in);
        PrintWriter output = new PrintWriter(System.out);

        radiusField = input.nextInt();
        radius1 = input.nextInt();
        radius2 = input.nextInt();
        int sum = radius1 + radius2;

        if (radiusField >= sum) {
            output.println("YES");
        }
        else {
            output.println("NO");
        }
        output.flush();
    }
}