/*
 * 아래는 변수 num의 값보다 크면서도 가장 가까운 10의 배수에서 변수 num의 값을 뺀 나머지를 구하는 코드이다.
 * 예를 들어
 * 24의 크면서도 가장 가까운 10의 배수는 30이다
 * 19경우 20이고,
 * 81의 경우 90이다.
 * 30에서 24룰 뺀 나머지는 6이기 떄문에 변수 num의 값이 24라면 6을 결과로 얻어야 한다.
 * 
 */


package kr.co.job.exec;

public class ChapThree3_6 {

	public static void main(String[] args) {
		int num = 24;
		System.out.println(10-num%10); 
		// num값보다 큰 10의 배수 // 24보다 보다 큰배수 30// 30에서 24를 뺀 나머지는 6 //num값이 24 //
		// 24든지 19든지 81든지 커야되는데 조건은 모두 10배수이니까 일의자리가 0으로 되어야한다는 것으로
		// 결국에는 10 - num%10 // %는 나머지 값으로 10- 4 = 6
		

	}//메인 종료

}//끝