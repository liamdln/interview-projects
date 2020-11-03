package com.liamdp.palindrome;

public class Palindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome("liam"));
        System.out.println(isPalindrome("racecar"));

        System.out.println(isPalindrome2("liam"));
        System.out.println(isPalindrome2("racecar"));
    }

    /**
     * Checks if a word is a palindrome.
     * @param word Word to check.
     * @return If the word is a palindrome or not.
     */
    public static boolean isPalindrome(String word) {
        int wordSize = word.length() - 1;
        char[] wordArray = word.toLowerCase().toCharArray();
        char[] reverse = new char[wordSize + 1];
        for (int i = 0; i <= wordSize; i++) {
            reverse[i] = wordArray[wordSize - i];
        }
        String reverseWord = new String(reverse);
        return reverseWord.equals(word);
    }

    /**
     * A better implementation of palindrome by Joe G.
     * @param word Word to check.
     * @return If the word is a palindrome or not.
     */
    public static boolean isPalindrome2(String word){
        int i = 0;
        int j = word.length() - 1;
        while (i < j) {
            if (word.charAt(i) != word.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }

}

