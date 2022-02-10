package Day02; // 패키지명 

public class Day02_1 { // c s 
	
	// 1. 코드를 읽어주는 main메소드 
	public static void main(String[] args) { // m s 
		
		// p.48 변수 
			// 1. 변수( 변하는수 ) <---> 상수 ( 고정된수 )
			// 2. 변수 : 값을 저장하는 상자
				// 컴퓨터 값 저장 [ 장치 : 메모리(RAM) ] 
				// CPU : 사람[뇌 : 명령 , 제어 , 연산 등 (저장X) ]
				// 주기억장치[RAM] : 사람 단기 기억 [ 저장 기능 ] : 단점 [ 휘발성 : 전기X저장X ]
					// 변수 , 메소드 등 
				// 보조기억장치[ ROM ] : 사람 영구 기억 [ 저장 기능 ] : 비휘발성 : 전기X저장O ]
					// 코드 , 파일 , DB 등 
			// 3. 변수 선언 
				// 자료형 변수명;
				// 미리 만들어진 단어 [ 예약어 ]는 제외
			// 4. 변수에 값 저장 
				// =(대입연산자)	:  오른쪽값을 왼쪽에 대입[넣기]
		 int age; // age 라는 이름의 변수 선언 
		 double value; // value 라는 이름의 변수 선언 
		 age = 10; // age  변수에 10을 대입
		 value = 10.5; // vbalue 변수에 1.5 을 대입
		 
		 // 예제1_p.51 : 변수 초기화 
		 //int value; // 위에서 선언된 동일한 변수명 중복x
		 int value2 = 3; // 변수 선언과 초기화
		 	// 1.0  2.공백 3.null 4.쓰레기값[임의값]    서로 다르다 
		 int result = value2 + 10; 
		 			// 초기화가 안되어 있는 변수는 연산 불가!!!
		 
		 // 예제2_p.53 : 변수 사용[ 변수 호출 : 변수명 출력하면 변수 안에 값은 출력 ]  
		 int hour = 3; //  hour 변수에 3 저장 
		 int minute = 5;	// minute 변수에 5 저장 
		 // syso + 컨트롤 + 스페이바 
		 System.out.println(hour +"시간 " + minute + "분 ");
		 	// 문자처리 X : 숫자 , 예약어 , 문법 , 변수 등 " " 문자처리 X
		 	// 문자처리 O : 미리 작성되지 않는 단어들 
		 		// + : 1. 연결 연산자 [ 변수명+"문자" ] 2. 더하기 연산자 [ 변수명+숫자 ]
		 int totalMinute = ( hour *60 ) + minute;
		 System.out.println("총 : " + totalMinute + " 분 ");
		 
		 System.out.println("-------------------------------------------");
		 
		 // 예제3_p.53~54 : 변수값 교환 
		 int x = 3 ; int y = 5;
		 System.out.println( "x:"+x +", y:"+y);
		 int temp = x; //  x의 값[3] 을 temp 저장
		 	// 왜 : 
		 x = y ; // y의 값[5] 을 x 저장 
		 y = temp; // temp 의값[3] 을 y에 저장 
		 
		 
	} // m e

} // c e




