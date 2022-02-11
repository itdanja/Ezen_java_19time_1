package Day03;

import java.util.Scanner;

public class Day03_6 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print(" 기본급 : ");		
		int 기본급 = scanner.nextInt();
		
		System.out.print(" 수당 : ");			
		int 수당 = scanner.nextInt();
		
		int 세금 = (int)(기본급 * 0.1); 
				// int * double => double => 강제형변환
		int 실수령액 = 기본급 + 수당 - 세금;
		System.out.println(" 실수령액 : " + 실수령액 );
	
	}
}
	// 문제1 : 급여 명세서 
	/*
	 * [조건] 입력받기 : 기본급 , 수당 
	 * [출력] 실수령액 = 기본급 + 수당 - 세금[ 기본급10% ]
	 *
	 */



