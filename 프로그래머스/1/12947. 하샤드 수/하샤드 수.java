import java.util.*;
import java.util.stream.*;

class Solution {
    public boolean solution(int x) {
        
        int[] arr = String.valueOf(x)
            .chars()
            .map (c -> c - '0')
            .toArray();
        
        int sum = Arrays.stream(arr).sum();
        
        return (x%sum ==0);
    }
}