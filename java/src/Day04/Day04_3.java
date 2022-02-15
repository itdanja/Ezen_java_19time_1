package Day04;

import java.util.Scanner;

public class Day04_3 {
	
	public static void main(String[] args) {
		
		// 문제1 : 2개의 정수를 입력받아 더 큰수 출력 
		
			// 1. 입력객체 생성
		Scanner scanner = new Scanner(System.in);
			// 2. 입력받은 2개의 수를 2개의 변수에 저장 
		System.out.print("정수1 입력 : "); int 정수1 = scanner.nextInt();
		System.out.print("정수2 입력 : "); int 정수2 = scanner.nextInt();
			// 3. 비교/제어 -> 출력 
		if( 정수1 > 정수2 ) System.out.println(" 더 큰수는 정수1 : " + 정수1 );
		else if( 정수1 < 정수2 ) System.out.println(" 더 큰수는 정수2 : " + 정수2 );
		else System.out.println(" 두 수는 같다. ");
		
		// 문제2 : 3개의 정수를 입력받아 가장 큰수 출력 
			// 1. 입력객체 생성 [ 문제1 입력했기 때문에 생략 ]
			// 2. 입력받은 3개의 수를 3개의 변수에 저장 
		System.out.print("정수1 입력 : "); int 수1 = scanner.nextInt();
		System.out.print("정수2 입력 : "); int 수2 = scanner.nextInt();
		System.out.print("정수3 입력 : "); int 수3 = scanner.nextInt();
			// 3. 비교/제어 -> 가장 큰 값을 저장하는 변수를 임시변수에 저장
		int max = 수1; // 첫번째 정수를 max 변수에 저장 
		// 만약에 max보다 정수2가 더 크면 max에 정수2를 저장 
		if( max < 수2 ) max = 수2;
		// 만약에 max보다 정수3가 더 크면 max에 정수3를 저장 
		if( max < 수3 ) max = 수3;
		
		System.out.println(" 가장 큰 수는 : " + max );
		
		// 문제3 : 4개의 정수를 입력받아 가장 큰수 출력 
			// 1. 입력객체 [ 생략 ] 
			// 2. 4개 입력받아 4개의 변수에 저장 
		System.out.print("정수1 입력 : "); int 값1 = scanner.nextInt();
		System.out.print("정수2 입력 : "); int 값2 = scanner.nextInt();
		System.out.print("정수3 입력 : "); int 값3 = scanner.nextInt();
		System.out.print("정수4 입력 : "); int 값4 = scanner.nextInt();
			// 3. 비교 / 제어
		int max2 = 값1;
		if( max2 < 값2 ) max2 = 값2;
		if( max2 < 값3 ) max2 = 값3;
		if( max2 < 값4 ) max2 = 값4;
		System.out.println(" 가장 큰수는 : "+ max2 );
		
		// 문제4 : 4개의 정수를 입력받아 오름차순으로 출력 
			// 1. 입력객체 [ 생략 ]
			// 2. 문제3의 변수 사용 [ 생략 ]
				// 예)    3  7  5  2  오름차순 =>   2 3 5 7
					// 하나씩 다 비교한다.
					// 1. 값1  값2 와 값3 값4 비교 => 3비교
					// 2. 값2  값3 와 값4 비교 => 2비교 
					// 3. 값3  값4 와 비교 => 1비교 
					// 4. 값4  비교x
		int temp; // 교환시 사용되는 임시변수 ;
		if( 값1 > 값2 ) { temp = 값1 ; 값1 = 값2; 값2 = temp; } // 두개의 값 교환 
		if( 값1 > 값3 ) { temp = 값1 ; 값1 = 값3; 값3 = temp; }  // 두개의 값 교환 
		if( 값1 > 값4 ) { temp = 값1 ; 값1 = 값4; 값4 = temp; }  // 두개의 값 교환 
		////////////////////
		if( 값2 > 값3 ) { temp = 값2 ; 값2 = 값3; 값3 = temp; }  // 두개의 값 교환 
		if( 값2 > 값4 ) { temp = 값2 ; 값2 = 값4; 값4 = temp; }  // 두개의 값 교환 
		///////////////////
		if( 값3 > 값4 ) { temp = 값3 ; 값3 = 값4; 값4 = temp; }  // 두개의 값 교환 
		
		System.out.printf(" 오름차순 : %d %d %d %d \n" ,  값1 , 값2 , 값3 , 값4 );
		
		// 문제5 : 4개의 정수를 입력받아 내림차순으로 출력 
		if( 값1 < 값2 ) { temp = 값1 ; 값1 = 값2; 값2 = temp; }  // 두개의 값 교환 
		if( 값1 < 값3 ) { temp = 값1 ; 값1 = 값3; 값3 = temp; }  // 두개의 값 교환 
		if( 값1 < 값4 ) { temp = 값1 ; 값1 = 값4; 값4 = temp; }  // 두개의 값 교환 
		////////////////////
		if( 값2 < 값3 ) { temp = 값2 ; 값2 = 값3; 값3 = temp; }  // 두개의 값 교환 
		if( 값2 < 값4 ) { temp = 값2 ; 값2 = 값4; 값4 = temp; }  // 두개의 값 교환 
		/////////////////// 
		if( 값3 < 값4 ) { temp = 값3 ; 값3 = 값4; 값4 = temp; }  // 두개의 값 교환 
		
		System.out.printf(" 내림차순 : %d %d %d %d \n" ,  값1 , 값2 , 값3 , 값4 );

		
		// 문제6 : 로그인페이지
			// [ 입력 ] : 아이디와 비밀번호를 입력받기
			// [ 조건 ] : 회원아이디가 admin 이고 
			//           비밀번호가 1234 일 경우에는 
			//          로그인 성공 아니면 로그인 실패 출력
		
		
	}

}
