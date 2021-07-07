/*
 * 점수를 입력받아서 성적(A~F)을 출력하세요
 * 
 * 90~100 : A
 * 80~90 : B
 * 70~80 : C
 * 60~70 : D
 * 50~60 : E
 * 50이하 : F
 * 
 */


package kr.co.job.oper;

import java.util.Scanner;

public class Ifexam03_01 {

	public static void main(String[] args) {
		// 선언
		
		Scanner scan = new Scanner(System.in);
		int num = 0;
		String result = "";
				
		// 입력
		System.out.println("Input number : ");
		num = scan.nextInt();
		
		if (num >=90 && num < 100) {
			result = "A";
		}
		
		else if (num >= 80 && num < 90) {
			result = "B";
		}
		else if (num >= 70 && num < 80) {
			result = "C";
		}
		else if (num >= 60 && num <70 ) {
			result = "D";
		}
		else if (num >=50 && num <60) {
			result = "E";
		}
		else if (num < 50) {
			result = "F";
		}
		
		// 출력
		System.out.println(result);
		
		
		
		
		
		
		
		
		
	}

}
