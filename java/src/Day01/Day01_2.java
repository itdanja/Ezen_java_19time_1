package Day01;	// 패키지이름

import java.util.Scanner;

// 비트 : 0 혹은 1   1bit
	// 바이트 : 8비트 -> 1byte
		// 01010101
	// 킬로바이트 : 1024바이트 -> 1kbyte

public class Day01_2 { // c s

	// { } 안에 들어오면 tab 들여쓰기
	public static void main(String[] args) {
		// main + 컨트롤 + 스페이바 
			// main 메소드 [ 필수 : main 스레드 ]
		
		//1.출력하기 [ Syso ] 
		System.out.println("입력 : ");
		//2.입력받기 
			// 1. 키보드[ a -> 바이트(11000011) 전송 ] -> 
		Scanner scan = new Scanner(System.in);
		// 객체생성하는 방법 : 클래스명 객체명 = new 생성자( 인수 )
			// System.in : 입력 [ 키보드 ] 
				// Scanner 클래스 [ 키보드로 부터 입력값을 저장 ]
					// 키보드 --입력값--> Scanner scan 저장
		String s = scan.next();
			// scan.next() : 입력된 값을 가져오기
				// s 라는 변수에 저장
		System.out.println( "입력한 값은 : " + s); // s 변수 출력 
	}
} // c e














