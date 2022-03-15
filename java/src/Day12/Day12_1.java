package Day12;

public class Day12_1 {
	
	public static void main(String[] args) {

		// p.444 : ����ó�� 
			// ���� : ��������� Ȥ�� ������ �� ���α׷� ���� �߻� 
			// ���� : ���α׷� ���� �߻��� ���α׷� ���� �Ǳ⶧���� ����������
			// �ذ�å : �����߻� �ϴ��� ���α׷� ������� 
			// ��� : try{ } catch( ����Ŭ���� ��ü�� ){}
			// ���� : 1.�Ϲݿ��� 2.���࿹��
				//     �Ϲݿ��ܰ˻� --> ������[����] --> ���࿹�ܰ˻�
				//	�Ϲݿ��� : ������ �߻� ���ɼ� ���� �ڵ� -> �����ڿ��� ���������� ����ó��
				//  ���࿹�� : ���๮���� ������ ���ÿ� ����ġ ���� ���� -> �����ڰ� �Ǵ� ����ó�� 
		// p.446 
		try {  // ���ܰ� �߻��Ұ� ���� �ڵ�  [ ���� ���ܹ߻�O -> catch / ���ܹ߻�x -> try{}�ڵ� ��ν���
			String data = null; // ���ڿ��� null ���� 
			System.out.println( data.toString() ); // null ���� ���
			// NullPointerException ���� �߻����� : null ������ ���⶧���� ��� �Ұ���
		} catch( NullPointerException ��ü�� ) { // ���࿡ �����̸�
			//  ����Ŭ������[ ����ó���� Ŭ������] 
			System.out.println(" ���� �߻� ���� : "+ ��ü��);
		}
		
		// p.447
		try { // ���ܰ� �߻��ϸ� catch�� �̵� �ƴϸ� try{} ���� 
			String data1 = args[0];
			String data2 = args[1];
			System.out.println("args[0] : " + data1 );
			System.out.println("args[1] : " + data2 );
				// ArrayIndexOutOfBoundsException ���� �߻����� : �ε����� ���⶧���� 
		}catch( Exception e  ) {
			System.out.println(" ���� �߻� ���� : " +  e );
		}
		
		// p.449
		try { // ���࿡ ����[����]�� ������ catch�� �̵� // �ƴϸ� try{} ���� 
			String data1 = "100";
			String data2 = "a100";
			int value1 = Integer.parseInt(data1); // Integer.parseInt( ���ڿ� ) : ���ڿ� -> ���ڿ� ��ȯ
			int value2 = Integer.parseInt(data2); // a100 -> ���ڿ� ��ȯ �Ұ��� // ���ܹ߻�
			// ���� �߻� ���� :  "100" ���ڿ��� ���ڿ��� ��ȯ�� ���� ������ "a100"���ڿ��� ���ڿ��� ��ȯ�� �Ұ��� 
			int result = value1 + value2;
			System.out.println( data1 +"+"+data2+"="+result);
		}
		catch( NumberFormatException e ) {
			System.out.println(" ���� �߻� ���� : " + e) ;
		}
		
		// p.453
		
	}
}







