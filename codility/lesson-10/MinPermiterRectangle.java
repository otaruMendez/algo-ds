public class MinPermiterRectangle {
    
    /**
     * Time Complexity: O(sqrt n)
     * @param N
     * @return 
     */
    public static int solution(int N) {
        
        int minimumPerimeter = 2 * (N + 1);
        
        for (int i = 2; i * i <= N; i++) {
            if (N % i == 0) {
                int perimeter = 2 * (i + N/i);
                if (minimumPerimeter > perimeter) {
                    minimumPerimeter = perimeter;
                }
            }
        }
        return minimumPerimeter;
    }
}
