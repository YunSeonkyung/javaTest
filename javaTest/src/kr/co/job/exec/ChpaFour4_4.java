/*
 * 1 + (1-2) + 3 + (-4)+ ... 과 같은 식으로 계속 더해나갔을때, 
 * 몇까지 더해야 총합이 100이상이 되는지 구하시오
 * ㄴ 몇까지이니까 범위모름 => 그래서 while
 * 
 * 홀수는 양수
 * 짝수는 음수
 */


package kr.co.job.exec;

public class ChpaFour4_4 {

	public static void main(String[] args) {
		// 선언
		
		int i = 0, sum=0;
		
		while (sum<100) { //sum이 100보다 작을경우
			if(i%2==1) { //i가 홀수라면 + // i를 2 로 나뉘었는데 나머지가 1이 나왔다는건 홀수이며 양수
				sum += i; // sum = sum + i
				}
				else { //i가 짝수라면 - // i를 2로 나뉘었는데 나머지가 짝수라는건 짝수
					sum-= i; // sum = sum - i
			}
			i++; // 
		}
		System.out.println("i=" + i + ", sum=" + sum);
		
		
//		********** for문으로 할경우 
//		for(i=1; true; i++) {
//			sum= sum +i * (-1);
//			if(sum>=100)
//				break;
//		}
//		System.out.println(i);
		
		
//		int sum =0, num=0;
//		while(true) {
//			num++;
//			if(num%2==0)
//				sum-=num;
//			else
//				sum +=num;
//			if(sum>=100)
//				break;
//		}
//		System.out.println(num);

	}

}
