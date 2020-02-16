import java.util.Iterator;
import java.util.TreeSet;

/*
 * @lc app=leetcode id=83 lang=java
 *
 * [83] Remove Duplicates from Sorted List
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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null){
            return null;
        }
        TreeSet<Integer> tree = new TreeSet<Integer>();
        while(head != null){
            tree.add(head.val);
            head = head.next;
        }
        Iterator<Integer> iter = tree.iterator();
        ListNode res = new ListNode(iter.next());
        ListNode curr = res;
        while(iter.hasNext()){
            curr.next = new ListNode(iter.next());
            curr = curr.next;
            System.out.println(res);
        }
        return res;
    }
}
// @lc code=end

