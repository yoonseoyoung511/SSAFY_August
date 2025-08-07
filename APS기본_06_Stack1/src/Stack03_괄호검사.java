import java.util.Stack;

public class Stack03_괄호검사 {
	// 소괄호만 있어! 간단한 문제 만들기
	public static void main(String[] args) {
		// 괄호검사
		// 1. 여는괄호와 닫는괄호의 개수 동일해야 한다.
		// 2. 여는괄호는 닫는괄호보다 먼저 나와야 한다.
		// 3. 괄호는 포함관계여야 한다. (소괄호만 있으니까 이번 경우는 굳이?)

		String str = "()()()()()";

		// 스택에는 항상 여는괄호만 들어감. (닫는괄호 들어가지 않음)
		Stack<Character> stack = new Stack<>();
		boolean isOk = true; // 정상인지 아닌지 체크
		for (int i = 0; i < str.length(); i++) {
			//1. 여는괄호 넣어!
			if(str.charAt(i) == '(') {
				stack.push(str.charAt(i));
//				stack.push('('); //해당 문제 한정이라 조심스러움
			} 
			//2. 닫는괄호 확인 필수
			else {
				//공백체크
				if(stack.isEmpty()) {
					isOk = false;
					break;
				} else {
					char c = stack.pop(); //검사 실시
//					if(c == ')') ...
					//지금은 특수한 상황이라 안해도 되지만 오후에 해야됨
				}
			}
		}//검사 for문
		
		//괄호검사 끝
		if(isOk && stack.isEmpty()) {
			System.out.println("검사 결과 이상 무");
		} else {
			System.out.println("이슈 발생");
		}
		
		//괄호 검사 반대로
		if(!isOk || !stack.isEmpty()) { //둘중 하나라도 걸리면 이슈 발생
			System.out.println("이슈 발생");
		} else {
			System.out.println("검사 결과 이상 무");
		}
		
		
		
		
		
		
		
		
		
		

	}// end of main
}// end of class
