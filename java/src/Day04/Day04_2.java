package Day04;

public class Day04_2 { // c s

	public static void main(String[] args) { // m s 
		
		// 조건문 [ 제어문 / 판단력 / 경우의수 ]
			// 학생에게 1000원주고 편의점가서 콜라 사와라 심부름
				// 1. 학생 편의점가서 콜라[1200]를 구매 -> 구매불가[ 돈 부족 ]
				//    제어[판단력]
				// 만약에 A편의점에 콜라가 1000원보다 초과이면 = B편의점으로 가라
				// 만약에 B편의점에 콜라가 1000원보다 이하면  = 구매하고 복귀
		
					// 활용
						/*
						 *  if(  1000 >= a편의점콜라 ) 구매후 복귀 
						 *  else if( 1000 >= b편의점콜라 ) 구매후 복귀
						 *  else if( 1000 >= c편의점콜라 ) 구매후 복귀 
						 *  else 구매실패 복귀 
						 * 
						 */
		
			// 1. 조건식 ? 참 : 거짓 
			// 2. if
				// 1. if( 조건 ) 참일경우 실행코드;
				// 2. if( 조건 ) 참일경우 실행코드
				//    else 거짓일경우 실행코드;
				// 3. if( 조건1 ) {  참1 }
				//    else if( 조건2 ) { 참2 }
				//    else if( 조건3 ) { 참3 } 
				//	  else if( 조건4 ) { 참3 }
				//    else { 거짓  }
		
		
		// 예1) 조건 결과가 true 이면 실행 o 
		if( 3>1 ) System.out.println("예1) 3이 1보다 크다 ");
		
		// 예2) 조건 결과가 false 이면 실행불가 x  
		if( 3>5 ) System.out.println("예2) 3이 5보다 크다");
		
		// 예3) 조건 결과가 true 이면 실행 false 이면 else 실행 
		if( 3>5 ) System.out.println("예3) 3이 5보다 크다.");
		else System.out.println("예3) 3이 5보다 작다!.");
		
		// 예4) { } 가 사용되는 경우 => 실행코드가 2줄이상일경우 혹은 ; 2개이상일경우
		if( 3>2 ) { // if s 
			System.out.println("예4) true이면 실행"); 
			System.out.println("예4) 3이 2보다 크다.");
		} // if e
		else { // e s 
			System.out.println("예4) false이면 실행");
			System.out.println("예4) 3이 2보다 작다.");
		} // e e
		
		// 예5) 다양한 경우의수의 따른 제어 
		if( 3>5 ) System.out.println(" 예5) 3이 5보다 크다 ");
		else if( 3>4 ) System.out.println(" 예5) 3이 4보다 크다 ");
		else if( 3>3 ) System.out.println(" 예5) 3이 3보다 크다 ");
		else if( 3>2 ) System.out.println(" 예5) 3이 2보다 크다 ");
		else System.out.println( "예5) true 없다.");
		
		// 예5) 2
		if( 3>5 ) System.out.println(" 예5) 3이 5보다 크다 ");
		if( 3>4 ) System.out.println(" 예5) 3이 4보다 크다 ");
		if( 3>3 ) System.out.println(" 예5) 3이 3보다 크다 ");
		if( 3>2 ) System.out.println(" 예5) 3이 2보다 크다 ");
		else System.out.println( "예5) true 없다.");
		
		// 문제1) 점수1를 입력받아 점수가 90점 이상이면 합격 아니면 불합격 출력 
		
		// 문제2) 점수2를 입력받아 점수가 90점 이상이면 A등급
		//						점수가 80점 이상이면 B등급
		//						점수가 70점 이상이면 C등급
		//						그외 재시험
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	} // m e 
} // c e 
