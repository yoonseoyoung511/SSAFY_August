package 이중연결리스트;

public class Node {
	String data; 
	Node prev;	//이전 주소
	Node next; //이후 주소
	
	public Node(String data) {
		this.data = data;
	}
}
