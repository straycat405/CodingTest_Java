import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        
        ArrayList<Integer> answer = new ArrayList<>();
		
		int first = 0;
		int last = 0;
		
		for (int i = 0 ; i < arr.length ; i++) {
            if (arr[i] == 2) {
                first = i;
                break;
            }
        }
        
        for (int i = arr.length-1 ; i > 0 ; i--) {
            if (arr[i] == 2) {
                last = i;
                break;
            }
        }
        
        if (last != 0) {
            for (int i = first ; i <= last ; i++) {
                answer.add(arr[i]);
        	
            }
        }
        

		
		if (answer.isEmpty()) {
                answer.add(-1);
        }
        
        return answer.stream().mapToInt(idx -> idx).toArray();
        
 
        
    }
}