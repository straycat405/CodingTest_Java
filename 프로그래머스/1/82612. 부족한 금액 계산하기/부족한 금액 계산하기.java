class Solution {
    public long solution(int price, int money, int count) {
        
        int num = 0;
        
        for (int i = 1 ; i <= count ; i ++) {
            num += i;
        }
        
        return money > (long)price*num ? 0 : (long)price*num - money;
    }
}