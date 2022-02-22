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
		for( int i = 1 ; i<=s3 ; i++ ) {
			System.out.println("줄바꿈");
		}
		
		
		
	}

}
