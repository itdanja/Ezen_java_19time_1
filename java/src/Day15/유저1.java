package Day15;

public class 유저1 extends Thread {
	
	private 계산기 my계산기; // 계산기 변수 선언 
	
	public void set계산기( 계산기 my계산기) {
		this.setName("유저1"); // 현 스레드 이름 설정
		this.my계산기 = my계산기;
		// 외부로 받은 인수의 my계산기를 현재 클래스내 필드 저장 
	}
	@Override
	public void run() {
		my계산기.set메모리(100);
	}
	
}
