import 연결스택.LinkedStack;

public class LinkedList02_연결스택 {
public static void main(String[] args) {
	LinkedStack stack = new LinkedStack();
	stack.push(10);
	stack.push(10);
	stack.push(10);
	stack.push(10);
	stack.push(10);
	stack.push(10);
	stack.push(10);
	System.out.println(stack);

	stack.pop();
	stack.pop();
	stack.pop();
	stack.pop();
	stack.pop();
	System.out.println(stack);
}
}
