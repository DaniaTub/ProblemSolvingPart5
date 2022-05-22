package com.jhf.leetcode;
//remove duplicated from the linked list
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
class SolutionSix
{
    public ListNode deleteDuplicates(ListNode head)
    {
        if(head==null) return head; //first case
        ListNode node=new ListNode(); //to compare the values
        node.val= head.val; //take the first value from the head
        head=head.next; //continue
        ListNode tempNode=node; //put the compared node into new node
        while (head!=null){
            if(node.val!=head.val)//if its now equal
            {
                node.next=head;
                node=node.next;
                head=head.next;
            }
            else
            {
                head=head.next;
            }
            node.next=null; //to remove it
        }
        return tempNode;

    }
}