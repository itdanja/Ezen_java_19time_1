package Day11;

public class Day11_3 {
	
	public static void main(String[] args) {
	
		// p.370 �������̽� 
			// ������[ ��ư ] �ڵ���[ ��ư ] Ű����ũ[ ��ư ]
			// �����ڵ�� ��ü�� ���� ����ϴ� ��������
			// 
		RemoteControl rc; // �������̽� ��ü
		// �������̽��� ��ü��;
		rc = new Television(); // �ش� �������̽��� �ڷ����� Ŭ���� �޸��Ҵ�
		rc = new Audio(); // �ش� �������̽��� ����� Ŭ���� �޸��Ҵ� 
		// �������̽��� �������� Ŭ�����κ��� �޸��Ҵ� ���� 
		
		// Ŭ������ �̿��� ��ü ���� 
		SmartTelevision tv = new SmartTelevision();
		
		RemoteControl rc2 = tv; // �������̽���ü�� Ŭ������ü ���� 
		Searchable searchable = tv; // �������̽���ü�� Ŭ�������� ���� 
		
		
		
	}
}
