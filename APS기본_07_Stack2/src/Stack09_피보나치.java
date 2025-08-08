//import java.util.Arrays;
/**
 * 알고리즘 성능 평가
 * 1. 시간 복잡도 => 더 중요
 * 2. 공간 복잡도
 * 시간복잡도 살릴 수 있으면 공간을 좀 손해보기도 함
 */
public class Stack09_피보나치 {
	static int[] count = new int[100]; //fibo(n) 반복 횟수 구해보기
	public static void main(String[] args) {
		//n은 음수가 들어오지 않는다!
//		System.out.println(fibo2(45)); //저장해놓은 친구는 답이 바로 나옴. 속도 짧음
//		System.out.println(fibo(5)); //중복호출 때문에 오래 걸림.
//		System.out.println(Arrays.toString(count));
//		2의 6승 = 64
		
//		반복문으로 64나오게 출력
		int mul = 1;
		for (int i = 0; i < 6; i++) {
			mul *= 2;
		}
		System.out.println("2의 6승 : " + mul);
		System.out.println("2의 6승 : " + power(2, 6));
		
	}

	//base의 ex 승 값을 리턴하는 거듭제곱 함수
	public static int power(int base, int ex) {
		if (ex == 0) {
			return 1;
		} else {
			return base * power(base, ex -1);
		}
		
		
//		int res = 1; 
//		for (int i = 0; i < ex; i++) {
//			res *= base;
//		}
//		return res;
	}
	
	//n 구하려면 n-1, n-2가 필요해
	public static int fibo(int n) {
//		count[n]++;
		//기본 부분
//		if(n == 0) return 0;
//		if(n == 1) return 1;
		if(n < 2) return n;
		//재귀 부분
		return fibo(n-1) + fibo(n-2);
	}
	
	//저장해서 쓰면 중복연산을 막을 것 같은데?
	static int[] memo = new int[50];
	static {
		memo[0] = 0;
		memo[1] = 1;
	}
	public static int fibo2(int n) {
		if(n >= 2 && memo[n] == 0)
			memo[n] = fibo2(n-1)+fibo2(n-2);
		return memo[n];
	}
}