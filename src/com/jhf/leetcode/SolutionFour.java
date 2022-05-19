package com.jhf.leetcode;
//reverse string
public class SolutionFour
{
    public String reverseWords(String s) {
    s = s.trim();
    String[] sarray = s.split(" ");
    StringBuilder sb = new StringBuilder("");

        for (int i = sarray.length - 1; i >= 0; i--) {

    if (!sarray[i].isEmpty())
        sb.append(sarray[i]);

    if (!sarray[i].isEmpty() && i > 0)
        sb.append(" ");
}
        return sb.toString();

}}
