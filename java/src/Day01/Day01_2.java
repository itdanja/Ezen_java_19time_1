package Day01;	// ��Ű���̸�

import java.util.Scanner;

// ��Ʈ : 0 Ȥ�� 1   1bit
	// ����Ʈ : 8��Ʈ -> 1byte
		// 01010101
	// ų�ι���Ʈ : 1024����Ʈ -> 1kbyte

public class Day01_2 { // c s

	// { } �ȿ� ������ tab �鿩����
	public static void main(String[] args) {
		// main + ��Ʈ�� + �����̹� 
			// main �޼ҵ� [ �ʼ� : main ������ ]
		
		//1.����ϱ� [ Syso ] 
		System.out.println("�Է� : ");
		//2.�Է¹ޱ� 
			// 1. Ű����[ a -> ����Ʈ(11000011) ���� ] -> 
		Scanner scan = new Scanner(System.in);
		// ��ü�����ϴ� ��� : Ŭ������ ��ü�� = new ������( �μ� )
			// System.in : �Է� [ Ű���� ] 
				// Scanner Ŭ���� [ Ű����� ���� �Է°��� ���� ]
					// Ű���� --�Է°�--> Scanner scan ����
		String s = scan.next();
			// scan.next() : �Էµ� ���� ��������
				// s ��� ������ ����
		System.out.println( "�Է��� ���� : " + s); // s ���� ��� 
	}
} // c e














