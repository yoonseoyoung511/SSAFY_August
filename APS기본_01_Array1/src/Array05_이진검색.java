import java.util.Arrays;

//이진 검색 : 정렬 필수 !!!!!
public class Array05_이진검색 {
	public static void main(String[] args) {
		//L, R이 서로 교차되면 더이상 찾을 범위가 없음. break
		int[] arr = new int[] {2, 3, 7, 8, 13, 14, 22, 45, 49, 65, 93};
		Arrays.sort(arr);
	}
	public static int binarySearch(int[] arr, int key) {
		//범위를 컨트롤하는 변수 2개
		int L = 0;
		int R = arr.length - 1; //마지막 인덱스

		//교차가 되면 멈춘다 !
		while(L <= R) {
			int mid = (L+R)/2; //정수처리 가능. 소수점 or 나머지는 버림.
			if(arr[mid] == key) {
				return mid;
			} else if (arr[mid] > key) {
				//찾고자 하는 값이 중앙값보다 작다면 ... R을 움직임
				R = mid - 1;
			} else {
				//반대의 경우는 L을 움직여...
				L = mid + 1;
			}
		}
		return -1;
	}
}
