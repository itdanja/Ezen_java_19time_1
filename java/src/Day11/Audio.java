package Day11;

public class Audio implements RemoteControl {
				// �����ϴ�
	//�ʵ�
	private int volume;
	
	// �޼ҵ� 
	@Override
	public void turnOn() {
		System.out.println(" audio �մϴ�. ");
	}
	
	@Override
	public void turnOff() {
		System.out.println(" audio ���ϴ�. ");
	}
	
	@Override
	public void setVolume(int volume) {
		if( volume > RemoteControl.MAX_VOLUME ) { // ������ 10�ʰ��̸� 
			// ������ �������������̽��� �ִ�������� ũ�� 
			this.volume = RemoteControl.MAX_VOLUME;
			// ������ �������������̽��� �ִ�������� ���� [ 10�ʰ� �Ұ��� ]
		}else if( volume< RemoteControl.MIN_VOLUME ) { // ������ 0 �̸��̸� 
			// ������ �������������̽��� �ִ�������� ������ 
			this.volume = RemoteControl.MIN_VOLUME;
			// ������ �������������̽��� �ּҼ������� ���� [ 0�̸� �Ұ��� ] 
		}else { // �׿�
			this.volume = volume;
		}
		System.out.println(" ���� audio ���� : " + this.volume);
	}
	

}
