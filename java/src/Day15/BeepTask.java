package Day15;

import java.awt.Toolkit;

public class BeepTask implements Runnable {
			//			구현하다   멀티스레드인터페이스명
	// run 메소드를 구현
	@Override // 추상메소드를 구현할때 사용하는 용어
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for( int i = 0 ; i<5 ; i++) {
			toolkit.beep();
			try { Thread.sleep(500); }catch( Exception e ) {}
		}
		
	}
}
















