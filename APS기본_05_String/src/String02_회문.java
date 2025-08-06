
public class String02_회문 {
	public static void main(String[] args) {
		String str = "다시합창합시다!";

		int N = str.length();

		// 1. 뒤집기(반복문)
		char[] arr = new char[N];
		for (int i = 0; i < N; i++) {
			arr[i] = str.charAt(N - i - 1);
		}
		String str2 = new String(arr);
		System.out.println(str2);
		
		//2. StringBuilder
		//builder랑 buffer 큰 차이 없음
		StringBuilder sb = new StringBuilder();
		//string + 하는 것보다 append가 더 빠름
		sb.append(str).reverse(); //반환값이 stringBuilder 객체 그 자체니까 또 .할 수 있음. reverse해도 builder.
		System.out.println(sb.toString());
		
		//3. swap
		char[] arr2 = str.toCharArray();
		for (int i = 0; i < N/2; i++) {
			//swap (i의 증가에 따라 폭이 점점 줄어든다)
			char tmp = arr2[i];
			arr2[i] = arr2[N-1-i];
			arr2[N-1-i] = tmp;
		}
		System.out.println(new String(arr2));
		
		
	}
}
