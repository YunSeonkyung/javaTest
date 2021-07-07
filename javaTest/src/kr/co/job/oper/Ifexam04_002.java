package kr.co.job.oper;

import java.util.Scanner;

public class Ifexam04_002 {

	public static void main(String[] args) {
		// 선언
		int moeny = 0;
		String result = " ";
		Scanner scan = new Scanner(System.in);
		
		//입력
		System.out.println("금액 입력 : ");
		moeny = scan.nextInt();
		
		System.out.println("입력한금액:"+moeny);
		
		
		if(moeny <= 5000) {
			result ="가난";
		}
		else if(moeny >5000 && moeny <= 15000) {
			result ="중산";
		}
		else{
			result ="부자";			
		}
		
		System.out.println("당신은 "+moeny+"원을 가지고 있고, 당신은 "+result+"층입니다.");
		
	}

}
