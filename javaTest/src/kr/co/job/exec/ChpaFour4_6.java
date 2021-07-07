/*
 * 두개의 주사위를 던졌을때
 * 눈의 합이 6이 되는 모든 경우의 수를 출력해라
 * 
 */


package kr.co.job.exec;

public class ChpaFour4_6 {

	public static void main(String[] args) {
		// 선언
		int dice1 =0, dice2 =0, sum =0;
		int diceSize=6, result=6; //주사위의 눈의개수, 구하고자하는 합
		
		// 
		for(dice1 = 1; dice1<=6; dice1 ++) { // 첫번째 주사위의 조건 //주사위1이 1부터 6까지
			for(dice2=1; dice2 <=6; dice2++) { //두번째 주사위의 조건 // 주사위2가 1부터 6까지
				if(sum == 6) { // 만약 눈의 합이 6이 되는 경우의수는 true
					System.out.println(dice1+","+dice2); // i값, j값
				}
			}
		}
		
		
		
		
//		for(int i=1; i<=6; i++) {
//			for(int j=1; j<=6; j++) {
//				if(i+j ==6) {
//					System.out.println("("+i+","+j+")"); // 두개의 경우의 수를 합한 수
//				}
//			}
//		}
		
	}

}
