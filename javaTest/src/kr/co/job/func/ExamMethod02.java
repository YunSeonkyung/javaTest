/*
 * 두수를 입력받아ㅏ서 더하기, 뺴기, 곱하기, 나누기를 구하는 메소드
 * void plusV(int n1, int n2);
 * minusV(), mulV(), divV() => 메소드 이름 
 * 
 */


package kr.co.job.func;

public class ExamMethod02 {

	public static void main(String[] args) {
		// 3,5의 합구하기
		int sum = plusV (3,5); //실제 데이터
		System.out.println("3과 5의 합 : " + sum );
		
		// 3,10의 뺄셈
		 int sum2 = minusV (3,10);
		 System.out.println("3과 10의 빼기 : " + sum2);
		
		// 5,4의 곱셈
		 int sum3 = mulV(5,4);
		 System.out.println("5와 4를 곱 : " + sum3);
		 
		//2,8의 나눗셈
		 divV(2,8);
		 int sum4 = divV(2,8);
		 System.out.println("2를 8로 나눈 값: " + sum4);

	}

	
	
	private static int divV(int n1, int n2) {
		System.out.println(n1/n2);
		return n1/n2;
	}

	private static int mulV(int n1, int n2) {
		System.out.println(n1*n2);
		return n1*n2;
	}

	private static int minusV(int n1, int n2) {
		System.out.println(n1-n2);
		return n1-n2;
	}

	private static int plusV(int n1, int n2) {
		System.out.println(n1+n2);
		return n1+n2; // 함수원형
	}//end

}
