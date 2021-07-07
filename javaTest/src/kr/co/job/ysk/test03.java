package kr.co.job.ysk;

import java.util.Scanner;

public class test03 {

	public static void main(String[] args) {
		// 홀수 일경우에만 더하고
		// 짝수일경우에는 패스
		//0이 나오면 더한값의 합을 출력
		
		
		int i = 0;
		int sum =0;
		boolean done = true;
		
		Scanner scan = new Scanner(System.in);
		
		while (done) {
			System.out.println("숫자입력 값: ");
			i = scan.nextInt();
			
			if(i%2 == 1) {
				sum = sum + i;
			}//이프
			else if(i%2 == 0) {
				
				if(i == 0) {
					System.out.println("더한값은"+sum+ "입니다.");
					System.out.println("종료합니다.");
					done = false;
				}
				
				continue; //끝까지 안가고 계속
				
				
			}
		} //와일
		
		
		
	}//

}//
