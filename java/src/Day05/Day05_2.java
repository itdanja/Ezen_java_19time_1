package Day05;

import java.util.Scanner;

public class Day05_2 {
	
	public static void main(String[] args) {
		
		// 반복문 
			// 1. 컴퓨터 피로도가 없기때문에 무한적으로 처리 가능
			// 2. for문 	2. while문  3.do~while문
			//		for : 단계적으로 증가 반복처리 
			//		while : 무한루프[ 동일한 반복 ] 
		
		// while 사용방법1 	
			// 1. 
			//		int i = 1;        	1. 반복변수 선언
			//		while( 조건 ) {  	2. 반복변수의 조건검사 [ true 실행 false 지나감 ]
			// 			true이면 실행문 	
			//			i++;			3. 반복변수의 증감식
			//		}
				// 조건이 true 이면 { } 안으로 들어감
				// 조건이 true 이면 실행문 처리
		
		// 예1 ) 
		int i = 1; // i변수에 1 저장 // 1.초기값 : 반복변수의 시작
		while( i<=10  ) { // 만약에 i가 10 이하이면 // 2.조건문 : 반복변수의 검사[비교]
			System.out.println("총 반복횟수 : " + i);
			i++; // i변수에 1 더하기 // 3.증감식 : 반복변수의 증가 혹은 감소 
		}
		
		// 예2 ) 누적합계 1~100까지 누적합계
			// while 사용할때 준비물 : 1.반복변수 2. while( 조건 ) 3. 증감식 
		
		int j = 1;	// 1. 반복변수의 초기값 
		int sum = 0;	// * 누적합계를 저장할 상자(변수) 
		
		while( j<=100 ) { // 2. 반복문 실행 조건 [ true 실행 아니면 불가 ]
			System.out.println("현재 j의 값은 : " + j);
			sum = sum + j;  // sum += j		// 누적합계 구하는 식  
			j++; // 3. 증감식 [ j를 1씩 증가 시킨다 ] 
		} // w e 
		
		// while 이 끝나는 조건은 J 가 101일때 종료 
		
		System.out.println("1~100까지의 누적합 : " + sum );
		
		// 예3 ) 무한루프 : 끝이 없는 반복문 
		// while( true ) { System.out.println(" 무한실행중 !!!!!!!!! ");}
		
		// 예4 ) 무한루프 :  조건이 충족하면 루프 종료하기 
		while( true ) {	// 조건문에 true 넣을경우 무한실행 
			
			System.out.println("Q 입력시 종료 됩니다.");
			// 1.입력받기 
			Scanner scanner= new Scanner(System.in);
			String 종료 = scanner.next();
			// 2. 조건 
			if( 종료.equals("q") || 종료.equals("Q") ) { // 만약에 입력한 값이 Q 혹은 q 이면 
				break; // 가장 가까운 반복문 혹은 switch의 { } 탈출
			}
			
		} // w e 
		
		// while이 종료되는 경우는 q 혹은 Q 을 입력했을때만 종료 
		
	} // me 
} // ce





