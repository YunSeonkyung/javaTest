/*
 * 다양한 for문들
 * 1. 시작값 끝값까지 입력받아 모든 홀수의 합
 * 2. 1+2+3...+10 = 55 출력해보기
 * 
 */

package kr.co.job.oper;

import java.util.Scanner;

public class ForTest05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// 
//		Scanner scan = new Scanner(System.in);
//		int startValue, lastValue;
//		
//		System.out.print("시작값 입력 : ");
//		startValue = scan.nextInt();
//		
//		System.out.print("끝값 입력 : ");
//		lastValue = scan.nextInt();
//		
//		//처리 : 모든홀수만 출력
//		for(int i = startValue; i <= lastValue; i++) {
//			if(i%2 ==1) { // i%2 ! =0
//				System.out.print(i + " ");
//			}
//		}
		
		
		
//		System.out.println("==========================");
//
//		int sum = 0;
//		//1+2+3...+10 = 55 출력해보기
//		for(int i = 1; i<=10; i++ ) {
//			sum += i;
//			System.out.print(i);
//			if(i !=10) {
//				System.out.print("+");
//			}
//			else {
//				System.out.print(" ");
//			}
//	
//			
//			
//		}
//		System.out.println( "= " + sum);
		
		
	
		// 1부터  num 까지 홀수들의 합을 나타내라
		// 10입력시 1+3+5+7+9 = 25 
		
//		int num = 0;
//		int sum = 0;
//		
//		System.out.print("입력: ");
//		num = scan.nextInt();
//		
//		for(int i = 1; i<=num;i++) {
//			
//			if(i%2==1) {
//				System.out.print(i);
//				sum+=i;
//				if(num-1==i) {
//					//6-1 == 5
//					//마지막 값: 6  -1   i 랑 같으면  홀수의 마지막값
//					System.out.print("");
//				}
//				else if(i !=num) {
//					System.out.print("+");
//				}
//			}
//			
//			if(i == num){
//				System.out.print("=");
//			}
//		}
//		
//		System.out.print(sum);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//num1 부터  num2 까지  짝수들의 합을 보여주세요
		// ex) num1 = 1,   num2 = 5 일경우  2+4=6 출력
		
		//선언
//		int num1 =0;
//		int num2 =0;
//		int sum=0;
//		
//		
//		//입력
//		System.out.print("1 입력 : ");		
//		num1 = scan.nextInt();
//		System.out.print("2 입력 : ");	
//		num2 = scan.nextInt();
//		
//		
//		//연산
//		//num1부터   num2까지  num1은1씩증가
//		for(int i=num1; i<=num2; i++) {
//			if( i%2 ==0) {
//				sum += i;
//				System.out.print(i);
//				if(num2-1== i || num2 == i) {
//					System.out.print("=");
//				}
//				else {
//					System.out.print("+");
//				}
//				
//			}
//		}
//		System.out.println(sum);

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// 
		// 시작점    마지막점
		//num1 부터  num2 까지  짝수들의 합을 보여주세요
				// ex) num1 = 1,   num2 = 5 일경우  2+4=6 출력
		
		//선언
//		int num1 = 0;
//		int num2 = 0;
//		int sum = 0;
//	
//		
//		System.out.println("1 입력 :  ");
//		num1 = scan.nextInt();
//		
//		System.out.println("2. 입력 : ");
//		num2 = scan.nextInt(); 
//	
//		//처리 
//		
//		for( int i = num1; i <= num2; i++) {			
//			if(i%2 ==0) { // // 만약 i를 2로 나뉘었을 때, 나머지값이 0으로 나오면 짝수임
//				sum+= i; // sum = sum + i 
//				System.out.println(i);
//				// ============여기까지가 짝수 나오고// 이꼴이 안나온상태로 합계가 나옴
//				if(num2 - 1 == i || num2 == i) 
//					// 마지막수가 홀수이면 num2-1해서 i가 짝수가 되게끔||마지막수가 짝수여도 i는 짝수
//					
//				
//				}
//				
//			}
//		}
//		
//		System.out.println(sum);
//		
		
		
		
		
		// num1단부터 num2단까지 출력
		// 선언 //=> 스캐너 스캔 위에서 함!!
//		int num1 = 0;
//		int num2 = 0;
//
//		
//		// 입력
//		
//		System.out.println("1. 원하는 구구단 : ");
//		num1 = scan.nextInt(); 
//		System.out.println("2. 원하는 구구단 : ");
//		num2 = scan.nextInt();
//		
//		// 처리
//		for(int i = num1; i <= num2; i++) {
//			for(int j = 1; j<=9; j++) {
//				System.out.print(i+"*"+j+"="+i*j+ "\t");
//			}
//			// 출력
//			System.out.println();
//		}
		
		
		// 카페 프로그램 만들기
		// 메뉴판 실행 // 1. 아메리카노 : 4500// 2. 카페라뗴 : 5000원 
		//선언
		int num1 = 0;
		int num2 = 0;
		
		//입력
		
		//처리
		
	
		//출력
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//
		
		
		
		
		
		
		
		
		
		
	}

}
