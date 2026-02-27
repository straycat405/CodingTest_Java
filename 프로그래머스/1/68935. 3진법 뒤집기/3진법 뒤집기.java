class Solution {
    public int solution(int n) {
        
        // n을 3으로 계속 나누며 나머지를 쌓기
        StringBuilder sb = new StringBuilder();
        
        while (n > 0) {
            sb.append(n%3);
            n /= 3;
        }
        
        // 나머지를 역순으로 쌓았으므로 그대로 10진법 변환
        int decimal = 0;
        for (int i = 0 ; i < sb.toString().length() ; i ++) {
            // 왼쪽부터 읽으며 3을 곱해가며 누적
            decimal = decimal * 3 + (sb.toString().charAt(i) - '0');
        }
        
        return decimal;
    }
}