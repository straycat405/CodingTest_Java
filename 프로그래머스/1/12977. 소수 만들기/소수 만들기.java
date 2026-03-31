import java.util.*;

class Solution {
    
     List<int[]> result = new ArrayList<>();
        void combination(int[] arr, int[] chosen, int start, int depth, int r) {
            if (depth == r) {
                result.add(chosen.clone());
                return;
            }
            for (int i = start; i < arr.length; i++) {
                chosen[depth] = arr[i];
                combination(arr, chosen, i + 1, depth + 1, r);
            }
        }

        boolean isPrime(int n) {
            if (n < 2) return false;
            for (int i = 2 ; i <= Math.sqrt(n); i++) {
                if (n % i == 0) return false;
            }
            return true;
        }
    
    
    public int solution(int[] nums) {
        
         int answer = 0;

            // r=3으로 조합 생성
            combination(nums, new int[3], 0, 0, 3);

            for (int[] combo : result) {
                int sum = combo[0] + combo[1] + combo[2];
                if (isPrime(sum)) answer++;
            }

            return answer;

    }
}