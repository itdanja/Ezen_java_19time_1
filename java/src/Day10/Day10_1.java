package Day10;

public class Day10_1 {
	
	public static void main(String[] args) {
		
		// p.310 ��� 
			// 1. ��� : �θ� �ڽĿ��� �����ִ� ���� 
			// �θ� Ŭ���� = ���� Ŭ���� 
			// �ڽ� Ŭ���� = ���� Ŭ���� 
			// �θ�Ŭ������ ����� �ڽ� Ŭ�������� �����ִ� ����
			// 2. ���� : �̹� �� ���ߵ� Ŭ������ �����ؼ� ���ο� Ŭ���� 
			// *�ߺ��Ǵ� �ڵ带 �ٿ��ش�.
			// 3. ���� : �θ�->�ڽ� ����    // ���α׷� : �ڽ�->�θ� ���� 
			// 4.���� : �ڽ�[����]Ŭ���� extends �θ�[����]Ŭ���� 
			// 5.Ȱ��
				// �ڽ�Ŭ������ü.�θ��� ���ٰ��� 
		
		// p311~p313 ����
		
		// 1. �ڽ�Ŭ������ ��ü ���� 
		DmbCellPhone dmbCellPhone = new DmbCellPhone("�ڹ���", "����", 10);
		
		// 2. �ڽ�Ŭ���� ��ü�� �θ�Ŭ������ �ʵ� ȣ�� 
		System.out.println(" �� : " + dmbCellPhone.model );
		System.out.println(" ���� : " + dmbCellPhone.color );
			// * �ڽ�Ŭ������ ��ü ������ �ش� ��ü�� �θ�Ŭ������ ����� ��밡�� 
		// 3. �ڽ�Ŭ���� ��ü�� ����Ŭ������ �ʵ� ȣ�� 
		System.out.println(" ä�� : "+dmbCellPhone.channel );
		
		// 4. �ڽ�Ŭ���� ��ü�� �θ�Ŭ������ �޼ҵ� ȣ�� 
		dmbCellPhone.powerOn(); // �θ�Ŭ���� �޼ҵ� ������ ��ӹ޾ұ⶧���� ����
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("��������~");
		dmbCellPhone.receiveVoice("�ȳ��ϼ���! ���� ȫ�浿�ε���.");
		dmbCellPhone.sendVoice("��~ �� �ݰ����ϴ�.");
		dmbCellPhone.hangUp();
		
		// 5. �ڽ�Ŭ���� ��ü�� ����Ŭ������ �޼ҵ� ȣ�� 
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();
	}
}









