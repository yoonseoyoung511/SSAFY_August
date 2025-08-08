
public class Stack08_팩토리얼 {
	public static void main(String[] args) {
		//재귀의 흐름을 손으로 등 연습할 때는 그려서 많이 해보자~
		System.out.println(fact(5));
		System.out.println(fact(13));
	}
	
	//팩토리얼 재귀함수
	public static long fact(long n) {
		//1. 기본 부분
		if(n <= 1) //정답은 없음. 문제 보고 판단하자
			return 1;
		
		//2. 재귀 부분
		return n * fact(n - 1);
		
		
	}
}
