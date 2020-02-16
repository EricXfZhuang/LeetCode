import java.util.Stack;

/*
 * @lc app=leetcode id=232 lang=java
 *
 * [232] Implement Queue using Stacks
 */

// @lc code=start
class MyQueue {

    /** Initialize your data structure here. */
    Stack<Integer> s;
    public MyQueue() {
        s = new Stack<Integer>();
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        Stack<Integer> temp = new Stack<Integer>();
        while(!s.isEmpty()){
            temp.push(s.pop());
        }
        s.push(x);
        while(!temp.isEmpty()){
            s.push(temp.pop());
        }
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        return s.pop();
    }
    
    /** Get the front element. */
    public int peek() {
        return s.peek();
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return s.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
// @lc code=end

