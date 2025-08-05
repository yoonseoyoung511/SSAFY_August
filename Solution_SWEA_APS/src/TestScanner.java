import java.util.Scanner;
/**
 * Scanner, BufferedReader, JOptionPane
 *  BufferedReader : 빠르다. 알고리즘시 사용, readLine() 한줄을 통째로 입력받는 것만 제공된다.
 *  	"3 4 5 6", 원하는 데이터를 쪼개서 사용해야됨, String.split(); // 정규화 표현식, regular expression. 자바말고 다른 언어에서도 마니 쓰임
 *  	StringTokenizer를 사용.
 *  BufferedWriter or StringBuilder 사용하면 됨. 빨라서 추천.
 */
public class TestScanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		버퍼에 들어온 데이터에서 작업
		
//	기본타입 메서드 (?) : 원하는 데이터가 나올 때까지 (데이터 앞쪽에 나오는) WhiteSpace(공백, 탭, 줄바꿈) 제거, 데이터 추출해서 타입 변환
//		sc.next(); // 문자열 입력
//		sc.nextInt(); // int 값 입력
//		sc.nextByte();
//		sc.nextShort();
//		sc.nextLong();
//		sc.nextFloat();
//	sc.nextChar(); //문자 1개 받는 메서드는 없다!
		
		String str = sc.nextLine();		//한줄을 통째로 문자열로 리턴, 앞쪽 WhiteSpace 제거는 안한다, 한줄 끝부분의 줄바꿈은 제거
		System.out.println("[" + str + "]");
		 str = sc.nextLine();		//한줄을 통째로 문자열로 리턴, 앞쪽 WhiteSpace 제거는 안한다, 한줄 끝부분의 줄바꿈은 제거
		System.out.println("[" + str + "]");
		 str = sc.nextLine();		//한줄을 통째로 문자열로 리턴, 앞쪽 WhiteSpace 제거는 안한다, 한줄 끝부분의 줄바꿈은 제거
		System.out.println("[" + str + "]");
		
//		기본타입 : whiteSpace 제거, nextLine : 제거 안 해줌. 문제 발생
	}
}
