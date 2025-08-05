import java.util.Arrays;
import java.util.Scanner;

public class SWEA_1984_D2_중간평균값구하기_my {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[][] arr = new int[T][10];
		double avg = 0;
		for (int i = 0; i < T; i++) {
			for (int j = 0; j < 10; j++) {
				arr[i][j] = sc.nextInt();
			}
			Arrays.sort(arr[i]);
			double sum = 0;
			for (int j = 1; j <= 8; j++) {
				sum += arr[i][j];
			}
			avg = sum / 8;
			System.out.println("#" + (i + 1) + " " + Math.round(avg));
		}
	}
}
