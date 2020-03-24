/*
 * @lc app=leetcode id=328 lang=java
 *
 * [328] Odd Even Linked List
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
    public ListNode oddEvenList(ListNode head) {
        ListNode evenHead, oddHead, curr, currEven, currOdd;
        evenHead = new ListNode(0);
        oddHead = new ListNode(0);
        currEven = evenHead;
        currOdd = oddHead;
        curr = head;
        int index = 0;
        
        while(curr != null){
            if(index % 2 == 0){
                currEven.next = new ListNode(curr.val);
                currEven = currEven.next;
            }else{
                currOdd.next = new ListNode(curr.val);
                currOdd = currOdd.next;
            }
            curr = curr.next;
            index++;
        }

        evenHead = evenHead.next;
        oddHead = oddHead.next;

        currEven.next = oddHead;

        return evenHead; 
    }
}
// @lc code=end

