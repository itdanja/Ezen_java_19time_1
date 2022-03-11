package Day11;

public class Myclass {
	// 필드
	RemoteControl rc = new Television();
	// 인터페이스명 객체명 = new 클래스명(); // 인터페이스에 클래스메모리 할당
	
	// 생성자
	Myclass() {} // 빈생성자
	
	Myclass( RemoteControl rc ){ // 인터페이스를 인수로 받아 내부인터페이스 대입 
		this.rc = rc;
		rc.turnOn();
		rc.setVolume(5);
	}
	//메소드 
	void methodA() { // 오디오클래스로 부터 메모리할당받아 rc 인터페이스 사용하는 메소드
		RemoteControl rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
	}
	void methodB( RemoteControl rc ) { // 인터페이스를 인수로 받아 사용하는 메소드  
		rc.turnOn();
		rc.setVolume(5);
	}
	
	
	
}
