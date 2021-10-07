/**
 * 
 */
package edu;

import java.util.Scanner;

/**
 * @author user
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 변수 선언하기
		int firstNo, secondNo;
		int sum;
		
		// 두 수 입력하기 : 라이브러리 사용해 입력하고 싶어
		Scanner scan = new Scanner(System.in);
		System.out.print("첫수 : ");
		firstNo = scan.nextInt();
		System.out.print("두번째 수 : ");
	    secondNo = scan.nextInt();
		
		//합계내기(C = A+B)
		sum = firstNo + secondNo;
		
		//합계 출력하기
		System.out.println("합계: " + sum);
		
	}

}
