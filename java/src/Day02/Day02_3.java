package Day02;

public class Day02_3 {
	
	public static void main(String[] args) {
		
		//타입 변환 [ 상자 크기 변경 ] 
					//	-----------------> 자동타입변환 [ 작 -> 크 ]
			// byte -> short -> int -> long -> float -> double
					//	<---------------- 강제타입변환 [ 크 -> 작 ]
			// 1. 자동타입변환
				// 작은 상자 -> 큰 상자
					// byte -> int 
				// 큰 상자 -> 작은 상자   ( 상자 크기가 다름 )
					// int -> byte 불가 ( 메모리 손실 ) 
			// 2. 강제타입변환 [ 어떠한 경우에도 타입변환 ( 메모리 손실 ) ]
				// (타입명)변수명
		
		// 예제1_ p.74~75
		byte bytevalue = 10; // byte 변수 선언  
		int intvalue = bytevalue; // byte 변수를 int변수에 저장
		
		int intvalue2 = 10; // int 변수 선언 
		// byte bytevalue2 = intvalue2; // int 변수를 byte변수에 저장 불가
			// 왜?? : 
		// 해결책 => 강제형변환
		byte bytevalue2 = (byte)intvalue2;
							// int형변수를 byte 강제로 변환
		
		// 연산 형변환 -> 교재 참고
		
		
	}

}
