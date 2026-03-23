import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
            int[] result = new int[score.length]; // 매일 발표할 최소값 저장

            // 문제 핵심
            // 1. 그리디 알고리즘 (매번 상위 k개만 유지)
            // 2. 슬라이딩 윈도우 (k개 초과시 가장 낮은 점수 제거 및 새 점수 갱신 - 개수 유지)

            PriorityQueue<Integer> pq = new PriorityQueue<>();

            for (int i = 0; i < score.length; i++) {

                if (pq.size() < k) {
                    // k개 밑이면 (초반이면) 무조건 추가
                    pq.add(score[i]);
                } else if (score[i] > pq.peek()) {
                    // k가 꽉 찬 상태에서 새 점수 > 현재의 최소값이면
                    pq.poll(); // 최소값 제거
                    pq.add(score[i]); // 새 점수 추가
                }
                // 새 점수 <= 현재 최소값이면 아무것도 안함
                result[i] = pq.peek();
            }

            return result;
    }
}