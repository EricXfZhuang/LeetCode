import java.util.*;
/*
 * @lc app=leetcode id=142 lang=java
 *
 * [142] Linked List Cycle II
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        if(slow==null || slow.next==null) return null;
        ListNode fast = slow; 
        boolean containsCycle = false;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                containsCycle = true;
                break;
            }
        } 
        if(containsCycle){
            ListNode p = head;
            while(slow!=p){
                slow=slow.next;
                p=p.next;
            }
            return slow;
        }
        return null;
    }
}
// @lc code=end

