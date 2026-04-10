class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        
            // 0은 다 맞거나 다 틀리거나를 가정
            // 0이 아닌 번호 중 당첨번호의 갯수를 먼저 세기
            //lottos = 내 복권 번호
            // win_nums = 당첨 번호
            // 순서가 다르지만 일치하는 것들을 찾으면? 카운트

            int count = 0;
            int zeroCount = 0;

            for (int i = 0; i < lottos.length; i++) {
                if (lottos[i] == 0) {
                    zeroCount++;
                }

                for (int j = 0; j < win_nums.length; j++) {
                    if (lottos[i] == win_nums[j]) {
                        count++;
                    }
                }
            }

            // 1등 - 6개 모두 일치
            // 2등 - 5개 일치
            // 3등 - 4개 일치
            // 4등 - 3개 일치
            // 5등 - 2개 일치
            // 6등 - 1개 일치, 0개 일치 - count + zeroCount > 1

            int firstNum = 0;
            int secondNum = 0;

            // zeroCount가 모두 맞았다고 가정
            firstNum = count + zeroCount > 1 ? 7 - count - zeroCount : 6;
            // zeroCount가 모두 틀렸다고 가정
            secondNum = count > 1 ? 7 - count : 6;

            return new int[]{firstNum, secondNum};
        
        
        
    }
}