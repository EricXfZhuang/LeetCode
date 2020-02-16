/*
 * @lc app=leetcode id=21 lang=java
 *
 * [21] Merge Two Sorted Lists
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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head;
        if(l1 == null){
            return l2;
        }else if(l2 == null){
            return l1;
        }

        if(l1.val < l2.val){
            head = l1;
            l1.next = mergeSort(l1.next, l2);
        }else{
            head = l2;
            l2.next = mergeSort(l1, l2.next);
        }
        return head;
    }

    private ListNode mergeSort(ListNode l1, ListNode l2){
        ListNode head;
        if(l1 == null){
            return l2; 
        }else if(l2 == null){
            return l1;
        }

        if(l1.val < l2.val){
            head = l1;
            l1.next = mergeSort(l1.next, l2);
        }else{
            head = l2;
            l2.next = mergeSort(l1, l2.next);
        }
        return head;
    }
}
// @lc code=end

