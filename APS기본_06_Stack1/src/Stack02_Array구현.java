// 제네릭하게 아래처럼 직접 설정할 수도 있음!
//class MyStack<E> {
//	E[] stack = new E[100];
//	int top = -1;
//	boolean push(E item) {
//		return true;
//	}
//}

public class Stack02_Array구현 {
	// 배열을 이용한 구현 -> 고민포인트(배열의 크기) -> 10만~100만 사이의 값 하나 넣어라
	static String[] stack = new String[10];
	static int top = -1; //-1은 인덱스 밖! 공백상태군!

	public static void main(String[] args) {
		//테스트 마구잡이로 해볼거엇
	}//end of main
	
	//1. push
	static boolean push(String item) {
		//냅다 집어넣기 할 수도 잇음
		//but 배열이니까 가득 차있는지 체크할 필요가 있음
//		if(top == stack.length-1) { //stack이 가득 찼으면
		if(isFull()) {
			//가득차있으므로 작업 진행될 수 없어
			//stack 크기 2배로 늘려서 복사해두던가,
			//못한다고 쳐내자!
			System.out.println("가득 찼다.. 배불러잉");
			return false;
		}
		//top을 하나 증가시키고 -> item 삽입하겠다.
		stack[++top] = item;
//		top += 1;
//		stack[top] = item;
		
		//냅다 집어넣기
		return true;
	}
	
	//2. pop : 값 반환. 삭제 O (여기선 덮어쓰기 되니까 굳이 삭제 X)
	static String pop() {
		//배열이 아니더라도 이 연산은 해봐야 된다.
		if(isEmpty()) {
			//공백상태이므로 어떤 작업을 진행해라!
			System.out.println("뺄 거 없다..");
			return null;
		}
		//꺼내자
		return stack[top--]; //어차피 push할 때 top인덱스에 덮어쓰기 하니까 삭제할 필요는 없음.
//		String result = stack[top];
//		top -= 1;
//		return result;
	}
	//3. peek : 값 반환. 삭제 X
	static String peek() {
		//배열이 아니더라도 이 연산은 해봐야 된다.
		if(isEmpty()) {
			//공백상태이므로 어떤 작업을 진행해라!
			System.out.println("뺄 거 없다..");
			return null;
		}
		//꺼내자
		return stack[top--]; //pop에서도 삭제 안하니까 peek도 똑같이 해도 됨.
//		String result = stack[top];
//		top -= 1;
//		return result;
	}
	
	//4. isEmpty
	static boolean isEmpty() {
		return top == -1;
	}
	//5. isFull : 포화상태 체크
	static boolean isFull() {
		return top == stack.length-1;
	}
//	static boolean isFull() {
//		if(top == stack.length-1)
//			return true;
//		else	
//			return false; 
//	}
//	static boolean isFull() {
//		if(top == stack.length-1)
//			return true;
//		return false; //else 굳이 필요없음. 이렇게도 많이 씀
//	}
}//end of class
