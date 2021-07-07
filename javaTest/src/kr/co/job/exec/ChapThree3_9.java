package kr.co.job.exec;

public class ChapThree3_9 {

	public static void main(String[] args) {
		// 선언
		char ch = 'Z';
		boolean b = ('A'<= ch && ch <= 'Z'|| 'a' <= ch && ch <= '9' || '0'<= ch && ch <='9' );//good continue~
		
		System.out.println(b);				
	} //
}//



// 삼항연산자
// str = (조건) ? 참 : 거짓
// 대입연산자