package Day03;

import java.io.IOException;
import java.util.Scanner;

public class Day03_1 { // c s 

	public static void main(String[] args) throws Exception{ // m s 
										// ����ó��(����ó��) : �Է½� �����߻��ϱ� ������ 
		// �Է� 
			// 1. System.in.read() : Ű����� ���� �ϳ��� ���� �Է¹ޱ�
		// ��1_p.93
		int keycode; // int��[4����Ʈ ��ŭ ����] ���� ����
		
		keycode = System.in.read(); // ���� �߻�!!!
			// = : ���Կ����� [ �����ʰ��� ���ʿ� ���� ] 
				// System.in : �Է�	<----> System.out : ���
					// read() : Ű���� �Է°� �б� �޼ҵ� 
		System.out.println("keyCode : " + keycode );
		
		keycode = System.in.read();
		System.out.println("keycode : " + keycode );
		
		keycode = System.in.read();
		System.out.println("keycode : " + keycode );
		
		// ��2_p96
		Scanner scanner = new Scanner( System.in );
									  // Ű�����Է�
			// ��ü = Ű�����Է°� 
		String inputdata;	// ���ڿ�[ ���� ������ ]  ��ü
		char c ; // ����[ ���� 1��] ���� 
		
		inputdata = scanner.next();
		System.out.println("scanner : " + inputdata );
		
		
		
	} // m e 
	
} // c e 
