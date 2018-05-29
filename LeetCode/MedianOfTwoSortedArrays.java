/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

/**
 *
 * @author mac
 */
public class MedianOfTwoSortedArrays {
    
    /**
     * Time Complexity - O(n+m)
     * Space Complexity - O(n+m)
     * 
     * @param nums1
     * @param nums2
     * @return 
     */
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length + nums2.length];
        
        int arr1Counter = 0;
        int arr2Counter = 0;
        int finalResultCounter = 0;
        
        while (arr1Counter <= nums1.length-1 || arr2Counter <= nums2.length-1) {
            if (arr1Counter > nums1.length-1) {
                result[finalResultCounter] = nums2[arr2Counter];
                arr2Counter++;
                finalResultCounter++;
                continue;
            } 
            if (arr2Counter > nums2.length-1) {
                result[finalResultCounter] = nums1[arr1Counter];
                arr1Counter++;
                finalResultCounter++;
                continue;
            }
            
            if (nums1[arr1Counter] < nums2[arr2Counter]) {
                result[finalResultCounter] = nums1[arr1Counter];
                arr1Counter++;
            } else {
                result[finalResultCounter] = nums2[arr2Counter];
                arr2Counter++;
            }
            finalResultCounter++;
        }
        
        if (result.length%2 == 1) {
            return result[(result.length/2)];
        } else {
            return (result[result.length/2] + result[result.length/2 - 1]) / 2.0;
        }
    }
}

