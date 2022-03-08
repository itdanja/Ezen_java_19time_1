package Day09;

public class Calculator2 {

	// 1. 필드 
	// 2. 생성자
	// 3. 메소드 
		// 1. 계산실행 메소드 // 인수x 반환x
	void execute() {
		double result = avg( 7 , 10);
		println("실행결과 : "+result );
	}
		// 2. 평균계산 메소드 // 인수o 반환o
	double avg( int x , int y) {
		double sum = plus(x,y);
		double result = sum / 2;
		return result;
	}
		// 3. 합계계산 메소드 // 인수o반환o
	int plus ( int x , int y ) {
		int result = x + y;
		return result;
	}
		// 4. 결과출력 메소드 // 인수o반환x
	void println( String message ) {
		System.out.println( message );
	}
}








