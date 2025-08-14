import java.util.Arrays;

public class Heap01_Array구현 {
	static int[] heap; // 정수형만 담을 수 있게 세팅 -> 문제따라 결정
	static int heapSize; // 정수형만 담을 수 있게 세팅 -> 문제따라 결정

	public static void main(String[] args) {
		// 최악의 경우를 대비해라 (하나도 빼는 것 없이 전부다 넣었을 때를 가정)
		heap = new int[10]; // 문제보고 결정하기. 9개. 0번 인덱스 버림
		heapSize = 0;

		System.out.println(Arrays.toString(heap));
		heapPush(10);
		heapPush(20);
		heapPush(15);
		heapPush(30);
		System.out.println(Arrays.toString(heap)); // 0번 버림 -> 0,30,20,15,10
	
		System.out.println(heapPop());
		System.out.println(Arrays.toString(heap)); // 0번 버림 -> 0,30,20,15,10
		System.out.println(heapPop());
		System.out.println(heapPop());
		System.out.println(Arrays.toString(heap)); // 0번 버림 -> 0,30,20,15,10
		System.out.println(heapPop());
		System.out.println(heapPop());
	}

	// int 배열로 만들어서 int형으로 결정
	// 힙 자료형에 맞게 아이템의 자료형을 결정하자
	public static void heapPush(int item) {
		// 마지막 자리에 아이템 추가
//		heapSize+=1;
//		heap[heapSize] = item;

		// 위의 두줄을 아래 한줄로 바꿈
		heap[++heapSize] = item;

		// 이제 올라갈 수 있으면 올라가~
		int ch = heapSize; // 자식. = 출발지
		int p = ch / 2; // 부모. 버림처리.. int형이라 버려짐

		// 최대힙. 자식이 더 클 때 바꿀거니까!
		// 최소힙으로 바꾸려면 부등호 방향 바꾸기
		while (p > 0 && heap[p] < heap[ch]) { // 부모가 1번까지 갈때까지만 비교할거야
			// swap
			int tmp = heap[p];
			heap[p] = heap[ch];
			heap[ch] = tmp;

			// 올라가자. 포인터 갱신
			ch = p;
			p = ch / 2;
		}
	}

	// 힙 삭제 연산
	public static Integer heapPop() {
		// 힙이 공백이라면
		if (heapSize == 0)
			return null; // 위에 Integer면 null 가능. int로 하고 return -1하면, -1나중에 쓸수도 있어서 애매

		int item = heap[1]; // 반환할 값 저장. 덮어버릴거니까 빼놓지 않으면 나중에 없어질 수 있어.
		// 마지막 원소를 루트 자리에 놓는다
//		heap[1] = heap[heapSize];
//		heapSize -= 1;
		// 위의 두줄을 아래 한줄로 처리
		heap[1] = heap[heapSize--];

		int p = 1;
		int ch = p * 2; // 왼자 세팅
		if (ch + 1 <= heapSize && heap[ch] < heap[ch + 1])
			ch += 1; // 오자로 다시 세팅

		while(ch <= heapSize && heap[p] < heap[ch]) {
			//swap
			int tmp = heap[p];
			heap[p] = heap[ch];
			heap[ch] = tmp;
			
			//갱신
			p = ch; //왼자일수도, 오자일수도 있음
			ch = p*2; //왼자 세팅
			if (ch + 1 <= heapSize && heap[ch] < heap[ch + 1])
				ch += 1; // 오자로 다시 세팅.
			//이유 : 왼자는 무조건 있을 수 있는데 오자는 없을수도 있음. 왼자를 기본으로 세팅
			
		}
		
		return item;
		
	}

}
