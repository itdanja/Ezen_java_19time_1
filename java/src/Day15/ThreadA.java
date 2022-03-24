package Day15;

public class ThreadA extends Thread {
					// 멀티스레드클래스로부터 상속받기
	// ctrl+스페이바 => 생성자 선언
	public ThreadA() {
		setName("스레드A"); // 스레드이름 설정
	}
	// ctrl+스페이바 -> 목록에서 run 찾고 엔터 
	@Override
	public void run() {
		for( int i = 0 ; i<2 ; i++) {
			System.out.println( getName()+"가 출력한 내용*");
		}
	}
	
}
