package Day15;

public class ����2 extends Thread {
	
	private ���� my����;
	
	public void set����( ���� my���� ) {
		this.setName("����2");
		this.my���� = my����;
	}
	@Override
	public void run() {
		my����.set�޸�(50);
	}

}
