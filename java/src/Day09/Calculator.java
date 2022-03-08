package Day09;

public class Calculator {
	// 1. 필드
	// 2. 생성자
	
	// 3. 메소드 
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	// 1. void : 리턴타입 = 반환타입
		// 리턴타입 없다는 의미
	// 2. powerOn : 메소드 이름[ 아무거나 ]
	// 3. (인수1, 인수2) : 외부로부터 전달받는 변수 
	// 4. {  } : {}내 실행코드 작성 
	
	int plus( int x , int y ) {
			// x= 5  , y = 6
		int result = x + y;
		return result;
	}
	// 1. int : 리턴타입 = 반환타입
		// int : 메소드 종료후에 다시 호출된 곳으로 
		//		전달할 데이터 자료형
		// 5. return : 메소드 종료후에 
	// 2. plus : 메소드 이름[아무거나]
	// 3. (int x , int y ) : 외부로부터 x 와 y 라는 int형 변수 2개를 전달 받기 
	// 4. { } : 실행코드 
	
	double divide( int x , int y ) {
					// x =10  , y = 4
		double result = (double)x / (double)y;
		return result;
	}
	
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	
	
	
	

}
