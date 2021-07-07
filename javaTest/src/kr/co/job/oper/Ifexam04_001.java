/*
 * 나이를 입력받아서 60세이상이면 "노인", 
 * 30세~59세면 "중장년", 
 * 29세미만이면 "청소년" 을 표현하세요.
 * 
 */


package kr.co.job.oper;

import java.util.Scanner;

public class Ifexam04_001 {

	public static void main(String[] args) {
		// 선언
		int age =0;
		Scanner scan = new Scanner(System.in);
		String result = "청소년";
		
		System.out.println("나이 입력 : ");
		age  = scan.nextInt();
		
		if(age >=60) {
			 result = "노인";
		}
		else if(age >=30 && age <=59) {
			result = "중장년";			
		}
		System.out.println("당신의 나이는 "+age+"이고, 당신의 연령층은 "+result+"이다.");
		
		
		
	
		
		
		
		
		

	}

}
