/*
 * 프로그램의 기본흐름구조 설계하기
 * === 메뉴 ===
 * 1.두수의 합 2.구구단 3.입력받은 수까지의 합 99.종료 // 범위가 아니라 99까지의 조건이기 때문에 for문보다 while문이 더좋음 
 * =================
 * selct number : 
 * 
 */



package kr.co.job.cheaking;

import java.util.Scanner;

public class ControlTest01 {

	public static void main(String[] args) {
		// 선언
		int num =0;
		Scanner scan = new Scanner(System.in);
		
		boolean done = true; // done이 참이면 실행, 거짓이면 종료
		while(done) {
			System.out.println("===메뉴===");
			System.out.println("1. 2. 3. 99. 종료.");
			System.out.println("=========");
			System.out.println("숫자 입력 : ");
			num = scan.nextInt();
	
		
			switch(num){ // swhich는 같은값이 없으면 흘러내려감..?
				case 1:
					System.out.println("1입니다.");
					break;
				case 2: 
					System.out.println("2입니다.");
					break;
				case 3:
					System.out.println("3입니다.");				
					break;
				case 4:
					System.out.println("4입니다.");
					break;
				case 99:
					System.out.println("종료합니다.");
					done= false;
					break;
				default: 
					System.out.println("누구냐 넌??");
				

		}
		
	}
		
		
		
	}

}


//입력

//처리

//출력