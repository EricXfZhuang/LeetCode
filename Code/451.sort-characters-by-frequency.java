import java.util.*;
/*
 * @lc app=leetcode id=451 lang=java
 *
 * [451] Sort Characters By Frequency
 */

// @lc code=start
class Solution {
    public String frequencySort(String s) {
        //Method using priority queue
        Map<Character, Integer> map = new HashMap();
        for(int i = 0;i<s.length();i++){
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), 1);
            }else{
                map.put(s.charAt(i), map.get(s.charAt(i))+1);
            }
        }
        PriorityQueue<Entry> pq = new PriorityQueue<Entry>();
        for(int i = 0;i < s.length();i++){
            pq.add(new Entry(s.charAt(i), map.get(s.charAt(i))));
        }
        String res = "";
        while(!pq.isEmpty()){
            res += pq.poll().key;
        }
        return res;
    }

    public class Entry implements Comparable<Entry>{
        private Character key;
        private Integer val;

        public Entry(Character key, Integer val){
            this.key = key;
            this.val = val;
        }

        @Override
        public int compareTo(Entry entry) {
            // TODO Auto-generated method stub
            if(!this.val.equals(entry.val))
                return -this.val.compareTo(entry.val);
            else
                return this.key.compareTo(entry.key);
        }
        
    }

}
// @lc code=end

