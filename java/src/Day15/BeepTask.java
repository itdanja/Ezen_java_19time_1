package Day15;

import java.awt.Toolkit;

public class BeepTask implements Runnable {
			//			�����ϴ�   ��Ƽ�������������̽���
	// run �޼ҵ带 ����
	@Override // �߻�޼ҵ带 �����Ҷ� ����ϴ� ���
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for( int i = 0 ; i<5 ; i++) {
			toolkit.beep();
			try { Thread.sleep(500); }catch( Exception e ) {}
		}
		
	}
}
















