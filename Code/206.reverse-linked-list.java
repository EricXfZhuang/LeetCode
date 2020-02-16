import java.util.Stack;

/*
 * @lc app=leetcode id=206 lang=java
 *
 * [206] Reverse Linked List
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
    public ListNode reverseList(ListNode head) {
        if(head==null) return head;
        // Stack<ListNode> s = new Stack<ListNode>();
        // while(head!=null){
        //     s.push(head);
        //     ListNode temp = head.next; 
        //     head.next = null;
        //     head = temp;
        // }
        // head = s.pop();
        // ListNode cur = head;
        // while(!s.isEmpty()){
        //     cur.next = s.pop();
        //     cur = cur.next;
        // }
        // return head;
        ListNode ret = null;
        ListNode cur = head;
        while(cur!=null){
            ListNode temp = cur.next;
            cur.next = ret;
            ret = cur;
            cur = temp;
        }
        return ret;
    }
}
// @lc code=end

