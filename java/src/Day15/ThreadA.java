package Day15;

public class ThreadA extends Thread {
					// ��Ƽ������Ŭ�����κ��� ��ӹޱ�
	// ctrl+�����̹� => ������ ����
	public ThreadA() {
		setName("������A"); // �������̸� ����
	}
	// ctrl+�����̹� -> ��Ͽ��� run ã�� ���� 
	@Override
	public void run() {
		for( int i = 0 ; i<2 ; i++) {
			System.out.println( getName()+"�� ����� ����*");
		}
	}
	
}
