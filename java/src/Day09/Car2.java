package Day09;

public class Car2 {
	
	// 1. 필드
	int gas;
	// 2. 생성자
		// [x]
	// 3. 메소드
	// ( void : return 없다 ] )
	void setGas( int gas ) {
				// gas = 5
		this.gas = gas;
		// this.내부변수 = 외부변수
	}
	// 메소드
	// ( boolean : return 값은 false 아니면 true )
	boolean isLeftGas() {
		if( gas == 0 ) {
			System.out.println("gas가 없습니다.");
			return false; // 메소드 종료시 false 전달
		}
		System.out.println("gas가 있습니다.");
		return true; // 메소드 종료시 true 전달 
	}
	// 메소드 [ 인수x 반환x ]
	void run() {
		while(true) { // 무한루프 [ 종료조건 : gas 0 이면 ] 
			if( gas > 0 ) { // 만약에 gas가 0보다 크면
				System.out.println("달립니다.(gas잔량:"+gas+")");
				gas -= 1; // 가스 차감 
			}else { // 만약에 gas가 0이면 
				System.out.println("멈춥니다.(gas잔량:"+gas+")");
				return; // 메소드 종료 반환값 없다.
				// 메소드 종료시 메소드 안에 있는 코드 종료[ 무한루프 종료]
			}
		}
	}
	
	

	
	
	
	
	
}
