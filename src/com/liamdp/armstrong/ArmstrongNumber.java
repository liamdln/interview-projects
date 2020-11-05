package com.liamdp.armstrong;

public class ArmstrongNumber {

    public static void main(String[] args) {

        System.out.println(armstrongNumber(153));
        System.out.println(armstrongNumber(157));
        System.out.println(armstrongNumber(407));

    }

    /**
     * Determines if a number is an Armstrong number.
     * @param number Number to test
     * @return If the number is an Armstrong number or not.
     */
    public static boolean armstrongNumber(int number) {
        int total = 0;
        int passedInNumber = number;
        while (passedInNumber > 0) {
            int digit = passedInNumber % 10;
            passedInNumber = passedInNumber / 10;
            total += Math.pow(digit, 3);
        }
        return total == number;
    }

}
