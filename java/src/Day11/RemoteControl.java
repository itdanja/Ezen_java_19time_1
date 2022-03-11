package Day11;

public interface RemoteControl {
	// 인터페이스 선언 
	// 목적 : 선언만하고 구현은 각 클래스 하기
	// 예) 리모콘 인터페이스 
		// 삼성TV 클래스    LGTV 클래스   대우TV 클래스 
	// 상수(final) 필드 선언 = 수정 불가능 
		// 상수[고정값] <--->변수[변하는값]
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	// 추상메소드 = 선언만 하고 구현x
	public void turnOn();
	public void turnOff();
	public void setVolume( int volume );
	
}
