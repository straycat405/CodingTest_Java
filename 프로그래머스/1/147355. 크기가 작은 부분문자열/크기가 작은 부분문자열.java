class Solution {
    public int solution(String t, String p) {
        
            //p 숫자변환
            long pNum = Long.parseLong(p);
            int count = 0;

            //반복문 -> t의 substring.value >= p count ++
            for (int i = 0; i <= t.length()-p.length() ; i ++) {
                if (Long.parseLong(t.substring(i, i+p.length())) <= pNum ) {
                    count++;
                }
            }

            return count;
        
    }
}