import java.security.spec.EncodedKeySpec;
import java.util.*;
/*
 * @lc app=leetcode id=208 lang=java
 *
 * [208] Implement Trie (Prefix Tree)
 */

// @lc code=start
class Trie {
    private TrieNode root;

    private class TrieNode{
        private HashMap<Character, TrieNode> children;
        private boolean isEndofWord;

        public TrieNode(){
            children = new HashMap<Character, TrieNode>();
        }
        
        public TrieNode getTrieNode(Character c){
            if(this.children.containsKey(c)){
                return this.children.get(c);
            }else{
                return null;
            }
        }

        public void setEndodWord(boolean t){
            this.isEndofWord = t;
        }
    }

    /** Initialize your data structure here. */
    public Trie() {
        this.root = new TrieNode();
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        TrieNode curr; TrieNode prev = this.root;
        for(int i = 0; i < word.length(); i++){
            //System.out.println(curr);
            curr = prev.getTrieNode(word.charAt(i));
            if(!prev.children.containsKey(word.charAt(i))){
                curr = new TrieNode();
                prev.children.put(word.charAt(i), curr);
            }
            prev = curr;
        }
        prev.setEndodWord(true);
        //System.out.println(this.root);
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        //System.out.println(this.root.children);
        TrieNode curr = this.root;
        for(int i = 0; i < word.length(); i++){
            curr = curr.getTrieNode(word.charAt(i));
            if(curr==null){
                return false;
            }
        }
        return curr.isEndofWord;
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        TrieNode curr = this.root;
        for(int i = 0; i < prefix.length(); i++){
            curr = curr.getTrieNode(prefix.charAt(i));
            if(curr==null){
                return false;
            }
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
// @lc code=end

