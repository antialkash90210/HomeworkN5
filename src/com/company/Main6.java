package com.company;

public class Main6 {
    public static void main(String[] args) {
        int number;

        for (int i = 0; i < 10; i++) {
            if (i == 0)
                continue;
            number = i * 7;
            System.out.println(i + " * 7 = " + number);
        }
    }
}
