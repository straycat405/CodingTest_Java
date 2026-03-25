class Solution {
    public String solution(int a, int b) {
            // 1월 1일은 금요일
            // a월 b일은 무슨요일?
            // 윤년 - 2월 29일까지 있음
            // 각 달을 배열로 선언
            // a달 > a-1 달만큼 일단 넘김
            // b일 > b일만큼 넘김 > 두 숫자 합함
            // 7 나눈 나머지로 요일 유추

            // ex) 5월 24일의 경우

            int[] months = new int[] {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            String[] days = new String[] {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};

            int total = 0;

            for (int i = 0; i < a-1; i++) {

                total += months[i];
                // 31 + 29 + 31 + 30 = 121
            }
            // 121 + 24 = 145
            total += b;
            // 145 % 7 = 20...5 > 금 / 토 / 일 / 월/ 화
            return days[total % 7];
    }
}