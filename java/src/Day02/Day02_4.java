package Day02;

public class Day02_4 {
	
	public static void main(String[] args) {
		
		// p.89
		// ����� ���� 
		//   Ű���� ---system.in---->  ��ǻ�� ---system.out---> �����
		System.out.println();
		
		// ���
			// 1. System.out.println( )	: ����� �ٹٲ�
			// 2. System.out.print( ) : ��¸�
			// 3. System.out.printf( ) : f(format)���� ���
		
		int value = 123;
		System.out.println("����� �ٹٲ� : " + value);
		System.out.println("---------------------");
		
		System.out.print("����� �ٹٲ�ó��x");
		System.out.print("----------------------");
		System.out.print("print������ \\n���� �ٹٲ�ó�� ���� \n");
		System.out.println("---------------------");
		
		// ����[ format ���� ] 
			// 1. %d : ����	
				// %����d	: ���ڸ�ŭ �ڸ� ���� [ �ش� �ڸ��� ���ڰ� ������ ����ó�� ] 
				// %-����d	: ��������
				// %0����d	: ���ڸ�ŭ �ڸ� ���� [ �ش� �ڸ��� ���ڰ� ������ 0 ���� ä�� ]
			// 2. %f : �Ǽ� 
				// %.����f		: ���ڸ�ŭ �Ҽ��� ǥ��
				// %����1.����2f	: ����1��ŭ ���� ǥ�� . ����2��ŭ �Ǽ� ǥ�� 
				// %-����f	
				// %0����f
			// 3. $s : ���ڿ� 
		
		System.out.printf(" ��ǰ�� ����: %d�� \n" , value );
		System.out.printf(" ��ǰ�� ����: %6d�� \n" , value);
		System.out.printf(" ��ǰ�� ����: %-6d�� \n" , value);
		System.out.printf(" ��ǰ�� ����: %06d�� \n" , value);
		
		System.out.printf(" ��ǰ�� ����: %.1f�� \n" , 10.55 );	// 
		System.out.printf(" ��ǰ�� ����: %10.1f�� \n" , 10.55 );	// 
		System.out.printf(" ��ǰ�� ����: %-10.1f�� \n" , 10.55 );	//
		System.out.printf(" ��ǰ�� ����: %010.1f�� \n" , 10.55 );	//
		
		System.out.printf(" ��ǰ�� ����: %s \n" , "10��");
		
		// �Ǵ� 
		System.out.println("��ǰ�� ���� : "+value+"��");
		System.out.printf("��ǰ�� ���� : %d��\n" , value);
		
		// ����1 ���� 
	
		
	}

}








