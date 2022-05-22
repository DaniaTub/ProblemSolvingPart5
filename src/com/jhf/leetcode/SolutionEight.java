package com.jhf.leetcode;
// Palindrome Linked List
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class SolutionEight
{
    public boolean isPalindrome(ListNode head)
    {
        if(head==null) //first case must check
        {
            return true;
        }
        //Get the middle of the linked list.
        ListNode mid=middle(head); //middle node
        // Reverse the second half of the linked list.
        ListNode rev=revList(mid); //reverse node
        ListNode cur=head; //currently node
        // Check if the first half and second half are identical.
        while(rev!=null)
        {
            if(rev.val!=cur.val)
            {
                return false;
            }
            cur=cur.next;
            rev=rev.next;
        }
        return true;

    }
    // Construct the original linked list by reversing the second half again and attaching it back to the first half
    public ListNode revList(ListNode head)
    {
        if(head==null || head.next==null)
        {
            return head;
        }
        ListNode prevNode=head;
        ListNode curNode=head.next;
        while(curNode!=null)
        {
            ListNode nextNode=curNode.next;
            curNode.next=prevNode;
            prevNode=curNode;
            curNode=nextNode;
        }
        head.next=null;
        head=prevNode;
        return head;
    }
    //Get the middle of the linked list.
    public ListNode middle(ListNode head)
    {
        ListNode a_pointer=head;
        ListNode b_pointer=head;
        while(b_pointer!=null && b_pointer.next!=null)
        {
            a_pointer=a_pointer.next;
            b_pointer=b_pointer.next.next;
        }
        return a_pointer;
    }
    }
