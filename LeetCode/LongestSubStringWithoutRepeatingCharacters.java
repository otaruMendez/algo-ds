/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

import java.util.HashSet;
import java.util.Set;

public class LongestSubStringWithoutRepeatingCharacters {
    
    /**
    * Time Complexity - O(n^2) 
    * Space Complexity - O(n)
    * 
    * Remark - Time Limit Exceeded
    * 
    * @param s
    * @return 
    * 
    * @author mac
    */
    public int lengthOfLongestSubstring(String s) {
        int highestCount = 0;
        for (int i = 0; i < s.length(); i++) {
            Set<Character> valuesSet = new HashSet<>();
            valuesSet.add(s.charAt(i));
            for (int j = i+1; j < s.length(); j++) {
                if (valuesSet.contains(s.charAt(j))) break;
                valuesSet.add(s.charAt(j));
            }
            if (valuesSet.size() > highestCount) {
                highestCount = valuesSet.size();
            }
        }
        return highestCount;
    }
    
    
    /**
     * Sliding Window Implementation
     * 
     * Time Complexity - O(2n)
     * Space Complexity - O(n)
     * 
     * @param s
     * @return 
     */
    public int lengthOfLongestSubstring2(String s) {
        int i = 0, j = 0;
        Set<Character> valuesSet = new HashSet<>();
        int ans = 0;
        while (i < s.length() && j < s.length()) {
            if (!valuesSet.contains(s.charAt(j))) {
                valuesSet.add(s.charAt(j++));
                ans = Math.max(ans, j-i);
            } else {
                valuesSet.remove(s.charAt(i++));
            }
        }
        return ans;
    }
}
