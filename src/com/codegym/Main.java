package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = sc.nextInt();
        boolean checkPrime = true;
        if (number < 2) {
            checkPrime = false;
        } else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    checkPrime = false;
                    break;
                }
            }
        }
        if (checkPrime) {
            System.out.printf("%d is prime number", number);
        } else {
            System.out.printf("%d is not prime number", number);
        }
    }
}
