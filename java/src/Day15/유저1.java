package Day15;

public class ����1 extends Thread {
	
	private ���� my����; // ���� ���� ���� 
	
	public void set����( ���� my����) {
		this.setName("����1"); // �� ������ �̸� ����
		this.my���� = my����;
		// �ܺη� ���� �μ��� my���⸦ ���� Ŭ������ �ʵ� ���� 
	}
	@Override
	public void run() {
		my����.set�޸�(100);
	}
	
}
