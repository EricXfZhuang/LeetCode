import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/*
 * @lc app=leetcode id=101 lang=java
 *
 * [101] Symmetric Tree
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
    public boolean isSymmetric(TreeNode root) {
        ArrayList<Integer> leftOrder = new ArrayList<Integer>();
        ArrayList<Integer> rightOrder = new ArrayList<Integer>();
        printLeft(leftOrder, root);
        printRight(rightOrder, root);
        if(leftOrder.equals(rightOrder)){
            return true;
        }else{
            return false;
        }
        
    }

    public void printLeft(ArrayList<Integer> pOrder, TreeNode t){
        if(t == null) return;
        
        //print root
        pOrder.add(t.val);

        //traverse left subtree
        if(t.left != null){
            printLeft(pOrder, t.left);
        }else{
            if(t.right != null)
                pOrder.add(null);
            else
                printLeft(pOrder, t.right);
        }

        if(t.right != null){
            printLeft(pOrder,t.right);
        }else{
            if(t.left != null)
                pOrder.add(null);
            else
                printLeft(pOrder, t.left);
        }
    }

    public void printRight(ArrayList<Integer> pOrder, TreeNode t){
        if(t == null) return;
        
        //print root
        pOrder.add(t.val);

        
        //traverse right
        if(t.right != null){
            printRight(pOrder,t.right);
        }else{
            if(t.left != null)
                pOrder.add(null);
            else
                printRight(pOrder, t.left);
        }

        //traverse left
        if(t.left != null){
            printRight(pOrder, t.left);
        }else{
            if(t.right != null)
                pOrder.add(null);
            else
                printRight(pOrder, t.right);
        }
    }
}
// @lc code=end

