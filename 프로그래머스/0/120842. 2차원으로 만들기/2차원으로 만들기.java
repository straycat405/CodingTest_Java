class Solution {
    public int[][] solution(int[] num_list, int n) {
        
            int[][] res = new int[num_list.length / n][n];

            // 150 x 150 이므로 오버플로우 없음

            // 행 row가 num_list.length / n개
            // 열 col이 n개

            // num_list에서 앞에서 n개만큼의 원소를 새 배열로
            // num_list / n 개만큼 반복

            int cnt = 0;

            for (int i = 0; i < num_list.length / n; i++) {
                for (int j = 0; j < n; j++) {
                    res[i][j] = num_list[cnt];
                    cnt++;
                }
            }

            return res;
        
    }
}