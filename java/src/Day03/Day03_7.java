package Day03;

import java.util.Scanner;

public class Day03_7 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print(" 금액 : ");	
		int 금액 = scanner.nextInt();
		// 1. 십만원 권
		System.out.println(" 십만원 : " + (금액/100000) +"장");
			// 금액에서 십만원 권 차감 
			금액 = 금액 - (금액/100000) * 100000 ;
						// (금액/100000) * 100000 : 300000
				// 1. (금액/100000)
				// 2. * 100000
				// 3. - 
				// 4. = 
		// 2. 만원
		System.out.println(" 만원 : " + (금액/10000) + "장");
			금액 = 금액 - (금액/10000) * 10000;
		// 3. 천원
		System.out.println(" 만원 : " + (금액/1000) + "장");
			금액 = 금액 - (금액/1000) * 1000;
		// 4. 백원
		System.out.println(" 천원 : " + (금액/100) + "개");
		
	}

}

	// 문제2 : 지폐 개수 세기 
	/*
	 * [조건] : 십만원 단위의 금액을 입력받아 
	 * [출력] : 입력받은 금액의 지폐수 세기 
	 * [출력 예 ] : 356789  
	 * 		십만원 : 3장 
	 *		만원 : 5장 
	 * 		천원 : 6장 
	 * 		백원 : 7개
	 */

