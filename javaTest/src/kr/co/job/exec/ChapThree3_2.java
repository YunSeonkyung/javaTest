
 /* 아래의 코드는 사과를 담ㄴ는데 필요한 바구니(버켓)의 수를 구하는 코드이다.
 * 만일 사과의 수가 123개이고 하나의 바구니에는 10개의 사과를 담을 수 있다면, 13개의 바구니가 필요할것이다. 
 * (1)에 알맞는 코드를 넣으시오.
 * 
 * //  numOfBucket = numOfApples/sizeOfBucket + (numOfApples%sizeOfBucket > 0 ?1:0); 
 */


package kr.co.job.exec;

public class ChapThree3_2 {

	public static void main(String[] args) {
		// 3-2문제
		
		int numOfApples = 123; //사과의 개수
		int sizeOfBucket = 10; // 바구니의 크기(바구니에 담을수 있는 사과의 개수)
		int numOfBucket = 0; // 모든 사과를 담는데 필요한 바구니 개수
		
		if(numOfApples%sizeOfBucket > 0) { // 사과의 개수에서 사과담긴 바구니 개수를 나눈 나머지값 > 0 // 양수이다 // 123 % 10 == 12 // 12가 나머지 값이다.
			numOfBucket = (numOfApples/sizeOfBucket)+1; //모든 사과를 담는데 필요한 바구니 개수 = (사과의 개수에서 사과담긴 바구니 개수를 나눈 몫 값)+1 // 여기서 1은 나머지값 포함하기 위해서
		}
		System.out.println("필요한 바구니 수 : " + numOfBucket);
		
		
//		System.out.println("필요한 바구니의수 : " + numOfApples/numOfBucket);
		
		

	}

}
