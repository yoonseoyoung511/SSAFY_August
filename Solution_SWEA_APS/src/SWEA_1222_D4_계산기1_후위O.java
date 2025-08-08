import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class SWEA_1222_D4_계산기1_후위O {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int testCase = 1; testCase <= 10; testCase++) {
//			String tc = br.readLine();

			int T = Integer.parseInt(br.readLine());
			String infix = br.readLine();
			
			StringBuilder postfix = new StringBuilder();
			Stack<Character> op = new Stack<>(); //연산자 담는 스택
			Stack<Character> sum = new Stack<>(); //연산자 담는 스택
			
			int res = 0;
//			int[] arr = new int[T/2+1];
//			StringTokenizer st = new StringTokenizer(infix, "+");
			
//			//글자 읽어오기
//			for (int i = 0; i < (T/2)+1; i++) {
//				arr[i] = Integer.parseInt(st.nextToken());
//			}
			
			//후위 출력
			for (int i = 0; i < T; i++) {
				char tmp = infix.charAt(i);
				if(tmp >= 0 && tmp <= 9) {
					//1. 피연산자면 출력
					postfix.append(tmp);
				} else {
					//2-1. op 공백이면 우선 넣기
					if(op.isEmpty()) {
						op.push(tmp);
					} else if(i > 2) {
					//2-2. op에 뭐 있으면 하나 빼고 다시 넣기
						postfix.append(op.pop());
						op.push(tmp);
					} else {
						postfix.append(op.pop()); //마지막 +
					}
				}
			}//출력 for문
			
//			//후위 계산
//			for (int i = 0; i < args.length; i++) {
//				
//			}
			
			
			System.out.println("후위 표기식 : " + postfix.toString());
//			System.out.println("#"+testCase+" "+sum);
		}//end of for testCase
	}//end of main
}//end of class
