/*
 * @lc app=leetcode id=203 lang=java
 *
 * [203] Remove Linked List Elements
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
    public ListNode removeElements(ListNode head, int val) {
        if(head == null) return head; 
        
        ListNode prev = head; ListNode cur = prev;
        while(cur!=null){
            if(cur.val==val){
                //if it's the head node
                if(cur==prev){
                    cur = cur.next;
                    prev = prev.next;
                    head = prev;
                }else{
                    cur = cur.next;
                    prev.next = cur;
                }
            }else{
                //if it's the head node
                if(prev==cur){
                    cur = prev.next;
                }else{
                    prev = prev.next;
                    cur = prev.next;
                }
            }
        }
        return head;

    }
}
// @lc code=end

