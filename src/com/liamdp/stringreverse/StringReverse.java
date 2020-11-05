package com.liamdp.stringreverse;

public class StringReverse {

    public static void main(String[] args) {

        System.out.println(reverseString("racecar"));
        System.out.println(reverseString("liam"));

    }

    /**
     * Reverses a string.
     * @param someString String to reverse.
     * @return The reversed string.
     */
    public static String reverseString(String someString) {
        StringBuilder reversedString = new StringBuilder();
        int arraySize = someString.length() - 1;

        for (int i = 0; i <= arraySize; i++) {
            reversedString.append(someString.charAt(arraySize - i));
        }

        return reversedString.toString();
    }

}
