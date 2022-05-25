package com.jhf.leetcode;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class SolutionEleven
{
    public int countStudents(int[] students, int[] sandwiches)
    {
        Queue<Integer> q = new ArrayDeque<>(); //use arrayqueue ... make the queue to the student
        for (int i = 0; i < students.length; i++)
        {
            q.add(students[i]); // add the students to the queue ,, using add because of the array-queue
        }
        Stack<Integer> s = new Stack<>(); //make the stack for the sandwish
        for (int i = sandwiches.length-1; i >= 0 ; i--)
        {
            s.push(sandwiches[i]); //push the sandwish to the stack
        }
        int count = 0;
        while(count != q.size())
        {
            if(s.peek() == q.peek()) //if the request of the student equal the same student
            {
                s.pop(); //give it to the student
                q.remove(); //remove the student fom the queue
                count = 0; //that mean there is no problem with the request
            }
            else
            {
                int a = q.remove(); //will save the student into variable then remove it from the queue
                q.add(a); //add the student again to the queue ( using another variable)
                count++; //that mean a problem with the request happened
            }
        }
        return q.size();
    }
}
