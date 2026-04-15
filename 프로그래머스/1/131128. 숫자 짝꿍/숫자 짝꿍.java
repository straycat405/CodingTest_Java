import java.util.*;

class Solution {
    public String solution(String X, String Y) {
                    // 0~9까지 개수를 담을 배열 선언
            int[] countX = new int[10];
            int[] countY = new int[10];

            // X의 각 자리수 카운팅
            for (char c : X.toCharArray()) {
                countX[c - '0']++;
            }

            // Y의 각 자리수 카운팅
            for (char c : Y.toCharArray()) {
                countY[c - '0']++;
            }

            // X와 Y의 각 자리의 min값을 산출
            // sb로 9부터 0까지 min값만큼 반복해서 입력

            StringBuilder sb = new StringBuilder();


            for (int i = 9; i > -1; i--) {
                int min = Math.min(countX[i], countY[i]);

                for (int j = 0 ; j < min ; j ++) {
                    sb.append(i);
                }
            }

            if (sb.length() == 0) {
                return "-1";
            } else if (sb.toString().startsWith("0")) {
                return "0";
            }

            return sb.toString();
        

    }
}