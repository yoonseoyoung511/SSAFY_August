import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
public class SWEA_Flatten_1208_D3_my {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = 100; //가로
		for (int i = 1; i <= 10; i++) {
			int dump = Integer.parseInt(br.readLine());
			int arr[] = new int[n];
			String input[] = br.readLine().split(" ");
			for (int j = 0; j < n; j++) {//각 상자의 높이값 입력
				arr[j] = Integer.parseInt(input[j]);
			}
			for (int j = 0; j < dump; j++) {//덤프
				Arrays.sort(arr);
				arr[99] -= 1;
				arr[0] += 1;
			}			
			Arrays.sort(arr);
			System.out.println("#" + i + " " + (arr[99]-arr[0]));
		}
	}//end of main
}//end of class
