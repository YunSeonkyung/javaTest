/*
 * int 타입의 변수 num 이 있을때,
 * 각 자리의 합을 더한 결과를 출력하는 코드를 완성하라.
 * 만일 변수 num의 값이 12345라면 
 * '1+2+3+4+5'의 결과인 15를 출력하라
 * 주의) 문자열로 변환하지 말고 숫자로만 처리해야 한다.
 * 
 */
package kr.co.job.exec;

public class ChpaFour4_10_01 {

	public static void main(String[] args) {
		// 선언
		
		int num = 12345;
		int sum = 0;
		
		while (num > 0) { // num는 정수이기 때문에 0보다 크다
			// '1+2+3+4+5'의 각자리의 합의 결과인 15를 출력하기위해서는
			// *** 나머지를 구하기 위해서 10진수 ****
			// 결국에는 	sum = sum + num % 10						// sum=num%10
			//			0 = 	0 + (12345)%10  // 0= 0+ (나머지값:5)	// 0 = 5
			//			5 =		5 + (1234)%10	// 5= 5+ (나머지값:4)	// 5 = 9
			// 			9 =		9 + (123)%10	// 9= 9+ (나머지값:3)	// 9 = 12
			//			12		12+ (12)%10		// 12=12(나머지값:2)	//12 = 14
			//			14		14+ (1)%10		// 14=14(나머지값:1)	//14 = 15
			
			// // *** 나머지를 구하기 위해서 10진수 ****
			sum += num % 10; // sum = sum + num % 10
			num /= 10; //  ==  num = num / 10
			
			System.out.println("sum="+sum);
		}
		
//		****** 문자의 크기가 클경우에 이러한 방법으로 할수도 있음*******
//		********  split  문자를 각각으로 나눈다는 뜻   ***************
//		
//		System.out.println("sum="+sum);
//		
//		String[] String = new String[5]; //문자열 배열
//		int[] number = new int[5]; // 숫자형을 담을 배열
//		int sum2 = 0; // sum 선언
//		int num2= 12345; //지정한 문자 선언
//		String str = Integer.toString(num2); //num을 string형태로 변환
//		for(int i =0; i<5;i++) {
//			String = str.split(""); //1,2,3,4,5 로 각각 나눠버림
//		}
//		
//		for(int i=0;i<String.length;i++) { //더하기 진행
//			number[i] = Integer.parseInt(String[i]); //number[i] 에다가   String[i]의 값을 int형으로 전환해서 대입
//			System.out.println(number[i]); //출력
//			sum2+= number[i]; //더하기
//		}
//		System.out.println(sum2);

	}

}
