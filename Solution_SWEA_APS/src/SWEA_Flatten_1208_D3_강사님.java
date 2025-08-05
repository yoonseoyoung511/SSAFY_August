import java.util.Scanner;

public class SWEA_Flatten_1208_D3_강사님 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int testCase = 1; testCase <= 10 ; testCase++) {
			int dump = sc.nextInt(); //덤프, 1이상 1000이하
			int[] cnt = new int[101]; //높이를 기준 index로 카운팅, 0~100
			int max = 0;
			int min = 100;
			for (int i = 0; i < 100; i++) {
				int a = sc.nextInt();
				cnt[a]++;
				if(max < a) max = a;
				if(min > a) min = a;
			}
			for(int i = 0; i < dump; i++) {
				cnt[max]--;
				cnt[max-1]++; 
				cnt[min]--;
				cnt[min+1]++;
				if(cnt[max] == 0) max--;
				if(cnt[min] == 0) min++;
			}
			System.out.println("#"+testCase+" "+(max-min));
		}//end of for testCase
	}//end of main
}//end of class




//public class SWEA_Flatten_1208_D3_my {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		for (int testCase = 1; testCase <= 10 ; testCase++) {
//			int dump = sc.nextInt(); //덤프, 1이상 1000이하
//			int[] arr = new int[100]; //상자의 높이, 가로는 100
//			for (int i = 0; i < arr.length; i++) {
//				arr[i] = sc.nextInt(); //상자의 높이는 1이상 100이하
//			}
//			Arrays.sort(arr); //오름차순 정렬, [0]최소, [99]최대
//			for(int i = 0 ; i < dump ; i++) {  //덤프
//				arr[99]--; //높은 칸 하나 빼기
//				arr[0]++; //낮은 칸에 쌓기
//				Arrays.sort(arr);
//			}
//			System.out.println("#"+testCase+" "+(arr[99]-arr[0]));
//		}//end of for testCase
//	}//end of main
//}//end of class
