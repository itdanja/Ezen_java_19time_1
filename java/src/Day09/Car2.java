package Day09;

public class Car2 {
	
	// 1. �ʵ�
	int gas;
	// 2. ������
		// [x]
	// 3. �޼ҵ�
	// ( void : return ���� ] )
	void setGas( int gas ) {
				// gas = 5
		this.gas = gas;
		// this.���κ��� = �ܺκ���
	}
	// �޼ҵ�
	// ( boolean : return ���� false �ƴϸ� true )
	boolean isLeftGas() {
		if( gas == 0 ) {
			System.out.println("gas�� �����ϴ�.");
			return false; // �޼ҵ� ����� false ����
		}
		System.out.println("gas�� �ֽ��ϴ�.");
		return true; // �޼ҵ� ����� true ���� 
	}
	// �޼ҵ� [ �μ�x ��ȯx ]
	void run() {
		while(true) { // ���ѷ��� [ �������� : gas 0 �̸� ] 
			if( gas > 0 ) { // ���࿡ gas�� 0���� ũ��
				System.out.println("�޸��ϴ�.(gas�ܷ�:"+gas+")");
				gas -= 1; // ���� ���� 
			}else { // ���࿡ gas�� 0�̸� 
				System.out.println("����ϴ�.(gas�ܷ�:"+gas+")");
				return; // �޼ҵ� ���� ��ȯ�� ����.
				// �޼ҵ� ����� �޼ҵ� �ȿ� �ִ� �ڵ� ����[ ���ѷ��� ����]
			}
		}
	}
	
	

	
	
	
	
	
}
