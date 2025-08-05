import java.util.Arrays;
import java.util.Scanner;

public class SWEA_Flatten_1208_D3_지을 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 100; //가로
		
		for (int i = 1; i <= 10; i++) {
			int dump = sc.nextInt();
			int arr[] = new int[n];
			//각 상자의 높이값 입력
			for (int j = 0; j < n; j++) {
				arr[j] = sc.nextInt(); 
			}
			//덤프
			for (int j = 0; j < dump; j++) {
				Arrays.sort(arr);
				arr[99] -= 1;
				arr[0] += 1;
			}
			//출력
			Arrays.sort(arr);
			System.out.println("#" + i + " " + (arr[99]-arr[0]));
		}
	}
}
