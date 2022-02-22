package Day06;

import java.util.Scanner;

public class Day06_2 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		// 별찍기
		// 1. 입력받은 정수만큼 별 출력 
		System.out.print(" 문제1 별 개수 : ");	int s1 = scanner.nextInt();
		for( int i = 1 ; i<=s1 ; i++ ) {
			// i는 1부터 입력받은 정수까지 i는 1씩증가 
			System.out.print("*"); // 줄바꿈x 
		}
		
		System.out.println("\n---------------------\n");
		
		// 2. 입력받은 정수만큼 별 출력 // 조건 : 5개마다(5배수) 줄바꿈 [ 값%수 == 0 ] 
		System.out.print(" 문제2 별 개수 : "); int s2 = scanner.nextInt();
		for( int i = 1 ; i <=s2 ; i++) {
			System.out.print("*");
			// 조건 => if
			if( i % 5 == 0  ) System.out.println();
			// i가 5의 배수마다 줄바꿈처리 
		}

		System.out.println("\n---------------------\n");
		
		// 3. 입력받은 줄 만큼 출력 // 1. 줄 반복문 2. 별 반복문 
		System.out.print(" 문제3 줄수 : "); int s3 = scanner.nextInt();
		
		for( int i = 1 ; i<=s3 ; i++ ) { // for1 : 줄수 반복처리 반복문 
			// 별찍기 
			for( int s = 1 ; s<= i ; s++ ) {	// for2 : 줄마다 반복처리 반복문
				// s는 1부터 현재 줄까지  1씩 증가 
				System.out.print("*");
			}
			// 줄바꿈 
			System.out.println("");
		}
		
		System.out.println("\n---------------------\n");
		
		// 4. 
		System.out.print(" 문제4 줄수 : "); int s4 = scanner.nextInt();
		
		for( int i = 1 ; i<=s4; i++ ) {
			
			//별찍기 
			for( int s = 1 ; s<=s4-i+1 ; s++ ) {
				System.out.print("*");
			}
			// 줄바꿈
			System.out.println();
		}
		
		System.out.println("\n---------------------\n");
		
		// 5. 
		System.out.print(" 문제5 줄수 : "); int s5 = scanner.nextInt();
		for( int i = 1 ; i<=s5; i++ ) {
			
			// 공백찍기 
			for( int b = 1 ; b<=s5-i ; b++ ) {
				System.out.print(" "); // 스페이스 1개 => 공백
			}
			// 별찍기 
			for( int s = 1 ; s<=i ; s++ ) { System.out.print("*"); 
			}
			// 줄바꿈
			System.out.println( );
		}
		
		System.out.println("\n---------------------\n");
		
		// 6. 
		System.out.print(" 문제6 줄수 : "); int s6 = scanner.nextInt();
		
		for( int i = 1 ; i<=s6 ; i++ ) {
			
			// 공백찍기 
			for( int b = 1 ; b<=i-1 ; b++ ) { 
				System.out.print(" ");
			}
			// 별찍기 
			for( int s = 1 ; s<=s6-i+1 ; s++ ) {
				System.out.print("*");
			}
			// 줄바꿈
			System.out.println();
			
		}
		
		System.out.println("\n---------------------\n");
		
		// 7. 
		System.out.print(" 문제7 줄수 : "); int s7 = scanner.nextInt();
		for( int i = 1 ; i<=s7 ; i++ ) {
			// 공백찍기
			for( int b = 1 ; b<=s7-i ; b++ ) {
				System.out.print(" ");
			}
			// 별찍기 
			for( int s = 1 ; s<= i*2-1 ; s++) {
				System.out.print("*");
			}
			// 줄바꿈
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
