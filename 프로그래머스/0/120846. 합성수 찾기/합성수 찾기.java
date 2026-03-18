class Solution {
    public int solution(int n) {
        // 약수의 개수를 세는 법은 뭐지?
        // 1부터 n까지 반복하는 방식이겠네
        // 더 좋은 방법이 있나? 없을것같은데?
        // 이런 문제는 무슨 자료구조고, 무슨 알고리즘인거지?
        
        // 합성수 = 소수가 아닌 수
        // 그렇다면 소수를 찾아내는 방법은?
        // 소수 > 자기 자신이랑 1만 약수인 수
        
        // 반복문 돌리고
        // i가 합성수인게 판별될때마다 count++
        // return count
        
        int cnt = 0;
        int yaksu = 0;
        
        for (int i = 1 ; i <= n ; i ++) {
            for (int j = 1 ; j <= i ; j ++) {
                if (i%j == 0) {
                    yaksu++;
                }
            }
            if (yaksu >= 3) {
                cnt ++;
            }
            yaksu = 0;
        }
        return cnt;
    
    }
}