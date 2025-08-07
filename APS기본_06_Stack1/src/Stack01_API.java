import java.util.Stack;

public class Stack01_API {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		// 문자를 담을 수 있는 stack
//	Stacl<string>

		// 주요 메서드
		// 1. push(item)
		int result = stack.push(10); // 반환 결과 : 내가 넣은 item이 반환됨
		System.out.println(result);
		
		stack.push(20);
		stack.push(30);
		
		// 2. pop() : 꺼내기. 꺼내면 개수 줄어듦
		System.out.println(stack.pop()); // 갖고 있는 가장 위에 있는 친구 반환
		System.out.println(stack.pop()); // 갖고 있는 가장 위에 있는 친구 반환
		System.out.println(stack.pop()); // 갖고 있는 가장 위에 있는 친구 반환
//		System.out.println(stack.pop()); // EmptyStackException. 없는 걸 꺼내려고 하면 예외 발생
		
		//무작정 빼면 안됨 -> 비어있는지 check : 
		// 3. isEmpty()
		System.out.println(stack.isEmpty());
		//안에 있는거 전부 빼라
		stack.clear(); // 스택 초기화. 데이터 다 없앰
		//조건을 확인해보자
		while(!stack.isEmpty()) {
			stack.pop();
		}
		while(stack.size() > 0) {
			stack.pop();
		}
		
		System.out.println(stack.size());
		
		// 4. peek : 맨 위에 있는 친구를 확인. 반환해서 쓰진 않음 = 개수 안 줄어듦
		stack.push(100);
		stack.push(200);
		System.out.println(stack.peek());
		System.out.println(stack.size()); //peek해도 사이즈는 그대로
		
		
	}
}
