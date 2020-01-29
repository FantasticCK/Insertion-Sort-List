package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}

class Solution {
    public ListNode insertionSortList(ListNode head) {
        if (head == null)
            return null;
        ListNode dummyH = new ListNode(0), sorted = null;
        while (head != null) {
            ListNode curr = head;
            head = head.next;
            curr.next = null;
            sorted = dummyH;
            while (sorted.next != null && curr.val > sorted.next.val) {
                sorted = sorted.next;
            }
            curr.next = sorted.next;
            sorted.next = curr;
        }
        return dummyH.next;
    }
}