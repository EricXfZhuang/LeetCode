import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/*
 * @lc app=leetcode id=234 lang=java
 *
 * [234] Palindrome Linked List
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
    public boolean isPalindrome(ListNode head) {
        if(head==null) return true;
        Stack<Integer> s = new Stack<Integer>();
        Queue<Integer> q = new LinkedList<Integer>();
        while(head!=null){
            s.push(head.val); q.add(head.val);
            head = head.next;
        }
        while(!s.isEmpty()){
            if((s.pop()-q.poll()) != 0){
                return false;
            }
        }
        return true;
    }
}
// @lc code=end

