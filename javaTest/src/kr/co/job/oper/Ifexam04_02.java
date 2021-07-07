/* 
 * 점수를 입력받아서 성적(A~D)을 출력하세요
 * 점수가
 * 97이상이면 A+, 96~94이면A0, 93이하이면 A-
 * 87이상이면 B+, 86~94이면B0, 83이하이면 B-
 * 77이상이면 C+, 76~94이면C0, 73이하이면 C-
 * 67이상이면 D+, 66~94이면D0, 63이하이면 D-
 * 
 */
package kr.co.job.oper ;

import java.util.Scanner;

public class Ifexam04_02 {

	public static void main(String[] args) {
		// 선언부 : 키보드입력, 숫자보관
				int score = 0; //점수
				Scanner scan = new Scanner(System.in);
				char ch = 'Z';
				char buho = '0';
				
				System.out.print("점수 입력 : ");
				score = scan.nextInt();
				
				if(score > 90) {
					ch = 'A';
				}
				else if(score >= 80) { // 
					ch = 'B';
				}
				else if(score >= 70) { // 70이상이면
					ch = 'C';
				}
				else if(score >= 60) { //60이상이면
					ch = 'D';
				}else if(score < 60) {//60미만
					ch = 'F';
				}
				
				
				// 부호처리를 위한 실행문     %나머지연산
				if(score >=60 && score <=100) {
					if(score%10 >=7||score==100)
						buho ='+';
					else if(score%10 <=3) 
						buho = '-';
				}
				
				// 당신의 점수는 ??점이고, 성적은 ??입니다.
				System.out.println("당신의 점수는" + score + "점이고, 성적은" +ch+buho+"입니다.");
				System.out.println("Program End!");
				
				
				


	} //

} //
