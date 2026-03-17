import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
            //Array 선언 > 합 채워넣기
            List<Integer> answer = new ArrayList<>();

            //for문 i ~
            for (int i = 0; i < numbers.length; i++) {
                //for문 j ~
                for (int j = i + 1; j < numbers.length; j++) {
                    //i[j] + i[j+1] 합을 array에 넣기
                    // 이미 있으면 패스
                    if (!answer.contains(numbers[i] + numbers[j])) {
                        answer.add(numbers[i] + numbers[j]);
                    }
                }
            }
            // 다끝나면 반복문 탈출 후 오름차순 정렬
            // int[]로 리턴
            return answer.stream()
                    .sorted()
                    .mapToInt(Integer::intValue)
                    .toArray();
    }
}