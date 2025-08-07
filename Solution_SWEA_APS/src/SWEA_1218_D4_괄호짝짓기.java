import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class SWEA_1218_D4_괄호짝짓기 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 테케 10개
		for (int testCase = 1; testCase <= 10; testCase++) {
			// 테케 길이 입력받기
			int len = Integer.parseInt(br.readLine());
			// 테케 길이만큼 괄호 입력받기
			String str = br.readLine();
			char[] arr = new char[str.length()];
			for (int i = 0; i < str.length(); i++) {
				arr[i] = str.charAt(i);
			}
			
			Stack<Character> stack = new Stack<>();
			int res = 1;
			for (int i = 0; i < arr.length; i++) {
				//스택에 여는괄호 넣기
				if(arr[i] == '(' || arr[i] == '[' || arr[i] == '{' || arr[i] == '<') {
					stack.push(arr[i]); 
				}
				//닫는괄호면 매칭되는 여는괄호 pop
				if(arr[i] == ')' && stack.peek() == '(') stack.pop();
				else if(arr[i] == ']' && stack.peek() == '[') stack.pop();
				else if(arr[i] == '}' && stack.peek() == '{') stack.pop();
				else if(arr[i] == '>' && stack.peek() == '<') stack.pop();
				else stack.push(arr[i]);
				
			}
//			System.out.println(stack);
//			if(!stack.isEmpty()) res = 0;
//			System.out.println("#"+testCase+" "+res);
		}//end of for testCase
	}//end of main
}//end of class
