/*
 * 숫자로 이루어진 문자열 str이 있을때, 
 * 각 자리의 합을 더한 결과를 출력하는 코드를 완성해라
 * 만일 문자열이 "123456"라면 '1+2+3+4+5'의 결과인 15를 출력이 도되어야한다.
 * 힌트)  String클래스의 chatAt(int i)을 사용
 * 
 */
package kr.co.job.exec;

public class ChpaFour4_9 {

	public static void main(String[] args) {
		// 선언
		
		// 숫자 12345 -> 각자리수의 합
		int num = 12345, temp = 0; // temp에 num을 넣음 --> 이렇게 한 이유 초기값을 보관하기 위해서
		int sum= 0;
		
		temp = num; // num을 temp을 넣음 --> 처리하는 데이터/보관하는 데이터 구분할수 있음
		while(temp > 0) { // 
			sum = sum + temp%10;
			temp = temp/10;
		}
		System.out.println("num=" +num+ " 일때 sum=" + sum); // num값을 살리기위해 temp로 넘겨서 temp로 계산함
		
		
		
		
//		int sum= 0;
//		String str = "12345"; // str.charAt(idx) -> char
//		
//		
//		for(int i = 0; i < str.length(); i++) {
//			System.out.println(str.charAt(i)); // i값이 무엇인지 궁금해서 출력해봄
//			sum += str.charAt(i)-'0';// sum = sum+str.charAt(i)-'0'; // sum = sum+str.charAt(i)-'48'도 괜찮음
			// charAt(0)은 "12345"배열중에서 1을 출력하기 때문에 이걸 int형으로 변환시키면 아스키코드값인 1=49
			// 1이 나오기 위해서는 49-48을 해야하기 때문에
			// 아스키코드인 48은 0이기 때문에
			// 49-48 = 1이 출력이된다 
			//int i =0 그래서 charAt(i)-'0'으로 뺴기 영을 해줘야 하는것이다.

			
//		}
//		System.out.println("sum="+sum);
		
		
		
		
		
		
		
		

	}

}
