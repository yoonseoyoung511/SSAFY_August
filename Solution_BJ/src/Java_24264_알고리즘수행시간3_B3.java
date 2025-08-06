import java.util.Scanner;

public class Java_24264_알고리즘수행시간3_B3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Long n = sc.nextLong();
		System.out.println(n*n); // 코드1의 최대 실행 횟수 (반복문 2번)
		System.out.println(2); // 시간복잡도 O(N^2) -> 차수는 2
	}
}