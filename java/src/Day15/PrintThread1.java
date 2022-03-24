package Day15;

public class PrintThread1 extends Thread {
				// 멀티스레드를 만들기위해
				// Thread 클래스로부터 상속받음
	//1.필드
	private boolean stop; // 중지 변수[ true 혹은 false 저장 가능 ]
	//2.생성자
	
	//3.메소드
	public void setStop( boolean stop ) {
		this.stop = stop;
	}
	
	//4. 멀티스레드 구현
	@Override
	public void run() {
		// *무한루프
		while( !stop ) { // ! : 부정( true->false / false->true )
			System.out.println("------음악 재생  ");
			try{ Thread.sleep(1000); } catch( Exception e ) {}
		}
		
		System.out.println("-----음악 재생중지  ");
	}

}
