
//기초자료형, 참조자료형 차이 명확히 인지하면
//아래 코드 좀더 수월하게 이해됨

import java.util.Arrays;

public class Stack04_함수호출 {
	public static void main(String[] args) {
		System.out.println("메인함수 실행");
		int a = 10;
		System.out.println(a);
		function1();
		System.out.println("메인함수 종료");
	}
	private static void function1() {
		System.out.println("함수1 실행");
		int a = 20;
		int[] arr = {1,2,3};
		System.out.println(Arrays.toString(arr));
		function2(a, arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(a);
		System.out.println("함수1 종료");
	}

	//void가 아니라 int[]를 반환하도록 수정하면 저거 34번라인 내용 들고 나갈수 있을지도?
	private static void function2(int a, int[] arr) {
		System.out.println("함수2 실행");
		System.out.println(a);
		a = 30;
//		arr[1] = 1000;
		//아래는 안 됨. 참조자료형 이해도 높이자
//		arr = new int[] {10,20,30}; 
		System.out.println(a);
		System.out.println("함수2 종료");
	}
}
