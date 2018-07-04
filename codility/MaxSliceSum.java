public class MaxSliceSum {
    
    /**
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     * @param A
     * @return 
     */
    public static int solution(int[] A){
        
       int maxEnding = 0;
       int maxSum = 0;
       
       for (int i = 0; i < A.length; i++) {
           
           if (maxEnding < 0 && maxEnding < A[i]) {
               maxEnding = A[i];
           } else {
               maxEnding = Math.max(Integer.MIN_VALUE, maxEnding + A[i]);
           }
           
           maxSum = Math.max(maxSum, maxEnding);
       }
       return maxSum;
    }
}
