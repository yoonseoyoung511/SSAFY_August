
public class Array04_순차검색 {
	public static void main(String[] args) {
		int[] arr = new int[] { 93, 13, 45, 3, 2, 7, 49, 65, 8, 14, 22 };
		int N = arr.length;

		System.out.println(searchWhileNoSort(arr, 2));
		System.out.println(searchForNoSort(arr, 2));

	}

	// 반환타입 : 찾으면 해당 위치 반환 / 없으면 -1을 반환
	public static int searchWhileNoSort(int[] arr, int key) {
		int i = 0;
		while (i < arr.length) {
			// 찾았으면 return할거야!
			if (arr[i] == key) {
				return i;
			}
			i++;
		}

		return -1;
	}

	public static int searchForNoSort(int[] arr, int key) {
		// 마음의 숙제
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == key) {
				return i;
			}
		}
		return -1;
	}
	
	public static int searchForSort(int[] arr, int key) {
		for (int i = 0; i < arr.length; i++) {
			//이렇게 마무리 지으면 정렬 안된 것과 차이가 없다.
			if(arr[i] == key) {
				 return i;	
			} else if(arr[i] > key) {
				 return -1;	
			} 
			
//			if(arr[i] == key) {
//				return i;	
//			} 
//			if(arr[i] > key) {
//				return -1;	
//			} 
		}
		return -1;	
	}
	
//	public static int searchForSort(int[] arr, int key) {
//		
//	}
//	

}
