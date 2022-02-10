package Day02;

public class Day02_4 {
	
	public static void main(String[] args) {
		
		// p.89
		// 입출력 구조 
		//   키보드 ---system.in---->  컴퓨터 ---system.out---> 모니터
		System.out.println();
		
		// 출력
			// 1. System.out.println( )	: 출력후 줄바꿈
			// 2. System.out.print( ) : 출력만
			// 3. System.out.printf( ) : f(format)형식 출력
		
		int value = 123;
		System.out.println("출력후 줄바꿈 : " + value);
		System.out.println("---------------------");
		
		System.out.print("출력후 줄바꿈처리x");
		System.out.print("----------------------");
		System.out.print("print에서는 \\n으로 줄바꿈처리 가능 \n");
		System.out.println("---------------------");
		
		// 형식[ format 형식 ] 
			// 1. %d : 정수	
				// %숫자d	: 숫자만큼 자리 차지 [ 해당 자리에 숫자가 없으면 공백처리 ] 
				// %-숫자d	: 왼쪽정렬
				// %0숫자d	: 숫자만큼 자리 차지 [ 해당 자리에 숫자가 없으면 0 으로 채움 ]
			// 2. %f : 실수 
				// %.숫자f		: 숫자만큼 소수점 표시
				// %숫자1.숫자2f	: 숫자1만큼 정수 표시 . 숫자2만큼 실수 표시 
				// %-숫자f	
				// %0숫자f
			// 3. $s : 문자열 
		
		System.out.printf(" 상품의 가격: %d원 \n" , value );
		System.out.printf(" 상품의 가격: %6d원 \n" , value);
		System.out.printf(" 상품의 가격: %-6d원 \n" , value);
		System.out.printf(" 상품의 가격: %06d원 \n" , value);
		
		System.out.printf(" 상품의 가격: %.1f원 \n" , 10.55 );	// 
		System.out.printf(" 상품의 가격: %10.1f원 \n" , 10.55 );	// 
		System.out.printf(" 상품의 가격: %-10.1f원 \n" , 10.55 );	//
		System.out.printf(" 상품의 가격: %010.1f원 \n" , 10.55 );	//
		
		System.out.printf(" 상품의 가격: %s \n" , "10원");
		
		// 판단 
		System.out.println("상품의 가격 : "+value+"원");
		System.out.printf("상품의 가격 : %d원\n" , value);
		
		// 과제1 정답 
	
		
	}

}








