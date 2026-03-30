import java.util.*;

class Solution {
    public int[] solution(int[] answers) {

            int[] aanswer = new int[] {1,2,3,4,5};
            int[] banswer = new int[] {2,1,2,3,2,4,2,5};
            int[] canswer = new int[] {3,3,1,1,2,2,4,4,5,5};

            int acnt = 0;
            int bcnt = 0;
            int ccnt = 0;

            for (int i = 0; i < answers.length; i++) {
                if (answers[i] == aanswer[i%5]) {
                    acnt++;
                }

                if (answers[i] == banswer[i%8]) {
                    bcnt++;
                }

                if (answers[i] == canswer[i%10]) {
                    ccnt++;
                }
            }

            ArrayList<Integer> result = new ArrayList<>();

            // a가 제일 큰 경우
            if (acnt > bcnt && acnt > ccnt) {
                return new int[] {1};
            }

            // b가 제일 큰 경우
            if (bcnt > acnt && bcnt > ccnt) {
                return new int[] {2};
            }

            // c가 제일 큰 경우
            if (ccnt > acnt && ccnt > bcnt) {
                return new int[] {3};
            }

            // a,b가 공동 우승인 경우
            if (acnt == bcnt && acnt > ccnt) {
                return new int[] {1,2};
            }

            // b,c가 공동 우승인 경우
            if (bcnt == ccnt && bcnt > acnt) {
                return new int[] {2,3};
            }

            // a,c가 공동 우승인 경우
            if (acnt == ccnt && acnt > bcnt) {
                return new int[] {1,3};
            }

            // 셋 다 동률인 경우
            if (acnt == bcnt && bcnt == ccnt) {
                return new int[] {1,2,3};
            }

            return null;
    }
}