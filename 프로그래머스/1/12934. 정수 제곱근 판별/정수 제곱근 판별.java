class Solution {
    public long solution(long n) {
        
        long sq = 0;
        
        for (long i = 1 ; i <= 7071067 ; i++) {
            if (i*i == n) {
                sq = i;
            }
        }
        
        if (sq == 0) {
            return (long)-1;
        } else {
            return (long)((sq+1)*(sq+1));
        }

            
        
    }
}