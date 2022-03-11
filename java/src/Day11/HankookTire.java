package Day11;

public class HankookTire extends Tire {

	// �ʵ�
	// ������
	public HankookTire( String location , int maxRotation) {
		super(location, maxRotation); //�θ������ ȣ��
	}
	// �޼ҵ� 
		// ctrl+�����̹� -> �������̵� �޼ҵ�
		// Override : �θ�Ŭ������ �޼ҵ� ������[�ٽ� �ۼ�]
		// �θ�Ŭ�������� �������� �޼ҵ带 �ٽ� ����
	
	@Override // �θ�Ŭ������ �̹������ϴ� �޼ҵ带 �ٽ� ����
	public boolean roll() {
		++accumulatedRotation; // ����ȸ���� : ����ȸ������ +1 ����
		if( accumulatedRotation < maxRotation ) { // ���࿡ ����ȸ�������� �ִ�ȸ�����ɼ��� �� ũ�� 
			// ������ �������� 
			System.out.println(location+" �ѱ�Ÿ�̾� ���� : " + ( maxRotation-accumulatedRotation)+"ȸ" );
			return true; // ���� ���� 
		}else { // ������ �������� ������ [ ����ȸ������ �ִ�ȸ�����ɼ� �� ũ�ų� ������ ] ��ũ
			System.out.println("*** "+location+" �ѱ�Ÿ�̾� ��ũ ***");
			return false; // ���� ���� 
		}
	}
	
	
	
}
