package Day12;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Day12_3 {
	
	// console ����� �޸�[����] ���α׷� ����Ǹ鼭 �����[�ʱ�ȭ]
	// console ����� �޸� -> �������� -> ����ó�� 
	public static void main(String[] args) {
	
		// ����ó��
		try { // ���� ���ܰ� ������ try �״�� ���� ���࿡ try�� ������ �߻��ϸ� catch �̵� 
			// 1. FileOutputStream : ������� Ŭ���� [ �Ϲݿ��� �߻� ( ������ó�� ) ] 
			FileOutputStream outputStream = new FileOutputStream("D:/java/�ڹ�����.txt");
			// 2. ���Ͽ� �ۼ��� ���� 												// ���ϰ��/���ϸ�.Ȯ���� 
			String �������� = "�ڹٿ��� �� ����";
			// 3. ���Ͼ��� 
			outputStream.write( ��������.getBytes() ); // ���ڿ�.getBytes() : ���ڿ� --> ����Ʈ�� ��ȯ
			// * ����ó���� ��Ʈ�� ���
			// ��Ʈ��[ stream ] : ���α׷�[�ڹ�] ------> ��Ʈ��(���) -----> �ܺ�[Ű����,����,��Ʈ��ũ ��]
			// ��Ʈ��[ ��Ŵ��� : ����Ʈ ] // bit -> byte -> kbyte -> mb -> gb
		}
		catch( Exception e ) {
			// Exception : ������ ����Ŭ���� [ ��� ���ܸ� �����Ҽ� �ִ� Ŭ���� ] 
			System.out.println(" ���� ������ ���� �߻� : "+e);
		}
		
		// ���� �Է� [ ���� ---> �ڹ� ]
		try {
			// 1. �����Է�Ŭ���� ��ü ���� 
			FileInputStream inputStream = new FileInputStream("D:/java/�ڹ�����.txt");
			// 2. �迭 ���� 
			byte[] bytes = new byte[1000]; // 1000�� ����Ʈ�� �����Ҽ� �ִ� �迭 
			// 3. ���� �о�ͼ� �迭�� ���� 
			inputStream.read( bytes );
			// 4. ����Ʈ -> ���ڿ� ��ȯ 
			System.out.println("���ϳ� ���� : " + new String(bytes) );
		}
		catch( Exception e ) {
			
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}



