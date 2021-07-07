/*
 * 점수를 입력받아서 성적(A~F)을 출력하세요
 *  성적
 */

package kr.co.job.oper;

import java.util.Scanner;

public class Ifexam01_1 {

	public static void main(String[] args) {
		// 선언부 : 키보드입력, 숫자보관
		int score = 0; //점수
		Scanner scan = new Scanner(System.in);
		
		System.out.print("점수 입력 : ");
		score = scan.nextInt();
		
		if(score >= 90 && score <=100) { //90이상이면
			System.out.println("A");
		}else if(score >= 80) { // 80이상이면
			System.out.println("B");
		}else if(score >= 70) { // 70이상이면
			System.out.println("C");
		}else if(score >= 60) { //60이상이면
			System.out.println("D");
		}else if(score > 60) {//60미만
			System.out.println("F");
		}
		
		System.out.println("Program End!");
		
		
		
		
		
		
		
		
		
		
	}

}
