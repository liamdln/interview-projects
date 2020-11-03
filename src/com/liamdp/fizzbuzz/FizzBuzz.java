package com.liamdp.fizzbuzz;

public class FizzBuzz {

    public static void main(String[] args) {
        int maxNumber = 100;
        fizzBuzz(maxNumber);
    }

    public static void fizzBuzz(int maxNumber) {
        for (int i = 0; i <= maxNumber; i++) {
            if (i == 0) {
                System.out.println(i);
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FIZZBUZZ");
            } else if (i % 3 == 0) {
                System.out.println("FIZZ");
            } else if (i % 5 == 0) {
                System.out.println("BUZZ");
            } else {
                System.out.println(i);
            }
        }
    }

}
