import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_IM_장난감 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int TC = Integer.parseInt(br.readLine(), " ");
		for (int testCase = 1; testCase <= TC; testCase++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int X = Integer.parseInt(st.nextToken()); //골판지 크기 0 <=X, Y <=100
			int Y = Integer.parseInt(st.nextToken()); //골판지 크기
			
			double h = ((X+Y) - Math.sqrt((X+Y)*(X+Y)-3*X*Y)) / 6;
			double V = (X-2*h)*(Y-2*h)*h;
			//반올림, 소수점 6째자리까지
			sb.append("#").append(testCase).append(" ").append(String.format("%.6f", V)).append("\n");
		}
		System.out.print(sb);
	}
}

