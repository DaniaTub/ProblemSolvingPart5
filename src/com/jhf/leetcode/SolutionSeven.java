package com.jhf.leetcode;
// Remove Linked List Elements
 // Definition for singly-linked list.
 class ListNode {
    int val;
     ListNode next;
     ListNode() {}
      ListNode(int val) { this.val = val;
     }
     ListNode(int val, ListNode next) {
         this.val = val; this.next = next;
     }
 }
 //
class SolutionSeven {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) return null; //check first case
        while (head != null && head.val == val) //continues for the same value
            head = head.next; //cont.
            ListNode temp = head;//make temperory node.
        while (temp != null && temp.next != null)  //check that the list not empty ..
        {
            if (temp.next.val == val)
            {
                temp.next = temp.next.next; //move two steps that mean to delete ..
            }
            else
                temp = temp.next;
        }
        return head;
    }
}