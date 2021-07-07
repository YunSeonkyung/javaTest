package kr.co.job;

import java.util.Scanner;

public class BasicTest0123 {

	public static void main(String[] args) {
		//선언
		int num1 = 0, num2 = 0, result = 0;
		Scanner scan; //선언
		scan = new Scanner(System.in); //생성 
		
		//두 수 입력
		System.out.print("First number : ");
		num1 = scan.nextInt();
		
		System.out.print("Second number : ");
		num2 = scan.nextInt();
		
		//처리
		result = num1 - num2;
		
		//출력
		System.out.println("결과값(result) : " + result);

	}

}
