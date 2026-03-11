class Solution {
    public String[] solution(String[] strings, int n) {
            for (int i = 0; i < strings.length - 1; i++) {
                int minIdx = i;

                for (int j = i + 1; j < strings.length; j++) {
                    char minChar = strings[minIdx].charAt(n);
                    char jChar = strings[j].charAt(n);

                    if (jChar < minChar) {
                        // n번째 문자가 더 작으면 최솟값 갱신
                        minIdx = j;
                    } else if (jChar == minChar) {
                        // n번째 문자가 같으면 사전순 비교
                        if (strings[j].compareTo(strings[minIdx]) < 0) {
                            minIdx = j;
                        }
                    }
                }

                // 내부 루프 종료 후 한 번만 swap
                String temp = strings[minIdx];
                strings[minIdx] = strings[i];
                strings[i] = temp;
            }

            return strings;
    }
}