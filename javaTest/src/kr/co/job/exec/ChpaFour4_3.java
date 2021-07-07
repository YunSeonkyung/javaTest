/*
 * 1 + (1+2) + (1+2+3) + (1+2+3+4) + ... + (1+2+3+...+10) 의 결과를 계산하시오
 * 1	3	6	10	15	21	28	36	45	55
 * 	+2	 +3	 +4	  +5   +6  +7  +8  +9  +10		// i++
 * 
 */


package kr.co.job.exec;

public class ChpaFour4_3 {

	public static void main(String[] args) {
		// 선언
		
		int sum = 0;
		int totalsum = 0; // 총합: 220
		
		for (int i =1; i<10; i++) { // 1부터 10까지 1씩 증가
			sum+=i; // sum= sum +i; // 합에서 +i임
			totalsum+=sum; //totalsum = totalsum + sum; //totalsum은 변수 // 모든 sum의 합으로 totalsum값 나올수 있음
		}
		System.out.println("totalsum : "+sum);
	} // 메인종료
} // 종료

