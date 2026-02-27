class Solution {
    public int[] solution(int n, int m) {
        
        int gcd = gcd (n,m);
        int lcm = n / gcd * m;
        return new int[] {gcd,lcm};
        

        
    }
    
            private int gcd (int a, int b) {
            return b == 0 ? a : gcd(b, a % b);
        }
}