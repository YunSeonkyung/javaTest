/*
 * for 문을 while문으로 변경하라
 * 
 * for(int i = 0; i<10; i++) {
			for(int j =0; j<i; j++)
				System.out.println("*");
				System.out.println();
 * 
 */


package kr.co.job.exec;

public class ChpaFour4_5 {

	public static void main(String[] args) {
		// 선언
		int i = 0;
		int j = 0;
		while(j<=i){
			System.out.println("*");
			j++;
		}
		System.out.println();
		i++;
	}

}
