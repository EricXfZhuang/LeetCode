import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/*
 * @lc app=leetcode id=349 lang=java
 *
 * [349] Intersection of Two Arrays
 */

// @lc code=start
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<Integer>();
        Set<Integer> set2 = new HashSet<Integer>();
        int shortLen; int longLen; int flag;
        if(nums1.length > nums2.length){
            longLen = nums1.length;
            shortLen = nums2.length;
        }else{
            longLen = nums2.length;
            shortLen = nums1.length;
        }

        //place items from long array to set
        for(int i = 0;i < nums1.length;i++){
            set1.add(nums1[i]);
        }
        for(int i = 0;i < nums2.length;i++){
            set2.add(nums2[i]);
        }

        Iterator iter = set1.iterator();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        while(iter.hasNext()){
            int ele = (int) iter.next();
            if(set2.contains(ele))
                arr.add(ele);
        }
        int[] ret = new int[arr.size()];
        for(int i = 0;i < arr.size();i++){
            ret[i] = arr.get(i); 
        }   
        return ret;
    }
}
// @lc code=end

