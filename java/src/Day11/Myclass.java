package Day11;

public class Myclass {
	// �ʵ�
	RemoteControl rc = new Television();
	// �������̽��� ��ü�� = new Ŭ������(); // �������̽��� Ŭ�����޸� �Ҵ�
	
	// ������
	Myclass() {} // �������
	
	Myclass( RemoteControl rc ){ // �������̽��� �μ��� �޾� �����������̽� ���� 
		this.rc = rc;
		rc.turnOn();
		rc.setVolume(5);
	}
	//�޼ҵ� 
	void methodA() { // �����Ŭ������ ���� �޸��Ҵ�޾� rc �������̽� ����ϴ� �޼ҵ�
		RemoteControl rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
	}
	void methodB( RemoteControl rc ) { // �������̽��� �μ��� �޾� ����ϴ� �޼ҵ�  
		rc.turnOn();
		rc.setVolume(5);
	}
	
	
	
}
