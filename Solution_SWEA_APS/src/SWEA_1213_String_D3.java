import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SWEA_1213_String_D3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int T = 1; T <= 10; T++) {
			br.readLine();
			
			String pattern = br.readLine();
			String text = br.readLine();
			int p = pattern.length();
			int t = text.length();
			int res = 0; //패턴매칭 횟수
			
			//패턴 매칭 - 브루트포스
			for (int i = 0; i < t-p+1; i++) {
				int tmp = 0; //연속된 문자열 전부 맞는지 확인
				boolean flag = true;
				for (int j = 0; j < p; j++) {
					if(text.charAt(i+j) != pattern.charAt(j)) {
						flag = false;
						break;
					}
					if(flag) {tmp++;}
					if(tmp == p) {res++;}
				}
			}
			System.out.println("#"+T+" "+res);
		}//end of for testCase
	}//end of main
}//end of class
