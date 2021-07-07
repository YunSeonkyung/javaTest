/*
 * 키보드로 숫자를 입력받아서
 * 0인지 아닌지 확인하는 프로그램을 작성해보자.
 *
 * 
 */


package kr.co.job.oper;

import java.util.Scanner;

public class Ifexam01 {

	public static void main(String[] args) {
		// 선언부 : 키보드입력, 숫자보관
		Scanner scan = new Scanner(System.in);
		int num = 0;
		String result = null;
		
		// 입력
		System.out.println("Input Number : ");
		num = Integer.parseInt(scan.next());
		
		if(num == 0) {
			// 조건이 참일떄
//			System.out.println("num은 0 입니다."); //출력
			result = "num은 0 입니다."; // 보관
		}
		
		else {
			// 조건이 거짓일때
//			System.out.println("num은 0이 아닙니다."); //출력
			result = "num은 0이 아닙니다.";
		}
		System.out.println(result); // 보관
		System.err.println("Program End!!");
		
		
	} // end of main()

} // end of class













