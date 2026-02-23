class Solution {
    public String solution(String s) {
        
        int leng = s.length();
        
        if (leng == 1) {
            return s;
        } else if (leng % 2 == 1) {
            return s.substring((int)(leng/2),(int)(leng/2)+1);
        } else {
            return s.substring((int)(leng/2)-1,(int)leng/2+1);
        }
    }
}