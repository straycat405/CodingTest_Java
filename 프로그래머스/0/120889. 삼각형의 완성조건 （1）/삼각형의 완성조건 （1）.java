import java.util.*;

class Solution {
    public int solution(int[] sides) {
       Arrays.sort(sides);
		
		System.out.println(sides[0]);
		System.out.println(sides[1]);
		System.out.println(sides[2]);
		
		if (sides[2] < sides[0] + sides[1]) {
			return 1;
		} else {
			return 2;
		}
    }
}