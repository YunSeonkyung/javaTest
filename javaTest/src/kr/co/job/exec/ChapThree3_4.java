/*
 * 아래는 변수 num의 값 중에서 백의 자리 이하를 버리는 코드이다.
 * 만일 변수 num의 값이 '456'이라면 '400'이 되고, '111'이라면 '100'이 된다.
 */


package kr.co.job.exec;

public class ChapThree3_4 {

	public static void main(String[] args) {
		int num = 456;
		System.out.println(num/100*100); //백의자리수로 나눠서 백의자리만 남기게 다시 자리수 옮겨줌

	}//메인 종료

}//끝
