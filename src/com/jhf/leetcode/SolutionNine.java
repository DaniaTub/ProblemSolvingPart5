package com.jhf.leetcode;
import java.util.LinkedList;
import java.util.Queue;

//implemengt stack from queue(only two queues.)
public class SolutionNine
{   Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    public void push(int x)
    {
        if(empty())
        {
            q1.add(x);
            return;
        }
        while(!q1.isEmpty())
        {
            q2.add(q1.remove());
        }
            q1.add(x);
        while(!q2.isEmpty())
        {
            q1.add(q2.remove());
        }
    }

    public int pop(){
        if(empty())
        {
            return -1;
        }
        return q1.remove();

    }

    public int top() {
        return (int) q1.peek();
    }

    public boolean empty() {
        return (q1.isEmpty()&&q2.isEmpty());
    }
}
