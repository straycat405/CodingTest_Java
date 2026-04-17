import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
 // TreeSet: 자동 오름차순 정렬 → 순회 순서 보장
        Set<Integer> lostSet = new TreeSet<>();
        for (int i : lost) lostSet.add(i);

        Set<Integer> reserveSet = new HashSet<>();
        for (int i : reserve) reserveSet.add(i);

        // 전처리: 여벌이 있으면서 도난당한 학생 → 양쪽에서 제거
        for (int i : reserve) {
            if (lostSet.contains(i)) {
                lostSet.remove(i);
                reserveSet.remove(i);
            }
        }

        // 기본 출석 가능 수 = 전체 - 진짜 lost 수
        int result = n - lostSet.size();

        // 번호 오름차순으로 순회해야 탐욕 선택이 올바르게 동작
        for (int i : lostSet) {
            if (reserveSet.contains(i - 1)) {
                reserveSet.remove(i - 1);
                result++;
            } else if (reserveSet.contains(i + 1)) {
                reserveSet.remove(i + 1);
                result++;
            }
        }

        return result;
    }
}