import java.util.*;
/*
 * @lc app=leetcode id=394 lang=java
 *
 * [394] Decode String
 */

// @lc code=start
class Solution {
    public String decodeString(String s) {
        Deque<Integer> numDeq = new ArrayDeque<Integer>();
		Deque<StringBuilder> symDeq = new ArrayDeque<StringBuilder>();
		StringBuilder medium = new StringBuilder();
		int len = s.length();
		for (int i = 0; i < len; i++) {
			char ch = s.charAt(i);
			if (Character.isDigit(ch)) {
				int num = ch - '0';
				while (i + 1 < len && Character.isDigit(s.charAt(i + 1))) {
					num = num * 10 + (s.charAt(i + 1) - '0');
					i++;
				}
				numDeq.push(num);
			} else if (ch == '[') {
				symDeq.push(medium);
				medium = new StringBuilder();
			} else if (ch == ']') {
				 int iterNum = numDeq.pop();
				 StringBuilder temp = symDeq.pop();
				 for(int j =0 ;j < iterNum;j++) {
					 temp.append(medium);
				 }
				 medium = temp;
			} else {
				medium.append(ch);
			}
		}
		return medium.toString();
    }

    

    

    
}
// @lc code=end

