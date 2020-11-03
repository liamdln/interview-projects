package com.liamdp.palindrome;

import java.util.ArrayList;

public class IntegerPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome(1001));
        System.out.println(isPalindrome(1234));
    }

    /**
     * Checks if a number is a palindrome.
     * @param numberToCheck Number to check.
     * @return If the number is a palindrome or not.
     */
    public static boolean isPalindrome(int numberToCheck) {
        int reverse = 0;
        int number = numberToCheck;

        while (number != 0) {
            int numberRemainder = number % 10;
            reverse = reverse * 10 + numberRemainder;
            number = number / 10;
        }

        return reverse == numberToCheck;
    }

}
