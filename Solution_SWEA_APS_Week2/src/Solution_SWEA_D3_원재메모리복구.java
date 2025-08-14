import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution_SWEA_D3_원재메모리복구 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			String str = br.readLine();
			char[] arr = str.toCharArray();
			char[] zero = new char[str.length()];
			int count = 0;
			char tmp = '0';
			
			for (int i = 0; i < arr.length; i++) {
				if(arr[i] == tmp) {
					continue;
				} else {
					count++;
					tmp = arr[i];
					for(int j = i ; j < arr.length ; j++) {
						zero[j] = tmp;
					}
				}
			}
			sb.append("#").append(tc).append(" ").append(count).append("\n");
		}//end of for testCase
		System.out.println(sb);
	}//end of main
}//end of class
