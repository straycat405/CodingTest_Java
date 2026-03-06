class Solution {
    public int solution(int[][] sizes) {
        
        //가로는 제일 긴거
        //세로가 가로보다 길다면 교체 > 세로중 제일 긴거
                    int garo = 0;
            int sero = 0;
            int num = 0;

            // 가로 세로 비교 후 세로가 더 길면 가로와 교체
            for (int i = 0; i < sizes.length; i++) {
                if (sizes[i][0] < sizes[i][1]) { // 세로가 더 길면
                    num = sizes[i][1]; // 세로길이 추출 50
                    sizes[i][1] = sizes[i][0]; // 세로길이는 가로길이로 변경 50 > 60
                    sizes[i][0] = num; // 가로길이는 세로길이 -> 변경완료 60 > 50
                }
                sero = Math.max(sero, sizes[i][1]);
            }
            //가로는 제일 긴거
            for (int i = 0; i < sizes.length; i++) {
                garo = Math.max(garo, sizes[i][0]); //
            }
            //세로가 가로보다 길다면 교체 > 세로중 제일 긴거


            return garo * sero;
    }
}