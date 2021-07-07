package kr.co.job.ysk;

import java.util.Scanner;

public class project_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String drinkName[] = { "사이다", "콜라", "커피" };
		int drinkPrice[] = { 500, 500, 1000 };
		int drinkGa[] = { 0, 5, 5 };
		int chooce = 0;
		int totalcoin = 0;

		boolean done = true;
		while (done) {
			System.out.println("====================[MENU]===================");
			System.out.println("1.동전투입 2.음료선택 3.음료남은개수 4.거스름돈 99.종료");
			System.out.println("=============================================");
			int menu = 0;
			menu = scan.nextInt();

			switch (menu) {

			case 1:
				// 동전투입
				// 동전이라고 정의가 되어있기 때문에 100원 또는 500원을 넣어야함.
				// 몇개의 동전을 넣었는가
				// 입력한 동전의 수가 총 얼마인가
				//
				System.out.println("500원 또는 100원의 동전을 넣어주세요 : ");
				int coin = 0; // 코인 입력함
				coin = scan.nextInt(); // 코인 스캔해야지
				
				if (coin == 100 || coin == 500) { // 100원 또는 500일때
					totalcoin = totalcoin + coin; // taotalcoin += coin; // 총금액 나타남
					System.out.println("총합계 :" + totalcoin); // 총합계 출력해줌

				} else { // 500원과 100원을 입력하지 않고 다른금액을 넣었을떄
					System.out.println("100원 또는 500원 동전을 넣어주세요");
				}
				break; // 다른금액을 넣었을때는 음료선택단계로 못넘어감

				
			case 2: // 음료수선택
				// 음료수가 몇번인지
				// 음료수가 얼마인지
				// 얼마 남았는지
				// 재고가 몇개 남았는지
				System.out.println("1.사이다(500원) 2.콜라(500원) 3.커피(1000원) 4.취소"); //음료수가 몇번인지 얼마인지 출력
				chooce = scan.nextInt(); // 음료 선택 스캔해야지
				
				
				if(chooce == 4 ) { // 만약 4번 취소롤 선택할경우
					System.out.println("종료"); //ㄴ 종료 출력됨
				}
				else { // 4번종료 선택말고 다른경우 구매 못하는 경우
					
					if (totalcoin < drinkPrice[chooce - 1]) { // 돈이 부족해서 못산다 // 만약 총합계가 음료값보다 작을경우 => 돈부족출력 // 500값인데 >400내면 불가
						System.out.println("돈부족");
					} 
					else if (totalcoin >= drinkPrice[chooce - 1]) { // 살수 있다 // 총합계가 음료값보다 크거나 같으면 음료값은 충족하면 살수있다.
						System.out.println("살수있다"); 
						if (drinkGa[chooce - 1] <= 0) { // 재고 없다  //음료값 충족해도 음료재고가 0과 같거나 적으면 재고가 없다
							System.out.println("재고x");
						} 
						else {// 아니면 살경우	
							totalcoin -= drinkPrice[chooce - 1]; // 총 금액에서 음료 금액이 뻬짐 
							System.out.println(drinkName[chooce - 1] + totalcoin); //선택한 음료이름과 그에따른 총금액 출력
							drinkGa[chooce - 1]--;// drinkGa[i-1]-1; // 음료를 선택하면 개수가 적어짐
							System.out.println(drinkGa[chooce - 1]); // 현재 음료개수 확인 출력
						}
					}
				break; // 살수있는 조건 충적되면 종료됨으로 더이상 case2 반복 안됨

//				for (int i = 1; i <= drinkName.length; i++) {// 0부터 시작하니까 i=0으로 먼저 시작하는거 아닌가 근데 왜 앞에서는 i는 1로 시작했을까
//					if (totalcoin < drinkPrice[i-1]) { // 총 잔액이 음료 가격보다 작다면
//						System.out.println("돈 부족");
//					} else if (totalcoin >= drinkPrice[i-1]) { // 총 잔액이 음료 가격보다 크다면
//						if (chooce == i) {// 남은재고와 잔돈이 얼마 남았는지
//							totalcoin -= drinkPrice[i-1]; // 총 금액에서 음료 금액이 뻬짐
//							System.out.println(drinkName[i-1]+totalcoin);
//
//							drinkGa[i-1]--;// drinkGa[i-1]-1;
//							System.out.println(drinkGa[i-1]);
//						}
//					}
			}

			case 3: // 남은 음료 개수 // 선언부터 예를들면 음료의 종류개수랑 음료의 이름??
				// 어떤음료수를 보여줄지 
				// ㄴ 보기먼저
				
				// 선택한 음료가 몇개 남았는지
				// ㄴ 선택한음료 원래있던 총개수에서 선택한 개수 뺴면 몇개인지
				// 
				// - length()는 문자열의 길이를 알고자 할때 사용된다.
				// 선택한 음료수 말고 다른음료수 확인하겠습니까?
				
				
				System.out.println("1.사이다 2.콜라 3.커피 4.종료"); // 음료수 보기를 보여준다. // 보기의 번호를 선택해주세요 // 왜 음료남은개수는 맞는데 이름이 사이다로만 나올까,,?
				chooce = scan.nextInt();
				if(chooce <= drinkGa.length) {// 개수인 문자열의 길이를 알고자 할떄 사용된다
					System.out.println("남은 음료개수: " + drinkName[chooce-1] +drinkGa[chooce-1]); // 선택한 음료이름과 종류개수
					} else {
						System.out.println("다른 음료의 개수도 확인하시겠습니까?");
						}break;
				
				
			case 4: // 거스름돈 // 총금액에서 음료의 금액을 빼서 남은금액이 거스름돈!
				// 거스름돈이 없을떄
				// 거스름돈이 있을때
				if(totalcoin <= 0) {
					System.out.println("거스름돈이 없습니다.");
				}
				else {
					System.out.println("거스름돈 : " +totalcoin+ "원입니다.");
				}
				
				
			case 99: // 종료
				// 종료되었다는 말 출력하기
				// 잔액이 부족할 시 동전을 넣어주세요 입력하기 x
				// 
				System.out.println("종료합니다.");
				System.out.println("=============================================");
				done = false;
				break;
				
			default:
				System.out.println("메뉴를 다시 선택해주세요.");
				break;

			}
		}

		

	}// end of main()

} // end of class
