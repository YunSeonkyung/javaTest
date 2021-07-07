/*
 * 1부터 20까지의 정수 중에서 2또는 3의 배수가 아닌 수의 총합을 구하시오. 
 * !(i%2==0||i%3==0) => (i%2 !=0 && i%3 !=0)
 * 
 * 2의배수는 i%2==0
 * 3의배수는 I%3==0
 */


package kr.co.job.exec;

public class ChpaFour4_2 {

	public static void main(String[] args) {
		// 선언
		
		int sum = 0;
		for(int i = 1; i<=20; i++) { // 1부터 20까지의 정수
			if(i%2 !=0 && i%3 !=0) { // 2또는 3으로 나머지가 나오지 않는 수 == 0 // 2랑 3의 배수가 아닌 수
				System.out.println(i); // i값에 해당하는 수 // i값이 무엇인지 궁금해서 출력해봄
				sum += i; //sum = sum + i
						// 0 = 0+1 // 1=1+2 // 3 = 3+3  // 6 = 6+4 // 10 = 10+5 ....
			} // 이프종료
		} // 폴 종료
		System.out.println(sum); // 합
		
		
		
		
		
		
		
//		int sum = 0;
//		for(int i = 1; i<20; i++) { // 1부터 20까지의 정수
//			if(i%2 !=0 && i%3 !=0) { // 2또는 3으로 나머지가 나오지 않는 수 // 2랑 3의 배수가 아닌 수
//				System.out.println(i); // i값에 해당하는 수
//				sum += i; //sum = sum + i
//						// 0 = 0+1 // 1=1+2 // 3 = 3+3  // 6 = 6+4 // 10 = 10+5 ....
//			} // 이프종료
//		} // 폴 종료
//		System.out.println(sum);
		

	} // 메인 종료

} // 끝
