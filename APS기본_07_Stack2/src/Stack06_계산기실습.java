import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Stack06_계산기실습 {
	public static void main(String[] args) {
		// 문자열로 된 수식 -> 입력받은 수식
		String infix = "(6+5*(2-8)/2";
		// 연산자 우선순위 (Map 이용해보자) -> 스택 내부에서 판단!
		// * / : 인덱스 2
		// + - : 인덱스 1
		// ( : 인덱스 0
		Map<Character, Integer> priority = new HashMap<>();
		priority.put('*', 2);
		priority.put('/', 2);
		priority.put('+', 1);
		priority.put('-', 1);
		priority.put('(', 0);

		StringBuilder postfix = new StringBuilder();
		// 연산자를 담는 스택. operation
		Stack<Character> op = new Stack<>();

		// 글자를 하나씩 읽어오자! (피연산자는 한자리수임을 보장하겠다)
		for (int i = 0; i < infix.length(); i++) {
			char tmp = infix.charAt(i);
			// 1. 피연산자라면 출력
			if (tmp >= '0' && tmp <= '9') {
				postfix.append(tmp);
			} // 2. 연산자라면
				// 2-1. '(' 여는 소괄호라면
			else if (tmp == '(') {
				// 겉바 -> 바로 추가
				op.push(tmp);
			}
			// 2-2. ')' 닫는소괄호 -> 여는 소괄호 만날 때까지 pop
			else if (tmp == ')') {
				while (op.peek() != '(') {
					postfix.append(op.pop());
				}

				op.pop(); // 스택의 top은 '('를 가리키고 있음. 버리기
			}
			// 2-3. 연산자라면 * / + -
			else {
				// 공백상태라면 우선순위 상관없이 냅다 넣어
				if (op.isEmpty()) {
					op.push(tmp);
				} else {
					// 연산자 우선순위 비교해서 처리한다! (마음의 숙제)
//					// 1. postfix에서 2개 꺼내
//					char a = postfix.charAt(0);
//					char b = postfix.charAt(1);
//					System.out.print(a);
//					System.out.print(b);
//
//					// 2. 2개를 연산자로 연산하기
//					int sum = a + b;
//
//					// 3. 그 값 다시 postfix에 넣기
//					postfix.append(sum);
//
//					// priority 사용. 2개

					while (!op.isEmpty() && priority.get(op.peek()) >= priority.get(tmp)) {
						postfix.append(op.pop());
					}
					op.push(tmp);

				}
			}

		} // 하나씩 읽는 for문
		while (!op.isEmpty())
			postfix.append(op.pop());

		// 중위 -> 후위 바꿔서 계산. 해봐
		System.out.println("후위 표기식: " + postfix.toString());

	}// end of main
}// end of class
