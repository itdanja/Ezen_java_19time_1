package Day10;

public class CellPhone { // �ڵ��� ���赵
	// Ŭ������ ���[����]
	// 1. �ʵ� : �����Ͱ� ����Ǵ� �� 
	String model;
	String color;
	// 2. ������ : ��ü������ �ʱ�ȭ[�ʱⰪ]
	
	// 3. �޼ҵ� : ���� , �ൿ 	
	void powerOn() { System.out.println("������ �մϴ�."); } // 1. �μ�x��ȯx
	void powerOff() {System.out.println("������ ���ϴ�."); } // 2. �μ�x��ȯx
	void bell() {System.out.println("���� �︳�ϴ�.");} 	// 3. �μ�x��ȯx
	void sendVoice(String message) {System.out.println("�ڱ� : "+message);} 		// 4. �μ�o��ȯx
	void receiveVoice(String message) {System.out.println("���� : "+message);}	// 5. �μ�o��ȯx
	void hangUp() 	{System.out.println("��ȭ�� �����ϴ�.");} // 6.�μ�x��ȯx
	
	
	
	
}
