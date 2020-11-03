package com.liamdp.fibonacci;

public class Fibonacci {

    public static void main(String[] args) {

        int numberOfFiboRuns = 12;

        for (int i = 1; i<= numberOfFiboRuns; i++) {
            System.out.println(fibo(i));
        }

        for (int i = 1; i<= numberOfFiboRuns; i++) {
            System.out.println(fiboNonRec(i));
        }
    }

    /**
     * Fibo recursively calculates the fibonacci number at index of param number.
     * @param number Index of the fibonacci number we want to get.
     * @return Fibonacci number at index of param number.
     */
    public static int fibo(int number) {
        if (number <= 0) {
            return 0;
        } else if (number == 1 || number == 2) {
            return 1;
        } else {
            return fibo(number - 1) + fibo(number - 2);
        }
    }

    /**
     * FiboNonRec calculates the fibonacci number at the index of param number non recursively.
     * @param number Index of the fibonacci number we want to get.
     * @return Fibonacci number at index of param number.
     */
    public static int fiboNonRec(int number) {
        if (number <= 0) {
            return 0;
        } else if (number == 1 || number == 2) {
            return 1;
        } else {
            int numOne = 1;
            int numTwo = 1;
            int fullFibo = 1;
            for (int i = 3; i <= number; i++) {
                fullFibo = numOne + numTwo;
                numOne = numTwo;
                numTwo = fullFibo;
            }
            return fullFibo;
        }
    }

}
