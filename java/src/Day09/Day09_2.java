package Day09;

public class Day09_2 {
	public static void main(String[] args) {
		
		// p.236~237 �����ڵ�2
		// �����ڷκ��� �ʵ� �ʱ�ȭ
		
		// 1. �μ�0�� �����ϴ� �����ڷ� ��ü ����
		Korean k1 = new Korean();
			// k1�� ����o�̸�x�ֹε��x
		System.out.println(" k1 ���� : " + k1.nation);
		System.out.println(" k1 �̸� : " + k1.name );
		System.out.println(" k1 �ֹε�Ϲ�ȣ : " + k1.ssn );
		
		// 2. �μ�2�� �����ϴ� �����ڷ� ��ü ���� 
		Korean k2 = new Korean("���ڹ�","123456-123456");
			// k2�� ����o�̸�o�ֹε��o 
					// �̸��� �ֹε�Ϲ�ȣ�� �����ڷκ��� �μ��� ���� 
		System.out.println(" k2 ���� : " + k2.nation );
		System.out.println(" k2 �̸� : " + k2.name);
		System.out.println(" k2 �ֹε�Ϲ�ȣ : " + k2.ssn );
		
		// 3. �μ�3�� �����ϴ� �����ڷ� ��ü ���� 
		Korean k3 = new Korean("�Ϻ�","���ڹ�","123456-123456");
		
		System.out.println(" k3 ���� : "+k3.nation);
		System.out.println(" k3 �̸� : "+k3.name );
		System.out.println(" k3 �ֹε�Ϲ�ȣ : "+k3.ssn);
		
		
		
		
		
		
		
		
		
		
		
	}
}
