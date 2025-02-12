import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		int a = 0;
		int b = 0;
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		int answer = 0;
		
		int[] c = new int[a];
		int d = a;
		
		for (int i = 0 ; i < a ; i ++) {
			c[i] = sc.nextInt();
		}
		
		while (d > 0 && b > 0) {
			// 최대 동전 수 부터 더하기 시작
			answer += b/(c[d-1]);
			// 나머지 값으로 b 초기화
			b = b%(c[d-1]);
			// 카운트 다운 (마지막 동전까지 혹은 b가 0원이 될 때까지)
			d--;
		}
		
		System.out.println(answer);
    }
}