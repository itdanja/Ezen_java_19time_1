package Day06;

import java.util.Scanner;

public class Day06_1 { 
	
	public static void main(String[] args) {
		
		// 1.출력 2.저장[변수] 3.입력 4.연산자 5. 제어 6.반복문
		
		// 반복문 p. 148
			// for 
			// 형태 : 어디서부터 어디까지 몇씩 증가/감소 반복할껀지 정하기  
			//    1. for( 1.초기값 ; 2.조건문 ; 4.증감식 ) {  3.실행문   } 
			// 				
		
			// 	  2. 	1.초기값
			//			while( 2.조건문 ){   3.실행문; 4.증감식 } 
		
			// 	  3. for중첩
			//			for( int i = 1 ; i<=5 ; i++ ) {
			//					
			//				for( int j = 1; j<=5 ; j++ ) { 
			//					실행문; [ 실행문의 총 실행횟수 : 5*5 = 25 ]
			//				}
			//			}
			//			i = 1일때	j = 1 2 3 4 5 
			//			i = 2일때	j = 1 2 3 4 5 
			//			 ~~~~~
			//			i = 5일때	j = 1 2 3 4 5 
			//						j반복횟수 : 25
		
		
		
		// 예제1 for,while 차이 [ 1~100까지 누적합계 ]
			// 1. while 
			int sum1 = 0; // 누적값을 저장할 총합계 변수 
			int i = 0; // 1.초기값 
			while( i<=100 ) {	// 2. 조건문 
				sum1 += i;	// 3. 실행문[ 조건이 true 일때 실행가능 ]
				// 누적합계 
				i++;		// 4. i값이 1씩증가
			}
			System.out.println("while문으로 사용한 누계 : " + sum1 );
			
			// 2. for 
			int sum2 = 0;
			for( int j = 0 ; j<=100 ; j++ ) {
				// 1.초기값  ; 2.조건문 ; 4.증감식
				sum2 += j; // 3.실행문
			}
			System.out.println("for문으로 사용한 누계 : " + sum2);
			
		// 예제1_p.150 [ 1부터 10까지 출력 ] 
			for( int h = 1 ; h<=10 ; h++ ) {
				System.out.println( h );
			}
		// 구구단 
			// 2단 [ for ] 
			for( int 곱 = 1 ; 곱<=9 ; 곱++ ) {
				// 곱이 1부터 9까지 1씩증가하면서 반복
				System.out.println( "2 * "+곱+" = " + (2*곱) );
			}
			// 2~9단 [ for 중첩 ] 
				// 단 2 일때 곱 1 2 3 4 5 6 7 8 9 
				// 단 3 일때 곱 1 2 3 4 5 6 7 8 9
				// 단 마다 곱 9번 실행 = 8*9 = 72회 실행  
			for( int 단 = 2 ; 단<=9 ; 단++ ) {
				// 단이 2부터 9까지 1씩 증가하면서 반복처리
				for( int 곱2 = 1 ; 곱2<=9 ; 곱2++) {
					System.out.println( 단 +" * "+곱2+" = " + (단*곱2) );
				}
			}
			// 문제1 : 사용자로부터 단을 입력받아 해당 단의 1~20곱 까지의 결과 출력 
			// 1. 입력 -> 저장 -> 반복 -> 출력 
			Scanner scanner = new Scanner(System.in);
			System.out.print(" 단 입력 : ");
			int dan = scanner.nextInt();	// 1. 입력받아 저장하기 
			
			System.out.print( dan+"단 을 출력합니다. ");
			
			for( int gob = 1 ; gob<=20 ; gob++ ) {
				System.out.println( dan +" * "+ gob +" = " + ( dan*gob )  );
						// 변수는 문자처리 X [ 컴퓨터가 알고 있는 문자는 " " X ]
			}
	
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	}

}
