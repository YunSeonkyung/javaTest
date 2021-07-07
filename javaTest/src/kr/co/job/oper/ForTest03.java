/*
 * 두수르 입력받아서
 * 작은수에서 큰수까지 출력!
 * 
 */


package kr.co.job.oper;

public class ForTest03 {

	public static void main(String[] args) {
		// 선언
		int i = 0;
		int sum = 0;
		for (i=1; i<=10; i++) {
			System.out.println("반복변수 i값 : "+i);
			sum = sum + i; //합의 누적 sum += i
		}
		System.out.println("i="+i+"일때, sum=" + sum);

			//i=1일때 sum =1
			//i=2일때 sum =3
			//i=10일때 sum =55
			
			
			
			
	} //

} //
