import java.util.*;
/*
 * @lc app=leetcode id=19 lang=java
 *
 * [19] Remove Nth Node From End of List
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
    Map<Integer, ListNode> map = new HashMap<>();
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr = head;
        int len = dfs(curr);
        ListNode found = map.get(n);
        ListNode prev = head;
        curr = prev.next; 
        if(n==len){
            head = head.next;
        }else{
            while(curr!=null){
                if(curr==found){
                    prev.next = curr.next;
                    break;
                }
                prev = curr;
                curr = curr.next;
            }
        }
        return head;
    }

    public int dfs(ListNode curr){
        if(curr==null) return 0;
        int index = 1 + dfs(curr.next);
        map.put(index, curr);
        return index;
    }


}
// @lc code=end

