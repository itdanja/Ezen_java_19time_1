// 한 주석 : 주석[ 코드 설명달기( 실행과 무관 ) ]
/* 
  여러 주석 : 여러줄 주석 
*/

package Day01; // 패키지[?????? 여러개 클래스파일 보관하는곳 ] 

public class Day01_1 {  // class 시작
	
//  public : 접근제한자 [ 접근할수 있는 제어 ]
	// class : 클래스 선언 [ 클래스?????? 클래스 사용하겠다는 의미 ]
		// Day01_1 : 클래스 이름
			// { : 시작   } : 끝
	
	// 1. 출력해보기
		// 1. 클래스 괄호 안에서 작성한다.
		// 2. main 컨트롤+스페이바 => 자동완성
		// 3. main메소드[ 미리 만들어진 함수 코드 ]
			// main 스레드 포함 [ 스레드 : 컴퓨터가 코드 읽는 흐름 ]
			// main 메소드 안에 있는 코드만 실행 가능 [ 필수!! ]
	public static void main(String[] args) { // main 시작
		// static : 정적변수
			// void : 함수의 반환타입이 없다
				// main : main 함수 이름
					// { : 시작   } : 끝
	// 2. 출력함수 작성
		// 1. syso 컨트롤+스페이바 => 자동완성
		 System.out.println("JAVA시작");
		 	// System : 시스템 클래스
		 		// .out : 출력 메소드
		 			// println("출력하느 싶은단어") : 출력메소드
		 				// ( : 함수 안에 들어가는 수 시작
		 				// ) : 함수 안에 들어가는 수 끝
		 				// ; : 컴퓨터에게 한줄 일처리 명령
		 
		 System.out.println(10);
		 System.out.println("JDK"+11); // 연결 연산자 
		 System.out.println(11+22);	// 더하기 연산자
	} // main 끝
} // class 끝

	// 1. println("문자열") 	: 문자열 출력시 	"  " 
	// 2. println('문자')	: 문자 출력시 		' '
	// 3. println( 숫자 )	: 숫자 출력시 
	// 4. println( "문자열" + 
		// + 연산자 ( 1. 연결 연산자 2. 더하기 )






