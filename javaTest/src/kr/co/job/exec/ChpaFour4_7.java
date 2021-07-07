/*
 * Math.random()을 이용해서
 * 1부터 6사이의 임의의 정수를 변수 value에 저장하는 코드를 완성해라
 * 
 * 임의의 정수 = 랜덤숫자
 */


package kr.co.job.exec;

public class ChpaFour4_7 {

	public static void main(String[] args) {
		// 선언
		int value = (int)(Math.random()*6) +1; // 1~6까지의 랜덤숫자를 1개를 추출해서 value에 저장한다.
				// Math.random():  0 이상 1미만의 부동 소숫점 난수를 생성하는 함수 //난수를 생성하는 메서드
		System.out.println("value:" +value ); // 
	
	}

}
