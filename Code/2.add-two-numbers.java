import java.util.*;
/*
 * @lc app=leetcode id=2 lang=java
 *
 * [2] Add Two Numbers
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Queue<Integer> q1 = new LinkedList<Integer>();
        Queue<Integer> q2 = new LinkedList<Integer>();
        ListNode curr = l1;
        while(curr!=null){
            q1.add(curr.val);
            curr = curr.next;
        }
        curr = l2;
        while(curr!=null){
            q2.add(curr.val);
            curr = curr.next;
        }

        ListNode head = new ListNode(0);
        ListNode prev = head;
        curr = head;
        while(!(q1.isEmpty() && q2.isEmpty())){
            prev = curr;
            if(!q1.isEmpty()){
                curr.val += q1.poll();
            }
            if(!q2.isEmpty()){
                curr.val += q2.poll();
            }
            int carry = curr.val / 10;
            curr.val %= 10;
            curr.next = new ListNode(carry);
            curr = curr.next;
        }
        if(curr.val == 0){
            prev.next = null;
        }
        return head;
    }
}
// @lc code=end

