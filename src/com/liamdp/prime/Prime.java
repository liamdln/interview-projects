package com.liamdp.prime;

public class Prime {

    public static void main(String[] args) {
        System.out.println(primeNumber(35593));
        System.out.println(primeNumber(2));
        System.out.println(primeNumber(1));
        System.out.println(primeNumber(4));
    }

    /**
     * Calculates if a number is a prime number or not.
     * @param number The number to test.
     * @return If the number is a prime number or not.
     */
    public static boolean primeNumber(int number) {
        if (number <= 0) {
            number *= -1;
        }
        if (number == 1 || number == 0) {
            return false;
        } else if (number == 2) {
            return true;
        } else {
            for (int i = 2; i <= number - 1; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

}
