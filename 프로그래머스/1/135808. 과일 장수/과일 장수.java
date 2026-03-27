import java.util.Arrays;

class Solution {
    public int solution(int k, int m, int[] score) {
        
        // 오름차순 정렬
        Arrays.sort(score);
            
        int result = 0;
        
        // 뒤에서부터 m개씩 순회 (내림차순 순회)
        for (int i = score.length - 1 ; i >= m - 1 ; i -= m) {
            result += score[i - (m-1)] * m;
        }
        
        return result;
        
    }
}