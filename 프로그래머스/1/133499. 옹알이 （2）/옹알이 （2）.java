class Solution {
    public int solution(String[] babbling) {
        
         String[] words = {"aya", "ye", "woo", "ma"}; // 허용 발음 목록
            int cnt = 0;

            for (String bab : babbling) {
                if (canSpeak(bab, words)) {
                    cnt++;
                }
            }

            return cnt;

    }
    
    private static boolean canSpeak(String bab, String[] words) {
            String prev = ""; // 바로 직전에 사용한 발음 저장 (연속 금지 체크용)

            // 남은 문자열이 있는 동안 앞에서부터 잘라냄
            while (!bab.isEmpty()) {
                boolean matched = false;

                for (String word : words) {
                    // 현재 문자열이 word로 시작하는지 확인 (contains가 아닌 startsWith!)
                    if (bab.startsWith(word)) {

                        // 연속 같은 발음 체크: 직전과 같으면 불가
                        if (word.equals(prev)) {
                            return false;
                        }

                        bab = bab.substring(word.length()); // 앞에서 잘라냄
                        prev = word;   // 직전 발음 업데이트
                        matched = true;
                        break; // 매칭됐으면 다시 앞에서부터 시도
                    }
                }

                // 어떤 발음으로도 시작하지 않으면 불가능한 문자열
                if (!matched) {
                    return false;
                }
            }

            return true; // 문자열을 남김없이 다 소비함
        }
}