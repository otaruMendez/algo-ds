public class MaxProfit {
    
    /**
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     * @param A
     * @return 
     */
    public static int solution1(int[] A) {
        if (A.length == 0) {
            return 0;
        }
        int minPurchase = A[0], maxProfit = 0;
        for (int i = 0; i < A.length; i++) {
            minPurchase = Math.min(minPurchase, A[i]);
            maxProfit = Math.max(maxProfit, A[i] - minPurchase);
        }
        return maxProfit;
    }
}
 
