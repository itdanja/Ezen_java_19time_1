package Day13;

import java.util.Scanner;

public class Day13_1 {
	// p.466
	// API : 미리 만들어진 클래스들 [ 라이브러리 ]
	public static void main(String[] args) {
		// p.484
		// String 클래스 
			// 1. java.lang 패키지에서 String 클래스 제공 [ java.lang패키지는 import x ]
				// 기본적으로 다른 패키지[폴더]에 클래스 사용시에는 import 작성 
			// 2. String클래스 new 연산자 없이 객체 생성 가능 
		String 이름1 = new String("유재석"); // String 객체 생성 
		String 이름2 = "유재석"; // 객체 생성시 new연산자 필수 [ 단 String 클래스는 자동으로 객체로 생성 ]
			// 3. String 클래스 다양한 생성자와 메소드 제공 
			// 4. 외부[네트워크,파일,키보드 등]로부터 데이터 받을때 보통 byte 배열 받음 
			
		// p.485 바이트배열 -> 문자열 변환
		
		// 바이트 -> 문자열 변환되는 이유
			// 1.아스키코드 [ 기계어 <-----> 문자 ] : 컴퓨터와 통신하기 위한 기준 번역표 
			// *기계어[ 0 or 1 ] -> 7자리 조합 -> 2의7승 -> 총 128 표현 -> 아스키코드  
		
		// 1.여러개 바이트를 저장할수 있는 바이트배열 선언 
			// 바이트 : +-127 를 저장할수 있는 자료형 
		byte[] bytes = { 72 , 101 , 108 , 108 , 111 , 32 , 74 , 97 , 118 , 97 };
	// 바이트->아스키코드    H  ,  e  , l  ,  l  ,   o  ,공백 , J  , a ,  v ,   a
		// 인덱스			0  ,  1  , 2  ,  3  ,   4  , 5   ,6 , 7 ,  8  ,   9 
		
		// 2. String클래스 생성자에 바이트배열 넣기 // * 바이트배열 -> 문자열 변환[ 기준:아스키코드 ] 
		String str1 = new String(bytes);
		// 3. 확인 
		System.out.println(" 바이트열 -> 문자열  : " + str1);
		// 4. 특정 위치만 문자열 변환
		String str2 = new String( bytes , 6 , 4 ); // 6번인덱스부터 4개 변환
		System.out.println(" 바이트열[6번인덱스부터 4개 ] : "+str2);
		
System.out.println("-------------------------------------------");			
		// p.486  : 바이트로 입력받아 문자열 변환
		// 1. 입력받을 바이트 를 저장할 바이트배열 선언[ 바이트 100개]
		byte[] bytes2 = new byte[100];
		// 2. 입력받기 
		System.out.print("입력 : "); 
		// 3. 키보드로부터 입력받은 바이트를 바이트배열에 저장 
		try { // 예외처리 
			int readByteNo = System.in.read( bytes2 ); // 일반예외[ 개발자와 상관없이 무조건 예외발생]
												// 일반적으로 외부[키보드,파일,네트워크 등 ]와 입출력시 예외발생 
			// System.out : 출력 관련 메소드 제공 [ Console 에 출력하기 ]
			// System.in : 입력 관련 메소드 제공 [ 키보드로 부터 입력받기 ]
		// readByteNo 변수 : 읽어온 바이트 개수
		// 4. 바이트배열 -> 문자열 변환 
		String str = new String( bytes2 , 0 , readByteNo-2);
			// * 바이트개수-2 하는이유
				// 입력시 a -> 97 바이트 저장 -> 97바이트 -> 문자열 변환 a
				// *입력시 a 입력후에 엔터를 입력하면 엔터에는 \n\r 포함되어 있음
				// 입력한 바이트 뒤에 \n\r 무조건적으로 추가되기 때문에 \n\r 제거하기 위해 바이트개수-2
		System.out.println("입력 결과 : " + str);
		
		}catch( Exception e ) {}
				

System.out.println("-------------------------------------------");			
		// String 메소드 

		//1. 문자열.charAt();
		// p.487 : 문자열.charAt(인덱스) : 해당 문자열내 인덱스의 문자 1개 추출 
		String ssn = "010624-1230123";
		//			  01234567
		char sex = ssn.charAt(7); // 7번 인덱스의 문자를 추출 => 1 
		switch( sex ) {
			case '1' :
			case '3' : System.out.println("남자");	break;
			case '2' :
			case '4' : System.out.println("여자");	break;
		}
System.out.println("-------------------------------------------");		
		// p.488 : 문자열.equals(비교문자열) : 해당 문자열과 비교문자열과 같으면 true 아니면 false 
			// 기본자료형[int,double,char등]은 == 연산자 비교가 가능하지만 문자열은 불가능 
		String strVar1 = new String("신민철");
		String strVar2 = "신민철";
		
		if( strVar1 == strVar2 ) { // 문자열은 == 로 비교 불가능 
			System.out.println(" 같은 string 객체를 참조 ");
		}else {
			System.out.println(" 다른 string 객체를 참조");
		}
		
		if( strVar1.equals(strVar2) ) { // 문자열은 .equals() 메소드로 비교 가능 
			System.out.println(" *같은 문자열을 가짐");
		}else {
			System.out.println(" *다른 문자열을 가짐");
		}
		
				
				
				
				
				
				
				
				
				
				
				
				
		
		
	}
}
