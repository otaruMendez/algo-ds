/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author mac
 */
public class TwoSum {
    
    /**
     * Time complexity - O(2n)
     * Space complexity - O(n)
     * 
     * @param nums
     * @param target
     * @return 
     */
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap();
        for (int i = 0; i < nums.length; i++) {
           map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[] {i, map.get(complement)};
            }
        }
        return new int[]{};
    }
    
    /**
     * Time Complexity - O(n)
     * Space Complexity - O(n)
     * 
     * @param nums
     * @param target
     * @return 
     */
    public int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[] {map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}

