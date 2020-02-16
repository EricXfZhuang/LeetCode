/*
 * @lc app=leetcode id=141 lang=java
 *
 * [141] Linked List Cycle
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
    public boolean hasCycle(ListNode head) {
        if(head==null) return false;
        ListNode slow = head;
        ListNode fast = slow.next;
        while(slow!=null && fast!=null){
            if(slow==fast) return true;
            slow = slow.next;
            fast = fast.next;
            if(fast==null) return false;
            fast = fast.next;
            if(fast==null) return false;
        }
        return false;
        
    }
}
// @lc code=end

