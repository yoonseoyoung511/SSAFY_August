import java.util.Arrays;

public class Array06_선택정렬 {
	public static void main(String[] args) {
		int[] arr = new int[] { 7, 3, 9, 10, 2, 1 };
		selectionSort(arr);
		
		System.out.println(Arrays.toString(arr));
	}

	public static void selectionSort(int[] arr) {
		int N = arr.length;
		for (int i = 0; i < N - 1; i++) { //원소 6개면, 마지막 원소 빼고 5번만 사이클돌면 됨
			int minIndex = i; //내가 현재 정렬하고 싶은 위치를 가장 작은 값이라고 생각하겠다!
			for (int j = i+1; j < N; j++) {
				//내가 가장 작다고 믿은 그 값이...j가 가리키는 값보다 더 커버린다면..
				if(arr[minIndex] > arr[j]) {
					minIndex = j;
				}
			}//해당 for문 완료시 알 수 있는 것은?
			//정렬되어 있지 않은 요소들 중 가장 작은 값의 Index를 알고 있다.

//			if(minIndex == 1) continue;
			//현재 내가 정렬하고 싶은 위치와 minIndex가 같다면 swap 필요한가? -> 굳이긴 함.
			//그냥 바꾸지.. 모든 사이클에서 이 조건문 계속 확인해줘야 되서 오히려 방해될 수 있음. 
			
			//swap
			int tmp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = tmp;
		} //i의미 : N-1번 사이클만 돌면 된다 ! / 내가 정렬하고 싶은 위치
		
		
	}
}
