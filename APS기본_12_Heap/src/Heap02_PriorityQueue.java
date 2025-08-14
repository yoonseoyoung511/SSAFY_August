import java.util.PriorityQueue;

public class Heap02_PriorityQueue {
	public static void main(String[] args) {
		
		//컬렉션 프레임워크에서 사용할 수 있게 이미 구현되어 있음
		//최소힙! (기본)
		//생성할 때 비교 기준을 넣어주면 최대 힙도 가능하겠다!
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		//if 부등호, 비교기준 없이 값들을 반대로 바꾸고 싶을 때 -> 음수를 곱하기!
		//부호를 반대로 바꾸어서 넣자! (음수라기 보다는)
		//음수도 포함되어 있을 수 있으니 부호를 바꾸자~!
		int a = 10;
		a *= -1; 	//부호 반대로 바꾸는 방법 1
		a = -a; 	//부호 반대로 바꾸는 방법 2 : - 기호를 단항 연산자로도 활용 가능
		
		System.out.println(a);
		pq.add(-10);
		pq.add(-20);
		pq.add(-15);
		pq.add(-30);
		pq.add(-25);
		
		System.out.println(pq);
		//부호 바꿨다면 -붙여서 다시 원상복구해야 함
		System.out.println(-pq.poll()); //맨위 10 -> 최소힙
		System.out.println(pq);
		
		//전부다 넣고 전부다 빼버리면 정렬 끝
		while(!pq.isEmpty())
			System.out.println(-pq.poll());
		
		
		
	}
}
