import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
            int[] result = new int[commands.length];

            // 1- commands의 길이만큼 반복 (commands.length)
            for (int i = 0; i < commands.length; i++) {
                // 2 - array를 commands[i][0] ~ commands[i][1] 만큼 자름
                int[] sliced = Arrays.copyOfRange(array,commands[i][0]-1, commands[i][1]);
                // 3 - 2의 결과를 오름차순으로 정렬
                Arrays.sort(sliced);
                // 4 - 3의 결과에서 commands[i][2]의 인덱스 값 추출 > 리턴 배열에 추가
                result[i] = sliced[commands[i][2]-1];
            }
            return result;
    }
}