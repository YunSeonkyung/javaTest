/*
 * 아래는 변수 num의 값에 따라 '양수','음수','0'을 출력하는 코드이다.
 * 삼항 연산자를 이용
 * 
 */


package kr.co.job.exec;

public class ChapThree3_3 {

	public static void main(String[] args) {
		int num = 10;
		
		System.out.println( num > 0 ? "양수"  : (num < 0 ? "음수" : "0"));

	}//메인 종료

}//끝
