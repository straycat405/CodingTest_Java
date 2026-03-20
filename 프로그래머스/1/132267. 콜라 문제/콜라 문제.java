class Solution {
    public int solution(int a, int b, int n) {
            int result = 0;
            
            while (n/a >= 1) {
                int bonus = n/a*b;
                int remain = n%a;
                result = result + bonus;
                n = bonus + remain;
            }


            return result;
    }
}