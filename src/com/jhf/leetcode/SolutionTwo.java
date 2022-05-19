package com.jhf.leetcode;

import java.util.Arrays;

//Given a string of lowercase English letters,
// find the length of its longest contiguous substring
// that doesn't contain any character more than once.
public class SolutionTwo
{
    int solution(String s)
    {
     char [] strArr=s.toCharArray();
        int result = 0;
        int[] array = new int[256];
        Arrays.fill(array, -1);
        int i = 0;
        for(int j = 0; j < s.length(); j++)
        {

            i = Math.max(i, array[s.charAt(j)] + 1);
            result = Math.max(result, j - i + 1);
            array[s.charAt(j)] = j;

        }
        return result;
    }
    }

