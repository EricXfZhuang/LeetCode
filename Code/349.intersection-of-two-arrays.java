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
        //place items from long array to set
        for(int i = 0;i < nums1.length;i++){
            set1.add(nums1[i]);
        }
        for(int i = 0;i < nums2.length;i++){
            set2.add(nums2[i]);
        }

        Iterator<Integer> iter = set1.iterator();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        while(iter.hasNext()){
            int ele = (int) iter.next();
            if(set2.contains(ele))
                arr.add(ele);
        }
        
        //convert arrayList to array
        int[] res = new int[arr.size()];
        int index = 0;
        for(Integer ele : arr){
            res[index++] = ele;
        }
        return res;
    }
}
// @lc code=end

