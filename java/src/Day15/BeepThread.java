package Day15;

import java.awt.Toolkit;

public class BeepThread extends Thread {
			//			����ϴ�  ��Ƽ������Ŭ������ 
	@Override  // �θ�޼ҵ带 �����Ҷ� ����ϴ� ���
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for( int i = 0 ; i<5 ; i++ ) {
			toolkit.beep();
			try { Thread.sleep(500); }catch( Exception e ) {}
		}
	}
}
