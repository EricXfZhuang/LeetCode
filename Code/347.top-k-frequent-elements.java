import java.util.*;
/*
 * @lc app=leetcode id=347 lang=java
 *
 * [347] Top K Frequent Elements
 */

// @lc code=start
class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        PriorityQueue<MyEntry> pq = new PriorityQueue<>();
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            pq.add(new MyEntry(entry.getKey(), entry.getValue()));
        }

        List<Integer> res = new ArrayList<>();
        for(int i = 0; i < k; i++){
            res.add(pq.poll().num);
        }
        return res;
    }

    public class MyEntry implements Comparable<MyEntry>{
        int num;
        int count;

        public MyEntry(int num){
            this(num, 1);
        }

        public MyEntry(int num, int count){
            this.num = num;
            this.count = count;
        }

        @Override
        public int compareTo(MyEntry arg0) {
            // TODO Auto-generated method stub
            return -Integer.compare(this.count, arg0.count);
        }

        @Override
        public String toString(){
            return num + ":" + count;
        }

    }
    
}
// @lc code=end

