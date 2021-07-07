/*
 * P170 : 입력받은 숫자의 각 자리의 합 구하기
 * 
 */


package kr.co.job.oper;

import java.util.Scanner;

public class WhileTest03 {

	public static void main(String[] args) {
		// 
		int num =0;
		int sum = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요. : ");
		String tmp = scan.nextLine(); // 화면을 통해 입력받은 내용을 tmp에 저장 //.nextLine();은 문자열받는것
		num = Integer.parseInt(tmp); //입력받은 문자열(tmp)을 숫자로 변환
		//두줄이 한줄로 해도 됨 == num = Integer.parseInt(scan.nextLine());// Integer.parseInt은 문자열을 정수로 바꾸는 함수
		
		// 345입력받았을때 => 34 =>3
		while(num!=0){
			// num을 10으로 나눈 나머지르 sum에 더함
			sum += num%10; //sum = sum + num%10; // num나누기 10 // sum = sum + 3
			//System.out.printf("sum=%3d num=%d%n",sum, num);
			System.out.printf("sum="+sum+"num="+num);
			
			num /= 10; //num= num / 10; num을 10으로 나눈 값을 다시 num에 저장
		}
		System.out.println("각 자리수의 합:"+sum);
		
		
		
		
		
		
		
		

	}//

}//
