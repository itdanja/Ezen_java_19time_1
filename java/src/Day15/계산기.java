package Day15;

public class ���� {
	
	// 1.�ʵ�
	private int �޸�;
	// 2.������
	
	// 3.�޼ҵ� 
	public int get�޸�() {
		return �޸�;
	}
	// 3. �޼ҵ� 
	// 2���̻��� �����尡 ������ �޼ҵ��� ȣ�������� �����߻�
	// �ذ�å : synchronized : ����ȭ
	// [ 2���̻��� �����尡 ������ �޼ҵ� ȣ��� 1���� 
	//  �����尡 ���������� ó���Ҽ� �ְ� ����� ����� ] 
	
	public synchronized void set�޸�( int �޸� ) {
		this.�޸� = �޸�; // �ܺη� �μ��� ���� �޸𸮸� ���� 
		
		try { Thread.sleep(2000); } // 2�ʰ� �Ͻ�����
		catch( Exception e ) {}
		
		System.out.println(Thread.currentThread().getName()
				+": "+this.�޸�); // �޸� ���
	}
}
