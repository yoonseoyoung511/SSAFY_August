import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA_1222_D4_계산기1_후위X {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int testCase = 1; testCase <= 10; testCase++) {
//			String tc = br.readLine();

			int T = Integer.parseInt(br.readLine());
			String infix = br.readLine();
			
//			StringBuilder postfix = new StringBuilder();
//			Stack<Character> op = new Stack<>();
			int[] arr = new int[T/2+1];
			int sum = 0;
			StringTokenizer st = new StringTokenizer(infix, "+");
			
			//글자 읽어오기
			for (int i = 0; i < (T/2)+1; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
//				System.out.print(arr[i]);
				sum += arr[i];
			}
			System.out.println("#"+testCase+" "+sum);
		}//end of for testCase
	}//end of main
}//end of class
