package Day11;

public interface RemoteControl {
	// �������̽� ���� 
	// ���� : �����ϰ� ������ �� Ŭ���� �ϱ�
	// ��) ������ �������̽� 
		// �ＺTV Ŭ����    LGTV Ŭ����   ���TV Ŭ���� 
	// ���(final) �ʵ� ���� = ���� �Ұ��� 
		// ���[������] <--->����[���ϴ°�]
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	// �߻�޼ҵ� = ���� �ϰ� ����x
	public void turnOn();
	public void turnOff();
	public void setVolume( int volume );
	
}
