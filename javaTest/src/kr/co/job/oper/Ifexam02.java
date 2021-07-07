/*
 *  키보드로 두수를 입력받아서 큰지 작은지 비교하는 프로그램을 작성.
 */


package kr.co.job.oper;

import java.util.Scanner;

public class Ifexam02 {

	public static void main(String[] args) {
		// 선언부 : 키보드입력, 숫자보관

		Scanner scan = new Scanner(System.in);
		int num = 0;
		String result = null;
		int num1, num2, num3;
		String str1, str2;
		
		
		// 입력
		System.out.print("Input First Number : ");
		str1 = scan.next();
		num1 = Integer.parseInt(str1);
		System.out.print("Input Second Number : ");
		str2 = scan.next();
		num2 = Integer.parseInt(str2);
		
		if(num1 > num2) {
			result = "num1이 nium2보다 큽니다.";
			num3 = num1;
		}
		else if(num1 < num2) {
			result = "num1이 num2보다 작습니다.";
			num3= num2;
			
		}
		else {
			result = "num1과 num2와 같습니다.";
			num3 = num1;
			
		}
		System.out.println(result);
		
		System.out.println("가장 큰수는 "+num3+"입니다.");

		
	} // end of main()

}// end of class
