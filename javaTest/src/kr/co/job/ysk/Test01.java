package kr.co.job.ysk;

import java.util.*;
public class Test01 {

	public static void main(String[] args) {
		
		// 카페 프로그램 만들기
		// 메뉴판 실행 // 1.아메리카노 : 4500      2.카페라뗴 : 5000원     3.종료 이외의숫자 : 종료
		//선언
		
//		Scanner scan = new Scanner(System.in);
//		
//		int menu1 = 0;
//		int menu2 = 0;
//		int sum =0;
//		boolean cheak = true;
//	
//		System.out.println("1. 아메리카노; 2. 카페라뗴;");
//		while(cheak){
//			menu1= scan.nextInt();
//			if(menu1 ==1) {
//				sum= sum + 4500;
//				System.out.println("1.아메리카노는 4500원입니다.");
//				System.out.println("1.추가구매할래요? 2. 그만살래요.");
//				menu2= scan.nextInt();
//				if(menu2==1) {
//					System.out.println("1. 아메리카노; 2. 카페라뗴; 3.종료");
//				}
//				else if(menu2==2) {
//					System.out.println("종료합니다.");
//					System.out.println("금액은"+sum+"입니다.");
//					cheak = false;
//				}
//			}
//			else if(menu1==2) {
//				sum=sum + 5000;
//				System.out.println("2.카페라뗴는 5000원입니다.");
//				System.out.println("1.추가구매할래요? 2. 그만살래요.");
//				menu2=scan.nextInt();
//				if(menu2==1) {
//					System.out.println("1. 아메리카노; 2. 카페라뗴; 3.종료");
//				}
//				else if(menu2==2) {
//					System.out.println("종료합니다.");
//					System.out.println("금액은"+sum+"입니다.");
//					cheak = false;
//				}
//				
//			}
//			else {
//				System.out.println("종료합니다.");
//				System.out.println("금액은"+sum+"입니다.");
//				cheak = false;
//			
//			}
//		}
		
		//========================================================================
		
		// 메뉴판 실행 // 1.아메리카노 : 4500      2.카페라뗴 : 5000원     3.종료 이외의숫자 : 종료
		
		// 선언
		Scanner scan = new Scanner (System.in);
		
		int menu1 = 0;
		int menu2 = 0;
		int sum = 0;
		boolean cheak = true;
		
		System.out.print(" 1.아메리카노 2.돌체라떼 3.콜드브루 딜라이트: "); //종류는 뒤에..

		while(cheak) { // 반복문//고른다 -> 대답해야하니 스캔따라와야함
			menu1= scan.nextInt(); // 1번메뉴 스캔
			if(menu1 == 1) {//아메리카노일떄
				sum= sum+ 4500;
				System.out.println("아메리카노는 4500원입니다.");
				System.out.print("1.추가주문할래요? 2.그만주문할래요?");
				menu2=scan.nextInt();
				if(menu2==1) {
					System.out.println(" 1.아메리카노 2.돌체라떼 3.콜드브루 딜라이트; ");
				}
				else if(menu2==2) {
					System.out.println("총금액은"+sum+"입니다.");
					cheak = false;
				}
			}
			else if(menu1==2) {//돌체라떼일때
				sum= sum+ 5500;
				System.out.println("돌체라떼는 5500원입니다.");
				System.out.print("1.추가주문할래요? 2.그만주문할래요.");
				menu2= scan.nextInt();
				if(menu2==1) {
					System.out.println(" 1.아메리카노 2.돌체라떼 3.콜드브루 딜라이트; ");
				}
				else if(menu2==2) {
					System.out.println("총금액은"+sum+"입니다.");
					cheak = false;
				}
			}
			else if(menu1==3) {//딜라이트일때
				sum= sum+ 6000;
				System.out.println("콜드브루 딜라이트는 6000원입니다.");
				System.out.print("1.추가주문할래요/ 2.그만 할래요.");
				menu2= scan.nextInt();
				if(menu2==1) {
					System.out.println(" 1.아메리카노 2.돌체라떼 3.콜드브루 딜라이트; ");
				}
				else if(menu2==2) {
					System.out.println("총금액은"+sum+"입니다.");
					cheak = false;
				}
			}
				
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//==========================================================================================================
		
		//입력
//		System.out.println("메뉴판 1.아메리카노:4500원; 2.카페라떼 : 5000원; ");
//	
//		while(cheak) {
//			num1= scan.nextInt();
//			if(num1==1) {
//				sum = sum + 4500;
//				System.out.println("4500원입니다.");
//				System.out.println("추가구매할경우 1; 아닐경우 2");
//				num2= scan.nextInt();
//				if(num2==1) {
//					System.out.println("메뉴판 1.아메리카노:4500원; 2.카페라떼 : 5000원; ");
//					
//				}
//				else if(num2==2) {
//					System.out.println("모두 구매합니다.");
//					System.out.println("금액은 "+sum+"입니다.");
//					cheak = false;
//				}
//			}
//			else if(num1==2) {
//				sum = sum + 5000;
//				System.out.println("5000원입니다.");
//				System.out.println("추가구매할경우 1; 아닐경우 2");
//				num2= scan.nextInt();
//				if(num2==1) {
//					System.out.println("메뉴판 1.아메리카노 4500원; 2.카페라떼 5000원");
//				}
//				else {
//					System.out.println("총가격은 "+sum+"입니다.");
//					cheak = false;
//					
//				}
//			
//			}
//		}
	
		
		//처리 

		
		
	
		//출력
		
		
		
		
		
		
	}

}
