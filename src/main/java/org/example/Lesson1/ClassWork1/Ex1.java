package org.example.Lesson1.ClassWork1;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("zadanie1(n) = " + zadanie1(n));
    }

    private static int zadanie1(int n) {
        int multi = 1, sum = 0;
        while (n != 0) {
            int m = n % 10;
            multi *= m;
            sum += m;
            n /= 10;
        }
        return multi - sum;
    }
}
