package com.liamdp.prime;

public class Prime {

    public static void main(String[] args) {
        System.out.println(primeNumber(35593));
    }

    public static boolean primeNumber(int number) {
        if (number <= 0) {
            number = number * -1;
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
