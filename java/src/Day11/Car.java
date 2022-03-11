package Day11;

public class Car {
	
	// 필드
	Tire frontLefTire = new Tire("앞왼쪽",6); // 수명:6
	Tire frontRightTire = new Tire("앞오른쪽", 2);// 수명:2
	Tire backLeftTire = new Tire("뒤왼쪽", 3); //수명:3
	Tire backRightTire = new Tire("뒤오른쪽", 4);// 수명:4
	// 생성자
	// 메소드
	int run() { // 자동차 달리기 
		System.out.println("자동차가 달립니다.");
		if( frontLefTire.roll() == false ) 	{stop(); return 1;}
		if( frontRightTire.roll()==false) 	{stop(); return 2;}
		if( backLeftTire.roll() == false ) 	{stop(); return 3;}
		if( backRightTire.roll() == false ) {stop(); return 4;}
		return 0;
	}
	
	// 메소드 
	void stop() {
		System.out.println("[자동차가 멈춥니다.]");
	}
	

}
