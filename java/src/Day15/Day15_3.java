package Day15;

public class Day15_3 {

	public static void main(String[] args) {
		
		//p.533 ����ȭ
			// �̱۽����� ����ϸ� ȥ�ڼ� �޼ҵ� ������
			// ��Ƽ������ ����ϸ� �ٰ��� �޼ҵ� ���
			// ��Ƽ������ ���� ������!!!! 
				// ������ ��ü�� 1���� �޼ҵ带 ���ÿ� 2���̻� �����尡 ȣ��������
				// �޸� 1�� �̱⶧���� �޸��浹
			// �����ذ�[!] 
				// ������ ��ü�� 1���� �޼ҵ带 ���ÿ� 2���̻� �����尡 ȣ��� 1���� �����尡 ��� ������
				//	** �������� �����尡 ������ �޼ҵ� ȣ��� [ �ϳ��� �����尡 ����Ҽ� �ֵ��� ������ ������ ������ ����� ]
				//	������1 ------> �޼ҵ�1����ȣ�� -----> �޼ҵ�1��� ----> �޼ҵ�1������� 
				//	������2 ------> �޼ҵ�1����ȣ�� ----->   �����   ---->   �޼ҵ�1���  ---> �޼ҵ�1�������  
				//  ������3 ------> �޼ҵ�1����ȣ�� ----->   �����   ---->   �����      ----> �޼ҵ�1 ��� 
		
		// p.534 ����ȭ ������� 
		
		//1. ���� ��ü ���� 
		���� ���� = new ����();
		
		//2. ����1 ��ü ����
		����1 user1 = new ����1();
		//3. ����1 ���� ���� ��ü�� �����ϱ�
		user1.set����(����);
		//4. ����1 ��Ƽ������ ����
		user1.start();
		
		//5. ����2 ��ü ����
		����2 user2 = new ����2();
		user2.set����(����);
		user2.start();
		
	}
	
}












