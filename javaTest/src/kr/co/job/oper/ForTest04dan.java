/*
 * <dan*i - *단의 뒤에 *를 i로 for문화>
 * 
 * <2에서 9단까지>
 * 2단에서 9단까지 앞의 숫자 바뀌는것을 for문화
 * 
 * 
 */


package kr.co.job.oper;

import java.util.Scanner;

public class ForTest04dan {

	public static void main(String[] args) {
		// 구구단 연습!
		
		//선언
		int dan = 0; // 단 선언
		int result = 0;
		
		// 입력
		Scanner scan = new Scanner(System.in); // 스캔
//		System.out.println("구할 단 입력 : "); //구할단 출력내용입력
		
		//처리
//		dan = scan.nextInt(); //출력내용먼저 하고나서 단스캔
//			for(int i = 1; i<=9; i++) {
//				System.out.println(dan + "*" + i + "=" + dan*i);
//				//dan*i=dan*i
		
		
		 /* <2에서 9단까지>
		 * 2단에서 9단까지 앞의 숫자 바뀌는것을 for문화
		*/
			for(dan = 2; dan<=9; dan++) {
				for(int i = 1; i<=9; i++) {
					System.out.print(dan+"*"+i+"="+dan*i+"\t");
				}
				System.out.println();
			}
			
	}//
} // 종료

