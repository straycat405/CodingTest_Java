class Solution {
    public int solution(int n) {
        
        // 1부터 팩토리얼 계산
        // 계산 후 n과 비교
        // n보다 커지면 i-1을 반환
        
        int result = 1;
        
        for (int i = 2 ; i <= n; i ++) {
            result *= i;
            if (result > n) {
                return i - 1;
            }
        }
        
        return n;
        

        
    }
}