package kr.co.job.ysk;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		//더하기
		// 사용자는 계속해서 숫자입력
		// 단 0이 나오면 종료
		// 0이 나오면 지금 까지의 모든 숫자들의 합을 출력
		
		//선언
		int num = 0;
		int sum= 0;
		boolean done = true; // 진실 거짓 나타내는 함수
		
		//입력
		Scanner scan = new Scanner(System.in);
				
		//처리 및 출력
		while(done) {// while 시작
			System.out.println("숫자입력 값 : ");//출력할 스캔먼저!
			num = scan.nextInt();// 스캔할 값
			sum = sum + num;// 합할 숫자 //sum = sum + num; 동일함
			
			if(num == 0) {//if시작// 민약 num값이 0과 같을떄
				System.out.println("종료합니다.");// 0일때 종료 출력
				System.out.println("모든 숫자들의 합은 "+sum+"입니다.");// 출력될 내용
				done = false;
					
			}// if종료
		}//while 종료
			
		
	}//
}//
