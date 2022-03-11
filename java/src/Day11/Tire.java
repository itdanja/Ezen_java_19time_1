package Day11;

public class Tire { // Ÿ�̾� Ŭ���� // �θ�Ŭ����[����Ŭ����]
	// 1.�ʵ�
	public int maxRotation; // �ִ� ȸ�����ɼ�[����]
	public int accumulatedRotation; // ����ȸ����
	public String location; // Ÿ�̾��� ��ġ
	// 2.������
	public Tire(String location ,  int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	// 3.�޼ҵ� 
	public boolean roll() { // ȸ���޼ҵ� 
		++accumulatedRotation; // ����ȸ���� : ����ȸ������ +1 ����
		if( accumulatedRotation < maxRotation ) { // ���࿡ ����ȸ�������� �ִ�ȸ�����ɼ��� �� ũ�� 
			// ������ �������� 
			System.out.println(location+" Tire ���� : " + ( maxRotation-accumulatedRotation)+"ȸ" );
			return true; // ���� ���� 
		}else { // ������ �������� ������ [ ����ȸ������ �ִ�ȸ�����ɼ� �� ũ�ų� ������ ] ��ũ
			System.out.println("*** "+location+" Tire ��ũ ***");
			return false; // ���� ���� 
		}
	}
}





