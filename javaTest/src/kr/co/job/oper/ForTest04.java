/*
 * 두수를 입력받아서
 * 작은수부터 큰수까지 합을 구하세요!
 * 
 */


package kr.co.job.oper;

import java.util.Scanner;

public class ForTest04 {

	public static void main(String[] args) {
		// 선언 //작은수: num1; 큰수 :num2
		Scanner scan = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		int sum = 0;
		
		//처리
		System.out.print("First Number : ");
		num1 = scan.nextInt();
		
		System.out.print("Seond Number : ");
		num2 = scan.nextInt();
		
		// 출력
		for(int i=num1; i<= num2; i++) {
			sum = sum + i;
			System.out.println("i="+i+"일때, sum="+ sum);
			//i가 10일때 멈추자
			if(i==10) {
				continue;//break;
		} 
			System.out.println("===============");
				
		}
		
	} //

}// 
