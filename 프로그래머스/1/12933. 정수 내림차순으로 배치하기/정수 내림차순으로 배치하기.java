import java.util.*;
import java.util.stream.*;

class Solution {
    public long solution(long n) {
        String result = String.valueOf(n)
            .chars()
            .boxed()
            .sorted((a,b) -> b - a)
            .map(c -> String.valueOf((char)c.intValue()))
            .collect(Collectors.joining());
        
        return Long.parseLong(result);
            
    }
}