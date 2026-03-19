class Solution {
    public String solution(int[] food) {
        
            StringBuilder sb1 = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();

            for (int i = 1; i < food.length; i++) {
                // i번 food > i값으로 (i/2) 번만큼 반복
                String str1 = String.valueOf(i).repeat((food[i]/2));
                sb1.append(str1);
                sb2.append(str1);
            }
            sb2.reverse();

            // 0 붙이고
            sb1.append("0");
            // 반전한 값 저장 한것 붙이기
            sb1.append(sb2);

            return sb1.toString();
        
    }
}