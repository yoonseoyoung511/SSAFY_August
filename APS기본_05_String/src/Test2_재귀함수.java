//알고리즘 기본 과목평가 => 실습구현문제
/**
 * 재귀함수 : 자신을 호출하는 함수
 */
public class Test2_재귀함수 {
	public static void main(String[] args) {
//		1 2 3 4 5
		for (int i = 1; i <= 5; i++) {
			System.out.print(i);
		}
		System.out.println();

		f(1); // 재귀함수

//		1 3 5 7 9
		f2(1); // 재귀함수

//		1 2 3 4 5 6 7 8 9 10 값의 합 출력
		f3(1);

	} // end of main

	/** 1 2 3 4 5 출력하는 재귀함수 */
	public static void f(int i) {
		if (i > 5) { // 종료파트
			System.out.println();
			return;
		} else { // 재귀파트
			System.out.print(i + " ");
			f(i + 1);
		}
	}

	/** 1 3 5 7 9 출력하는 재귀함수 */
	public static void f2(int i) {
		if (i > 9) { // 종료파트
			System.out.println();
			return;
		} else { // 재귀파트 - 반복할 일
			System.out.print(i + " ");
			f2(i + 2);
		}
	}

	private static int sum = 0; // f3. 멤버변수를 만들면 됨.
	/** 1 2 3 4 5 6 7 8 9 10 값의 합 출력하는 재귀함수 */
	public static void f3(int i) {
		if (i > 10) { // 종료파트
			System.out.println("1~10 합 : " + sum);
			return;
		} else { // 재귀파트
			sum += i;
			f3(i + 1);
		}
	}
}// end of class
