/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codility;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author mac
 */
public class Dominator {
    
    /**
     * Time Complexity - O(2n)
     * Space Complexity - O(n)
     * 
     * @param values
     * @return 
     */
    public int findDominator(int[] values) {
        Map<Integer, Integer> valueCounter = new HashMap();
        int highestValue = -1;
        int result = 0;
        for (int i = 0; i < values.length; i++) {
            if (!valueCounter.containsKey(values[i])) {
                valueCounter.put(values[i], 1);
            } else {
                valueCounter.put(values[i], valueCounter.get(values[i]) + 1);
            }
        }
        
        for (Map.Entry<Integer, Integer> entry : valueCounter.entrySet()) {
            if (highestValue < entry.getValue() && entry.getValue() > values.length/2) {
                highestValue = entry.getKey();
            }
        }
        
        if (highestValue == -1) return highestValue;
        
        for (int i = 0; i < values.length; i++) {
            if (values[i] == highestValue) {
                result = i;
                break;
            }
        }
        
        return result;
    }
}

