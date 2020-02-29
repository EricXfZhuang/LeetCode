/*
 * @lc app=leetcode id=148 lang=java
 *
 * [148] Sort List
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode slow = head; ListNode fast = head; ListNode tail = null;
        while(fast!=null && fast.next!=null){
            tail = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        tail.next = null;
        return merge(sortList(head), sortList(slow));
    }

    public ListNode merge(ListNode l1, ListNode l2){
        //merge two sorted list
        ListNode head;
        if(l1 == null){
            return l2;
        }else if(l2 == null){
            return l1;
        }

        if(l1.val < l2.val){
            head = l1;
            l1.next = merge(l1.next, l2);
        }else{
            head = l2;
            l2.next = merge(l1, l2.next);
        }
        return head;
    }
}
// @lc code=end

