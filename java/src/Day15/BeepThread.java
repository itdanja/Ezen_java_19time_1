package Day15;

import java.awt.Toolkit;

public class BeepThread extends Thread {
			//			상속하다  멀티스레드클래스명 
	@Override  // 부모메소드를 재정할때 사용하는 용어
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for( int i = 0 ; i<5 ; i++ ) {
			toolkit.beep();
			try { Thread.sleep(500); }catch( Exception e ) {}
		}
	}
}
