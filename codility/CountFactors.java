
public class CountFactors {
    
    /**
     * Time Complexity: O(log n)
     * 
     * @param N
     * @return 
     */
    public static int solution(int N) {
        
        if (N == 1) {
            return 1;
        }
        
        int noOfFactors = 2; 
        for (int i = 2; i * i <= N; i++) {
            if (i*i == N) {
                noOfFactors++;
                break;
            }
            if (N % i == 0) {
                noOfFactors += 2;
            }
        }
        return noOfFactors;
    }
}

