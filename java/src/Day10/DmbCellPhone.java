package Day10;

public class DmbCellPhone extends CellPhone {
					// extends : �����ϴ�..[ ��� ] // �ڵ���Ŭ������ DMB�ڵ������� ��� �ֱ�
	// 1.�ʵ�
	int channel;
	// 2.������
	DmbCellPhone( String model , String color , int channel) {
		this.model = model;
		this.color = color;
		// ��,���� �ʵ� : ���� Ŭ������ ���� �ʵ�
		// ���(extends)�� ������ �ڽ�Ŭ�������� �θ�Ŭ������ ��� ��밡��
		this.channel = channel;
	}
	// 3.�޼ҵ� 
	void turnOnDmb() {
		System.out.println("ä�� : " + channel+"�� DMB ��� ������ �����մϴ�.");
	}
	
	void changeChannelDmb( int channel ) {
		this.channel  = channel;
		System.out.println("ä�� : " + channel+"������ �ٲ�ϴ�.");
	}
	void turnOffDmb() {
		System.out.println("DMB ��� ���� ����ϴ�.");
	}
	

}
