import java.util.Scanner;

public class Java_24265_알고리즘수행시간4_B3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Long n = sc.nextLong();
		Long res = 0L;
		for (int i = 1; i < n; i++) {
			res += (long)(n - i);
		}
		System.out.println(res);
		System.out.println(2);
	}
}