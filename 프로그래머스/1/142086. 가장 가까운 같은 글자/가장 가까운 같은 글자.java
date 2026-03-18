class Solution {
    public int[] solution(String s) {
            int[] res = new int[s.length()];
            String str = "";
            int lastidx = 0;

            for (int i = 0; i < s.length(); i++) {
                // 중복 있으면 해당 인덱스 반환
                int idx = str.indexOf(s.charAt(i));

                //없으면
                if (idx == -1) {
                    // res에 -1추가
                    res[i] = -1;
                    // str에 현재 글자 추가
                    str += s.charAt(i);

                    // 있으면
                } else {
                    // 마지막으로 중복 글자 있던 인덱스 위치
                    int prev = str.lastIndexOf(s.charAt(i), i - 1);
                    res[i] = i - prev;
                    // 동일하게 추가
                    str += s.charAt(i);
                }
            }
            return res;
    }
}