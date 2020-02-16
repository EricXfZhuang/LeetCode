import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 * @lc app=leetcode id=100 lang=java
 *
 * [100] Same Tree
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        List<Integer> pOrder1 = new ArrayList<Integer>();
        List<Integer> pOrder2 = new ArrayList<Integer>();
        preOrder(pOrder1, p);
        preOrder(pOrder2, q);
        if(pOrder1.equals(pOrder2)) return true;
        return false;
    }

    public void preOrder(List<Integer> pOrder,TreeNode t){
        if(t == null) return; 
        pOrder.add(t.val);

        if(t.left != null){
            preOrder(pOrder, t.left);
        }else{
            if(t.right != null)
                pOrder.add(null);
            else
                preOrder(pOrder, t.right);
        }
        preOrder(pOrder, t.right);
    }
}
// @lc code=end

