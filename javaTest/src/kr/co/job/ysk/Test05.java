package kr.co.job.ysk;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		// 배열로 바꾸기!!!!!!!!!!!!!!!
		// 음료 자판기 만들기
		// 1.동전 투입[0]
		// 2. 음료수 선택
		// - 1.사이다(500) 2.콜라(500) 3.커피(1000) 4. 취소
		// 3.음료남은개수
		// 4. 반환(거스름돈 주세요)
		// 99.자판기 종료(프로그램 종료)
		// 1차원 배열로 작성 : drinkName[3],drinkPrice[3],drinkGa[3] 
		
		
		//선언
		int num = 0;
		int money = 0;
		int pay = 0;
		boolean done = true;
		
		String[] drink = new String [3];
		int[] drinkPrice = new int[3];
		drinkGa 
		
		drink [0] = "사이다";
		drink [1] = "콜라";
		drink [2] = "커피";
		
		drinkPrice[0] =500;
		drinkPrice[1] =500;
		drinkPrice[2] =1000;
		
		drinkGa
		drinkGa
		drinkGa
		
		Scanner scan = new Scanner(System.in);
		
		//입력
		while(done) { // 스위치 시작
			System.out.println("====================[MENU]===================");
			System.out.println("1.동전투입  2.음료수 선택 3. 음료남은개수 4. 반환(거스름돈 주세요) 99. 자판기 종료(프로그램 종료)");
			System.out.println("=============================================");
			num = scan.nextInt();
			
			
			switch(num) { //스위치시작
				case 1 :
					System.out.println("동전 투입"); // 동전투입
					money = scan.nextInt(); // 금액 스캔
					pay = pay + money;
					break;
				
				case 2 :
					int num2 = 0; //음료수 선택
					System.out.println("1.사이다(500) 2. 콜라(500) 3.커피(1000) 4.취소");
					num2 = scan.nextInt(); // 금액 스캔
					if(num2 == 1) { //이프시작
						if(money >= 500) { //이프시작
							money = money -500;
							System.out.println("구매완료");
							cider++;
							continue;
						}//이프종료
						else {//엘스시작
							System.out.println("잔액부족");
						}//엘스종료
					}//이프종료
					break;
				
				case 3 : //음료남은개수
					if(num2 )
				
				
				case 4 :
			}//스위치 종료	
				
		} // 와일 종료

	
		
	}//메인종료
}//끝
