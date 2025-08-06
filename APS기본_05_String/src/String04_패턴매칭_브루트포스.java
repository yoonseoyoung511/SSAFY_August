
public class String04_패턴매칭_브루트포스 {
	public static void main(String[] args) {
		String text = "This iss a book";
		String pattern = "iss";

	}

	// 찾는 순간 해당 위치의 인덱스를 반환(없으면 -1 반환)
	public static int matchingFor(String t, String p) {
		// 길이를 뽑아내자
		int N = t.length(); // 본문 길이
		int M = p.length(); // 패턴 길이

		for (int i = 0; i < N - M + 1; i++) {
			boolean isOk = false;
			for (int j = 0; j < M; j++) {
				if (t.charAt(i + j) != p.charAt(j)) { // i : 본문에서 패턴검사 시작지점 + j:패턴
					isOk = false;
					break;
				}
			} // 패턴 검사~~
			if(isOk)
				//찾았는데?
				return i;
		} // 시작점을 위한 for문
		return -1;
	}

}
