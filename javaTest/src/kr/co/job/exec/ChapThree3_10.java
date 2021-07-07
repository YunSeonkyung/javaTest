/*
 * 대문자를 소문자로 변경하는 코드
 * 문자 ch에 저장된 문자가 대문자인 경우에만 소문자로 변경한다.
 * 문자코드는 소문자가 대문자보다 32만큼 더 크다.
 * 예를 들어 'A' 의 코드는 65이고,
 * 'a' 의 코드는 97이다
 * 
 */
package kr.co.job.exec;

public class ChapThree3_10 {

	public static void main(String[] args) {
		char ch = 'A';
		
		char lowerCase = (ch>='A' && ch <= 'Z') ? ((char)(ch+32)) : ch;
				
				
		// 문자 ch 가 대문자일때: 'A' <= ch && ch <= 'Z'
		// 문자 ch 가 소문자일떄 : 'a' <= ch && ch <= 'z'
		// 
		System.out.println("ch: + "+ch);
		System.out.println("ch to lowerCase:" + lowerCase);
		
		

	}//메인 종료

}//끝
