package Day11;

public class KumhoTire extends Tire {
					// Tire Ŭ�����κ��� ��ӹޱ� 
	// �ʵ�
	// ������
	public KumhoTire(String location , int maxRotation) {
		super(location, maxRotation); // �θ�Ŭ������ ������ȣ��
	}
	
	// �޼ҵ�
		// override : �������̵� [ �θ�Ŭ������ �޼ҵ� ������ ]
	@Override
	public boolean roll() {
		++accumulatedRotation; // ����ȸ���� : ����ȸ������ +1 ����
		if( accumulatedRotation < maxRotation ) { // ���࿡ ����ȸ�������� �ִ�ȸ�����ɼ��� �� ũ�� 
			// ������ �������� 
			System.out.println(location+" ��ȣŸ�̾� ���� : " + ( maxRotation-accumulatedRotation)+"ȸ" );
			return true; // ���� ���� 
		}else { // ������ �������� ������ [ ����ȸ������ �ִ�ȸ�����ɼ� �� ũ�ų� ������ ] ��ũ
			System.out.println("*** "+location+" ��ȣŸ�̾� ��ũ ***");
			return false; // ���� ���� 
		}
	}
	

}
