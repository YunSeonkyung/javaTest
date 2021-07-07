package kr.co.job.ysk;

import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
		// 음료 자판기 만들기
		// 메뉴판실행 1. 콜라 500원 2.사이다700원 3.커피1000원
		// 잔액 확인
		// 구매확인
		
		//선언

		int menu1 = 0;
		int menu2 = 0;
		int menu3 = 0;
		int money = 0;
		int coke = 0;
		int cider = 0;
		int coffee=0;
		boolean done = true;
		
		// 입력
		Scanner scan = new Scanner(System.in);
		System.out.println("얼마를 가지고 있습니까?");
		money = scan.nextInt();
		
		while(done) { // 반복문 고른다
			System.out.println("====선택=====");
			System.out.println("1.음료선택 2.잔액확인 3.구매확인 : ");
			System.out.println("====종료=====");
			menu1= scan.nextInt();
			
		
			if(menu1 == 1){//이프 시작
				System.out.println("1.콜라 2.사이다 3.커피");
				menu2 = scan.nextInt();
				
				if(menu2 == 1) {
					if(money >=500) {
						money = money - 500;
						System.out.println("구매완료하였습니다.");
						coke++;
						continue;
					}
					else {
						System.out.println("잔액부족합니다.");
						continue;
					}
				}
				
				else if(menu2 == 2) { //이프시작
					if(money >=700) {
						money = money - 700;
						System.out.println("구매완료하였습니다.");
						cider++;
						continue;
					}
					else {
						System.out.println("잔액부족합니다.");
						continue;
					}
					
				}//이프종료
				else if(menu2 == 3) { //엘스이프시작
					if(money >= 1000) {
						money = money - 1000;
						System.out.println("구매완료하였습니다.");
						coffee++;
						continue;
					}
					else {
						System.out.println("잔액부족합니다.");
						continue;
					}
				}//엘스이프종료
			} // 엘스이프종료
			
			else if(menu1== 2) {//이프시작
				System.out.println("money = "+ money);
			}//이프종료
			
			else if(menu1 == 3) {
				System.out.println("콜라: "+coke+"  사이다: "+cider+"  커피: "+coffee);
			}
			else if (menu1 == 0) {
				System.out.println("종료합니다.");
				done = false;
			}

		}//while 종료
	
		
	}//메인 종료

}// end