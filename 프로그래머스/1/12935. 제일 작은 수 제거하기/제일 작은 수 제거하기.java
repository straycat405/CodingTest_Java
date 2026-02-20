import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] arr) {
            
        int[] answer = Arrays.stream(arr)
                        .filter(i -> i != Arrays.stream(arr).min().getAsInt())
                        .toArray();
        
        if (answer.length == 0) {
            List<Integer> list = new ArrayList<>();
            list.add(-1);
            return list.stream().mapToInt(Integer::intValue).toArray();
        }
        
        return answer;
        
    }
}