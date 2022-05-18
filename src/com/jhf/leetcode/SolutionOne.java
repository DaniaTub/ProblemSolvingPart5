package com.jhf.leetcode;

import java.util.Arrays;

//Two words are blanagrams if they are anagrams but exactly one letter has been substituted for another.
public class SolutionOne {
    boolean solution(String word1, String word2) {
        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();
        // check if length is same
        if (word1.length() == word2.length()) {

            // convert strings to char array
            char[] charArray1 = word1.toCharArray();
            char[] charArray2 = word2.toCharArray();

            // sort the char array
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            // if sorted char arrays are same
            // then the string is anagram
            boolean result = Arrays.equals(charArray1, charArray2);

            if (result) {
                System.out.println(word1 + " and " + word2 + " are anagram.");
                return true;
            } else {
                System.out.println(word1 + " and " + word2 + " are not anagram.");
                return  false;
            }
        } else {
            System.out.println(word1 + " and " + word2 + " are not anagram.");
            return  false;
        }


    }
}


