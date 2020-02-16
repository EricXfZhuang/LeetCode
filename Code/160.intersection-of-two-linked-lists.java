import java.util.HashSet;

/*
 * @lc app=leetcode id=160 lang=java
 *
 * [160] Intersection of Two Linked Lists
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==headB) return headA;
        ListNode currA = headA;
        ListNode currB = headB;
        HashSet<ListNode> set = new HashSet<>();
        while(currA!=null | currB!=null){
            if(set.contains(currA)) return currA;
            if(set.contains(currB)) return currB;
            if(currA==currB) return currA;
            if(currA!=null){
                set.add(currA);
                currA = currA.next;
            }
            if(currB!=null){
                set.add(currB);
                currB = currB.next;
            }
        }
        return null;
        
    }
}
// @lc code=end

