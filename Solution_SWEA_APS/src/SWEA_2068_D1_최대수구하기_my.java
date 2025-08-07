import java.util.Scanner;

public class SWEA_2068_D1_최대수구하기_my {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int max = 0;
		int[][] arr = new int[T][10];
		for (int i = 0; i < T; i++) {
			max = 0;
			for (int j = 0; j < 10; j++) {
				arr[i][j] = sc.nextInt();
				if (max < arr[i][j])
					max = arr[i][j];
			}
			System.out.println("#" + (i + 1) + " " + max);
		}
	}
	
	
}
