import java.util.*;

/*
 * @lc app=leetcode id=414 lang=java
 *
 * [414] Third Maximum Number
 */

// @lc code=start
class Solution {
    public int thirdMax(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue();
        Set<Integer> set = new HashSet();
        for(Integer ele : nums){
            if(!set.contains(ele)){
                pq.add(ele);
                set.add(ele);
            }
            if(pq.size()>3){
                set.remove(pq.poll());
            }
        }

        if(set.size()==2){
            pq.poll();
            return pq.peek();
        }else
            return pq.poll();
    }
}
// @lc code=end

