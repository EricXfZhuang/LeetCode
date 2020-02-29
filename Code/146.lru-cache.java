import java.util.*;

/*
 * @lc app=leetcode id=146 lang=java
 *
 * [146] LRU Cache
 */


// @lc code=start
class LRUCache {
    TreeMap<Integer, myEntry> map = new TreeMap<Integer, myEntry>(new descendingComparator() );
    int capacity;
    int timeStamp;

    class descendingComparator implements Comparator<Integer>{

        @Override
        public int compare(Integer arg0, Integer arg1) {
            // TODO Auto-generated method stub
            return -arg0.compareTo(arg1);
        }
        
    }
    public LRUCache(int capacity) {
       this.capacity = capacity;
    }
    
    public int get(int key) {
        System.out.println("get:"+key);
        for(Map.Entry<Integer, myEntry>  e : map.entrySet()){
            if((e.getKey()>=(timeStamp-capacity) || map.size() <= capacity) && e.getValue().key==key){
                int k = e.getValue().key;
                int v = e.getValue().val; 
                map.remove(e.getKey());
                map.put(timeStamp++, new myEntry(k,v));
                System.out.println(map.toString());
                return v;
            }
        }
        return -1;
    }
    
    public void put(int key, int value) {
        System.out.println("put:"+"["+key+", "+value+"]");
        for(Map.Entry<Integer, myEntry> e:map.entrySet()){
            if(e.getValue().key==key){
                map.remove(e.getKey());
                map.put(timeStamp++, new myEntry(key, value));
                System.out.println(map.toString());
                return;
            }
        }
        map.put(timeStamp++, new myEntry(key, value));
        System.out.println(map.toString());
    }

    private class myEntry {
        private int key;
        private int val;

        public myEntry(myEntry entry){
            this.key = entry.key;
            this.val = entry.val;
        }

        public myEntry(int key, int val){
            this.key = key;
            this.val = val;
        }

        public void setVal(int val){
            this.val = val;
        }

        @Override
        public String toString(){
            String str = "";
            str += "[" + key + ", " + val + "]";
            return str;
        }
    }

}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
// @lc code=end

