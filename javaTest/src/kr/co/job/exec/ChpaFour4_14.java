/*
 * 숫자맞추기 게임을 작성한것
 * 1과 100사이의 값을 반복적으로 입력해서 컴퓨터가 생각한 값을 맞추면 게임이 끝난다. 
 * 사용자가 값을 입력하면, 컴퓨터는 자신이 생각한 값과 비교해서 결과를 알려준다.
 * 사용자가 컴퓨터가 생ㅇ각한 숫자를 맞추면 게임이 끝나고 몇번만에 숫자를 맞췄는지 알려준다.
 * 
 * 
 * 컴퓨터가 숫자를 하나 가지고 있음 -> 나는 맞춘다.

 * 
 * 
 */


package kr.co.job.exec;

public class ChpaFour4_14 {

	public static void main(String[] args) {
		// 1~100 anwer. 사이의 임의의 값을 얻어서 ///// ?어디에?? 저장한다.
		int answer= (int)(Math.random()*100)+1;
		int input = 0; //사용자입력을 저장할 공간
		int count = 0; //시도횟수를 세기 위한 변수
		// Scanner 화면으로 부터 사아ㅛㅇ자의 입력을 받기 위해서 클래스 사용
		java.util.Scanner s = new java.util.Scanner(System.in);
		do {
			count++;
			System.out.println("1과 100사이의 값을 입력하세요");
			input =s.nextInt(); // input.입력받은 값을 변수에 저장한다
			
			if(input > answer) { // input이 더 크다
				System.out.println(" 더 작은 수를 입력하세요 ");
			} else if (input<answer){// input이 더 작다.
				System.out.println("더 큰수를 입력하세요");
			} else {
				System.out.println("맞췄습니다.|n시도횟수는");
				System.out.println(count + "입니다.");
				break;
			}
		} while(true);
		
		
		
		

	}

}
