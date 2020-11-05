package com.liamdp.factorial;

public class Factorial {

    public static void main(String[] args) {

        System.out.println(factorial(4));
        System.out.println(factorialRecursive(4));

        // long will quit when the number gets too big, I've see it roll over to negative and just return 0.
        // Look into this if you're using largeeeeeeeeee numbers:
        // https://docs.oracle.com/javase/8/docs/api/java/math/BigInteger.html

    }

    /**
     * Calculates the factorial of a number non recursively.
     * @param number Number to run the factorial function on.
     * @return The factorial of the number.
     */
    public static long factorial(long number) {
        if (number == 1 || number == 0) {
            return 1;
        }
        long total = 1;
        while (number > 1) {
            total *= number;
            number --;
        }
        return total;
    }

    /**
     * Calculates the factorial of a number recursively.
     * @param number Number to run the factorial function on.
     * @return The factorial of the number.
     */
    public static long factorialRecursive(long number) {
        if (number == 1 || number == 0) {
            return 1;
        } else {
            return number * factorialRecursive(number - 1);
        }
    }

}
