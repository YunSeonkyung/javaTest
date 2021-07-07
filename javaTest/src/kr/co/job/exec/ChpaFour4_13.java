/*
 * 주어진 문자열(value)이 숫자인지를 판별하는 프로그램이다.
 * 프로그램을 완성시켜라
 * 
 */


package kr.co.job.exec;

public class ChpaFour4_13 {

	public static void main(String[] args) {
		// 
		
		String value ="12o34";
		char ch = ' ';
		boolean isNumber = true;
		//charAt(int i) 반복문을 이용해서 문자열의 문자를 하나씩 읽어서 검사한다.
		for(int i =0; i< value.length(); i++) {
			
		}
		if(isNumber) {
			System.out.println(value + "는 숫자입니다.");
		} else {
			System.out.println(value + "는 숫자가 아닙니다.");
		}


	}// 메인종료

}// 끝
