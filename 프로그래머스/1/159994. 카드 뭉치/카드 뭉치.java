class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
            int p1 = 0; // cards1에서 다음에 꺼낼 위치를 가리키는 포인터
            int p2 = 0; // cards2에서 다음에 꺼낼 위치를 가리키는 포인터

            for (String word : goal) { // goal의 단어를 앞에서부터 순서대로 확인
                if (p1 < cards1.length && cards1[p1].equals(word)) {
                    // cards1의 현재 맨 앞 카드가 일치하면 사용 (포인터 전진)
                    p1++;
                } else if (p2 < cards2.length && cards2[p2].equals(word)) {
                    // cards2의 현재 맨 앞 카드가 일치하면 사용 (포인터 전진)
                    p2++;
                } else {
                    // 어느 쪽 카드 뭉치의 맨 앞도 현재 단어와 일치하지 않으면 불가능
                    return "No";
                }
            }

            return "Yes"; // goal의 모든 단어를 성공적으로 매칭했으면 Yes
        
    }
}