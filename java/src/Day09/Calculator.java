package Day09;

public class Calculator {
	// 1. �ʵ�
	// 2. ������
	
	// 3. �޼ҵ� 
	void powerOn() {
		System.out.println("������ �մϴ�.");
	}
	// 1. void : ����Ÿ�� = ��ȯŸ��
		// ����Ÿ�� ���ٴ� �ǹ�
	// 2. powerOn : �޼ҵ� �̸�[ �ƹ��ų� ]
	// 3. (�μ�1, �μ�2) : �ܺηκ��� ���޹޴� ���� 
	// 4. {  } : {}�� �����ڵ� �ۼ� 
	
	int plus( int x , int y ) {
			// x= 5  , y = 6
		int result = x + y;
		return result;
	}
	// 1. int : ����Ÿ�� = ��ȯŸ��
		// int : �޼ҵ� �����Ŀ� �ٽ� ȣ��� ������ 
		//		������ ������ �ڷ���
		// 5. return : �޼ҵ� �����Ŀ� 
	// 2. plus : �޼ҵ� �̸�[�ƹ��ų�]
	// 3. (int x , int y ) : �ܺηκ��� x �� y ��� int�� ���� 2���� ���� �ޱ� 
	// 4. { } : �����ڵ� 
	
	double divide( int x , int y ) {
					// x =10  , y = 4
		double result = (double)x / (double)y;
		return result;
	}
	
	void powerOff() {
		System.out.println("������ ���ϴ�.");
	}
	
	
	
	

}
