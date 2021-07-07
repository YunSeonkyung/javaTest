/*
 * 기본적인 for문
 * for(1.초기값; 2.조건; 4.증감치){
 * 		3.실행문
 * }
 * 
 * 1->2->3->4->2->반복
 * 
 */


package kr.co.job.oper;

public class ForTest01 {

	public static void main(String[] args) {
		// 
		int i = 0;
		int sum = 0;
		for(i=1; i<=10; i++) {
			System.out.println("반복변수 i값 : "+ i);
			sum = sum + i; // 합을 누적 sum += i
			
		}
		System.out.println("for문 종료후 반복변수 i값 : "+ i);
		
		
		
		

	} //end

} //end
