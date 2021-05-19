package com.company;
import java.io.*;
import java.util.*;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args){
        int month;

        Scanner input = new Scanner(System.in);
        PrintWriter output = new PrintWriter(System.out);

        month = input.nextInt();
        try{
            switch (month)
            {
                case 12:
                case 1:
                case 2:
                    output.println("winter");
                    break;
                case 3:
                case 4:
                case 5:
                    output.println("spring");
                    break;
                case 6:
                case 7:
                case 8:
                    output.println("summer");
                    break;
                case 9:
                case 10:
                case 11:
                    output.println("autumn");
                    break;
                default:
                    output.println("Error");
                    break;
            }
        }
        catch (Exception e){
            output.println(e.getMessage());
        }

        output.flush();
    }
}


