import java.util.*;
/*
 * @lc app=leetcode id=138 lang=java
 *
 * [138] Copy List with Random Pointer
 */

// @lc code=start
/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/
class Solution {
    public Node copyRandomList(Node head) {
        /**
         * step 1 copy value
         *  */   
        if(head==null) return null;
        Node curr2 = head;
        Node h = new Node(0); 
        Node curr1 = new Node(curr2.val); 
        h = curr1;
        int index = 0;
        Map<Node, Node> map = new HashMap<>();
        map.put(curr2, curr1);
        while(curr2.next!=null){
            curr1.next = new Node(curr2.next.val);
            map.put(curr2.next, curr1.next);
            //map.put(index++, curr1.next.val);
            curr1 = curr1.next;
            curr2 = curr2.next;
        }

        curr1 = h;
        curr2 = head;

        /**
         * step 2 copy random 
         */
        while(curr2!=null){
            curr1.random = map.get(curr2.random);
            curr1 = curr1.next;
            curr2 = curr2.next;
        }
        return h;
    }

}
// @lc code=end

