package Day02;

public class Day02_3 {
	
	public static void main(String[] args) {
		
		//Ÿ�� ��ȯ [ ���� ũ�� ���� ] 
					//	-----------------> �ڵ�Ÿ�Ժ�ȯ [ �� -> ũ ]
			// byte -> short -> int -> long -> float -> double
					//	<---------------- ����Ÿ�Ժ�ȯ [ ũ -> �� ]
			// 1. �ڵ�Ÿ�Ժ�ȯ
				// ���� ���� -> ū ����
					// byte -> int 
				// ū ���� -> ���� ����   ( ���� ũ�Ⱑ �ٸ� )
					// int -> byte �Ұ� ( �޸� �ս� ) 
			// 2. ����Ÿ�Ժ�ȯ [ ��� ��쿡�� Ÿ�Ժ�ȯ ( �޸� �ս� ) ]
				// (Ÿ�Ը�)������
		
		// ����1_ p.74~75
		byte bytevalue = 10; // byte ���� ����  
		int intvalue = bytevalue; // byte ������ int������ ����
		
		int intvalue2 = 10; // int ���� ���� 
		// byte bytevalue2 = intvalue2; // int ������ byte������ ���� �Ұ�
			// ��?? : 
		// �ذ�å => ��������ȯ
		byte bytevalue2 = (byte)intvalue2;
							// int�������� byte ������ ��ȯ
		
		// ���� ����ȯ -> ���� ����
		
		
	}

}
