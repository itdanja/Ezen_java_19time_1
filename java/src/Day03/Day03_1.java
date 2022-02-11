package Day03;

import java.io.IOException;
import java.util.Scanner;

public class Day03_1 { // c s 

	public static void main(String[] args) throws Exception{ // m s 
										// 오류처리(예외처리) : 입력시 오류발생하기 때문에 
		// 입력 
			// 1. System.in.read() : 키보드로 부터 하나의 문자 입력받기
		// 예1_p.93
		int keycode; // int형[4바이트 만큼 저장] 변수 선언
		
		keycode = System.in.read(); // 오류 발생!!!
			// = : 대입연산자 [ 오른쪽값이 왼쪽에 대입 ] 
				// System.in : 입력	<----> System.out : 출력
					// read() : 키보드 입력값 읽기 메소드 
		System.out.println("keyCode : " + keycode );
		
		keycode = System.in.read();
		System.out.println("keycode : " + keycode );
		
		keycode = System.in.read();
		System.out.println("keycode : " + keycode );
		
		// 예2_p96
		Scanner scanner = new Scanner( System.in );
									  // 키보드입력
			// 객체 = 키보드입력값 
		String inputdata;	// 문자열[ 문자 여러개 ]  객체
		char c ; // 문자[ 문자 1개] 변수 
		
		inputdata = scanner.next();
		System.out.println("scanner : " + inputdata );
		
		
		
	} // m e 
	
} // c e 
