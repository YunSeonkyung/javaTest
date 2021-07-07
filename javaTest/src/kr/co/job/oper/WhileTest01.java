/*
 * 실행문1
 * while(조건){
 * 		실행문2 => 조건이 참이면 실행된.
 * }
 * 실행문3
 * 
 */

package kr.co.job.oper;

public class WhileTest01 {

	public static void main(String[] args) {
		// 1~10까지의 합
		
		int i =10;
		int sum = 0;
		
		
		while(i!=0) { //반복문은 실행문을 반복적으로 실행해야 할 때 사용 한다. // 조건이 참이면 들어감
			sum += i;
			System.out.println(i);
			i--;
		}
		
		System.out.println("sum = " + sum);
		
		// 
		
		
		

	}

}
