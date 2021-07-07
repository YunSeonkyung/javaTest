/*
 * 아래는 변수 num의 값 중에서 일의자리를 1로 바꾸는 코드이다.
 *  만일 변수 num의 값이 333이라면 331이 되고. 777이라면 771이 된다
 * 
 */


package kr.co.job.exec;

public class ChapThree3_5 {

	public static void main(String[] args) {
		int num = 333;
		System.out.println(num/10*10+1); // 십의자리수로 나눈후 몫값에 10을 곱한뒤 일의 자리수의 값이 1이 되어야 하므로 +1을 해준다.

	}//메인 종료

}//끝
