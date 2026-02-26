class Solution {
    public boolean solution(String s) {
        char[] arr = s.toCharArray();
        
        if (s.length() != 4 && s.length() != 6) return false;
        
        for (char a : arr) {
                if (a < '0' || a > '9') return false;
            }
                    return true;
        }
        

    }
