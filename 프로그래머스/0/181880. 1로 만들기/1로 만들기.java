class Solution {
    public int solution(int[] num_list) {
        
        // n이 주어지면
        // n이 짝수면 > /2
        // n이 홀수면 > 1을 빼고 /2
        // n이 1이될때까지 반복
        
        int cnt = 0;
        
        for (int n : num_list) {
            
            while (n > 1) {
             if (n % 2 == 0) {
                n /= 2;
                cnt++;
            } else {
                 n --;
                 n /= 2;
                 cnt++;
             }
                
            }

        }
        return cnt;
        
        
        
    }
}