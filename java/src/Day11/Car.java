package Day11;

public class Car {
	
	// �ʵ�
	Tire frontLefTire = new Tire("�տ���",6); // ����:6
	Tire frontRightTire = new Tire("�տ�����", 2);// ����:2
	Tire backLeftTire = new Tire("�ڿ���", 3); //����:3
	Tire backRightTire = new Tire("�ڿ�����", 4);// ����:4
	// ������
	// �޼ҵ�
	int run() { // �ڵ��� �޸��� 
		System.out.println("�ڵ����� �޸��ϴ�.");
		if( frontLefTire.roll() == false ) 	{stop(); return 1;}
		if( frontRightTire.roll()==false) 	{stop(); return 2;}
		if( backLeftTire.roll() == false ) 	{stop(); return 3;}
		if( backRightTire.roll() == false ) {stop(); return 4;}
		return 0;
	}
	
	// �޼ҵ� 
	void stop() {
		System.out.println("[�ڵ����� ����ϴ�.]");
	}
	

}
