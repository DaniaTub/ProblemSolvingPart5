package com.jhf.leetcode;

import java.util.Stack;

//Implement a first in first out (FIFO) queue using only two stacks.
public class SolutionTen
{

    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    public void push(int x) {
        s1.push(x);
    }

    private void transferStackData(){
        while(!s1.isEmpty()){
            s2.push(s1.peek());
            s1.pop();
        }
    }

    public int pop() {

        if(!s2.isEmpty()){
            Integer value = s2.peek();
            s2.pop();
            return value;
        }

        transferStackData();
        Integer value = s2.peek();
        s2.pop();

        return value;

    }

    public int peek() {
        if(!s2.isEmpty()){
            return s2.peek();
        }

        transferStackData();

        return s2.peek();

    }

    public boolean empty() {
        return s1.isEmpty() && s2.isEmpty();
    }

}
