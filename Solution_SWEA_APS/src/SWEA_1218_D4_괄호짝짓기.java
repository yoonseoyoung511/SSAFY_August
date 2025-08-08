import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class SWEA_1218_D4_괄호짝짓기 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 테케 10개
		for (int testCase = 1; testCase <= 2; testCase++) {
			// 테케 길이 입력받기
			int len = Integer.parseInt(br.readLine());
			// 테케 길이만큼 괄호 입력받기
			String str = br.readLine();
			char[] arr = new char[str.length()];
			for (int i = 0; i < str.length(); i++) {
				arr[i] = str.charAt(i);
			}
			
			Stack<Character> stack1 = new Stack<>(); //()
			Stack<Character> stack2 = new Stack<>(); //{}
			Stack<Character> stack3 = new Stack<>(); //[]
			Stack<Character> stack4 = new Stack<>(); //<>
			int res = 1;
			for (int i = 0; i < arr.length; i++) {
				//각 스택에 여는괄호 넣기
				if(arr[i] == '(')	stack1.push(arr[i]); 
				else if(arr[i] == '{')	stack2.push(arr[i]); 
				else if(arr[i] == '[')	stack3.push(arr[i]); 
				else if(arr[i] == '<')	stack4.push(arr[i]); 
				
				//닫는괄호면 매칭되는 여는괄호 pop
				if(arr[i] == ')' && !stack1.isEmpty()) stack1.pop();
				else if(arr[i] == ']' && !stack2.isEmpty()) stack2.pop();
				else if(arr[i] == '}' && !stack3.isEmpty()) stack3.pop();
				else if(arr[i] == '>' && !stack4.isEmpty()) stack4.pop();
//				else stack.push(arr[i]);
				
				//예외처리 : 닫는괄호가 여는괄호보다 먼저 나왔는데 마지막에 짝은 맞음
				//tmp stack 하나 더 만들기?
				//마지막에 tmp에 있는 닫는 괄호까지 짝맞추고도 안 비어 있으면 0 출력
				
				
			}
//			System.out.println(stack);
			if(!stack1.isEmpty() || !stack2.isEmpty() || !stack3.isEmpty() || !stack4.isEmpty()) 
				res = 0;
			System.out.println("#"+testCase+" "+res);
		}//end of for testCase
	}//end of main
}//end of class
