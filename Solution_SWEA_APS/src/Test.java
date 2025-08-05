
public class Test {
	public static void main(String[] args) {
		// 특정 인덱스를 기준으로 양쪽으로 퍼지게 순회해보세요.
		// 0 1 2 [3] 4 5 6
		// 0 1 [2] 3 4 5 6
		
		int[] arr = new int[] {0,1,2,3,4,5,6};
		int mid = 3; //인덱스
		System.out.println("기준 인덱스 : " + mid);
		for (int i = 0; i < arr.length; i++) { // 1 2 3 4 5 6 (length까지 다 돌고 조건 맞는 것만 출력하는게 맞음)
			if(mid-i >= 0) {
				System.out.printf(arr[mid-i] + " ");
			}
			if(mid+i < arr.length) {
				System.out.print(arr[mid+i] + " ");
			}
			System.out.println();
		}
		
		for (int i = 0; i < 10000; i++) {
			System.out.println(i);
		}
	}//end of main
}//end of class




