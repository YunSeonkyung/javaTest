package kr.co.job.exec;

public class ChapThree {

	public static void main(String[] args) {
		// 3-1 예제문제
		//선언
		int x = 2;
		int y = 5;
		char c ='A';//'A'의 문자코드는 65
		
		System.out.println( 1 + x << 33); //32bit중 33은 한번 민것, 비트는 2로 곱함? 
		// 
		System.out.println(y >= 5 || x < 0 && x > 2 ); //진실,거짓 
		//T or F and f => True or False and False
		// => and부터 우선순위계산법!! // True or (False and False) 
		//and는 둘중 하나라도 동일하지 않으면=> False!! // or은 둘중 하나라도 동일하지 않으면 True!!
		//=> True or False //=> True!!  
		System.out.println(y += 10 - x++); // 5 +=10 -2++ //=> 15 - 2 = 13
		//=> y = y + 10 - x++; 와 동일한 방법임 
		System.out.println(x+=2); // x가 여기서부터 ++됨 => 2+1=3 // x+=2 -> 3+=2 // 5!!
		System.out.println(!('A'<=c && c <= 'Z')); 
		//아스키코드)유니코드 변환-> ( ! ( 65 <= 65) && 65 <= 90 ) 
		// 논리 연산자 (!)=> 부정의 의미
		// 65 <= 65 && 65 <= 90 // and는 둘중 하나라도 동일하지 않으면 False // T=1,F=0//
		// 1 && 
		System.out.println('C'-c); //'A'아스키코드는 65임 //67-65 =2
		System.out.println('5'-'0'); // '5'-'0'='5'
		System.out.println(c+1); // 'A'아스키코드는 65임 // 65+1=66
		System.out.println(++c); // ++c는 전치사로 대입전에 +1증가됨 // 65+1=66 
		//아스키코드) 자료형이 char(문자열)이기 때문에 'B'로 출력됨
		System.out.println(c++); //c++은 후치사로 대입후 +1되기떄문에 // 66의 아스키코드 문자는 'B'
		System.out.println(c); // 67

	} // 

}//










