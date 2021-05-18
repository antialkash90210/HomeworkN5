//Extraterrestrial guests
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int r1, r2, r3;
        Scanner input = new Scanner(System.in);

        System.out.print("радиус поля: ");
        r1 = input.nextInt();
        System.out.print("первый радиус: ");
        r2 = input.nextInt();
        System.out.print("второй радиус: ");
        r3 = input.nextInt();

        if(r1>(r2+r3)){
            System.out.print("YES");
        }
        else{
            System.out.print("NO");
        }

    }
}
