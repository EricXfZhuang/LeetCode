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
        //if(head==null) return head;
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

        //dummy node 方法
        // if(head==null) return head;
        // ListNode ret = null;
        // ListNode cur = head;
        // while(cur!=null){
        //     ListNode temp = cur.next;
        //     cur.next = ret;
        //     ret = cur;
        //     cur = temp;
        // }
        // return ret;

        //recursive
        if(head==null) return head;
        if(head.next==null) return head;
        ListNode prev = head; ListNode curr = prev.next;
        prev.next = null;
        ListNode newHead = myRec(prev, curr);
        return newHead;
    }

    public ListNode myRec(ListNode prev, ListNode curr){
            if(curr.next==null){
                ListNode newHead = curr;
                curr.next = prev;
                return newHead;
            }else{
                ListNode node = curr.next;
                curr.next = prev;
                prev = curr;
                return myRec(prev, node);
            }
    }
}
// @lc code=end

