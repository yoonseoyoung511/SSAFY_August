import java.util.Comparator;
import java.util.PriorityQueue;

////나와 얘를 비교하는 친구 = comparable
//class Person implements Comparable<Person> { //내가 비교기준 직접 넣어줄거얌
//	String name;
//	int age;
//	
//	public Person(String name, int age) {
//		this.name = name;
//		this.age = age;
//	}
//	
//	//나이순으로 오름차순 정렬
//	@Override
//	public int compareTo(Person o) {
//		return this.age - o.age;
//	}
//	
//	@Override
//	public String toString() {
//		return "Person [name=" + name + ", age=" + age + "]";
//	}
//}

//나와 얘를 비교하는 친구 = comparable
class Person { //내가 비교기준 직접 넣어줄거얌
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
}

public class Heap03_PersonPQ {
	public static void main(String[] args) {
		
//		PriorityQueue<String> tmp = new PriorityQueue<>();
//		PriorityQueue<Person> pq = new PriorityQueue<>(new NameComparator()); //비교기준이 없어서 원래는 이슈 발생
		
		//1회 한정 익명클래스 정의
		PriorityQueue<Person> pq = new PriorityQueue<>(new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				//나이순 (내림차순) -> 같다면 이름 오름차순으로 정렬
				if(o1.age == o2.age) {
					return o1.name.compareTo(o1.name);
				}
				return o2.age - o1.age;
			}
		});
		
		
		pq.add(new Person("최현지", 28));
		pq.add(new Person("이서연", 10));
		pq.add(new Person("양띵균", 45)); //이름 오름차순으로 해놔서 먼저 출력됨
		pq.add(new Person("현진혁", 45)); //이름 오름차순으로 해놔서 먼저 출력됨
		
		System.out.println(pq.poll());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
