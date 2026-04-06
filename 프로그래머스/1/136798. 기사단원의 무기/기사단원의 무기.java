import java.util.*;

class Solution {
    public int solution(int number, int limit, int power) {
            // 1. number의 순서대로 약수의 개수를 배열로 만들기
            // 2. 각 원소가 limit 초과면 > limit만큼
            // 3. 각 원소가 limit 이하면 > 그 약수 갯수 (스스로)만큼
            // 4. 공격력의 총합을 반환

            int yak = 0; // 1,2,2,3
            int result = 0;

            // 1 ~ 10 > { 1,2,2,3,2,4,2,4,3,4 }
            for (int i = 1 ; i <= number ; i ++) {
                for (int j = 1 ; j * j <= i; j ++) {
                    // i가 j로 나누어지면 (나머지가 0이면) > 약수
                    if (i % j == 0) {
                        yak += 2; // i와 j를 한번에 카운트
                        if (j * j == i) {
                            yak--; // 완전제곱수는 j == i/j이므로 중복 제거
                        }
                    }
                }

                if (yak > limit) {
                    result += power;
                } else {
                    result += yak;
                }
                yak = 0;
            }

            return result;
    }
}