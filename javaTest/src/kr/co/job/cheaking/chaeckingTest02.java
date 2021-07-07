/*
 * 두 수를 키보드로 입력받아서
 * 두 수의 값을 서로 교환하자.
 * 
 */


package kr.co.job.cheaking;

import java.util.Scanner;

public class chaeckingTest02 {

	public static void main(String[] args) {
		// 선언
		Scanner scan = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		int temp = 0;
		
		
		
		//입력
		System.out.println("First Number : ");
		num1 = scan.nextInt();
		
		System.out.println("Second Number : ");
		num2 =scan.nextInt();
		
		System.out.println("=======[교환 전]=======");
		System.out.println("num1 : " + num1 + " num2 : " + num2);
		
		//처리
		//교환 : swap
		temp = num1; // num1값(0)을 temp에 보내준다. // num1=0, temp=0
		num1 = num2; // num2(1)값을 num1에 대입시켜서 num2값을 동일하게 보내준다. // num2=1,num1=1
		num2 = temp; // temp(0)값을 num2에 대입시킨다. //	temp=0,num2=0
		
		//출력
		System.out.println("=======[교환 후 ]=======");
		System.out.println("num1 : " + num1 + " num2 : " + num2);
		
		
		

	}

}
