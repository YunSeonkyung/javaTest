/*
 * 회문수를 구하는 프로그램이다.
 * 숫자를 거꾸로 읽어도 앞으로 읽는 것과 같은수를 말한다.
 * 예를 들면 '12321'이나 '13531'같은 수를 말한다.
 * 
 * 힌트- 나머지 연산자를 이용하라
 * 
 */


package kr.co.job.exec;

public class ChpaFour4_15 {

	public static void main(String[] args) {
		// 회문수 : 역순도 같습니다.
		int number = 12321;
		String str = "";
		String str2 = "";
		// number => 문자열로 변경한다.str
		str = Integer.toString(number);
		
		//변경한 문자열을 역순으로 저장(대입)한다.str2
		for (int i = str.length()-1; i>=0; i--) {
			str2 += str.charAt(i);
		}
		System.out.println(str2); // str2값도 궁금해서 출력해봄
		
		
//		int number = 12321;
//		String str = null; // null은 ""와 동일하기 때문에 ""으로 사용해도됨
//		String str2 = null;
//		String temp = null; // 빈값인 temp를 만들어줌 
//		char ch;
//		String a;
//		temp = Integer.toString(number); 
//		// ㄴ temp에 1 2 3 2 1 을 문자열로 대입을해줌 (number= 12321)// 문자를 문자열로 형변화
//		//boolean isOk = true; // Ok 넌 회문수야
//		// number => 문자열로 변경한다.str
//		str = temp; //temp를 str에 대입시킴 -> 대입시키면 str에도 1 2 3 2 1 
//		
//		//변경한 문자열을 역순으로 저장(대입)한다.str2
//		// temp = 1 2 3 2 1 // 배열 인덱스값 -> 0 1 2 3 4
//		// temp.length() = 5 
//		// 4 3 2 1 0
//		// i=4 / i=3 / i=2 / i=1 / i=0
//		
//		for (int i = temp.length()-1; i>=0; i--) { // 역순이니까 증감임
//			// 템프 인덱스값이 4이기 때문에 // length길이가 5임 
//			// length 5에서 인덱스 4가 되려면 -1을 해야된다/ 왜냐하면 str2는 역순으로 배열4값이 1이기 때문에 역순으로 가져온다.
//			ch = temp.charAt(i); // ch에 4번째 배열값을 넣어준다. 역순으로 4 3 2 2 1 0 으로 넣어주면됨
//			a = Character.toString(ch); // 문자에서 문자열로 변경시킴 // String에서 char형태로 바꿔줌 // 문자를 문자열로 형변화
//			str2 += str.concat(a); // str2 에다가 추가
//			// str2는 결국 temp값이기 때문에 temp는 number값이다.// //number값을 str2에 넣는거임
//			//concat은 str2랑 a랑 합치는것
//		}
		
		
		if(str.equals(str2)) {
			System.out.println(number+ "는 회문수입니다.");
		} else {
			System.out.println(number+ "는 회문수가 아닙니다.");
		}


	}

}
