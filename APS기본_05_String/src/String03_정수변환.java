
public class String03_정수변환 {
	public static void main(String[] args) {
		String strNum = "A123456"; //A는 빼고 나머지만 작업할 수 있음! 아래 if문
		//문자열 -> 정수
//		int num = Integer.parseInt(strNum);
//		System.out.println(num);
		System.out.println(atoi(strNum));
		
		System.out.println((int)'0'); //char->int 변환하면 48. 아스키코드값 나옴
		
		
	}//end of main
	
	//str은 아주 깔끔한 형태의 숫자만 들어온다. ex)"123456"
	//우리 입맛대로 커스텀 가능 -> 정방향말고 역방향은 어떻게 하지?
	//음수면 어떻게 하지?
	//들어오는 게 실수라면 어떻게 하지? 고민해봐
	public static int atoi(String str) {
		int N = str.length();
		int num = 0; //반환
		
		// 1 2 3 4 5 6 (인덱스 아님)
		for (int i = 0; i < N; i++) {
			char c = str.charAt(i);
		
			if(c >= '0' && c <= '9')
				num = (num*10) + (c-'0'); //(num*10) : 자릿수 하나 올림 / c-48 해도 같음
		}
		return num;
	}
	
	public static String itoa(int num) {
		String strNum = num+""; //가장 심플하게 바꾸는 방법
		
		return null;
	}




}//end of class
