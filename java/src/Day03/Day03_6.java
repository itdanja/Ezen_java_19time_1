package Day03;

import java.util.Scanner;

public class Day03_6 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print(" �⺻�� : ");		
		int �⺻�� = scanner.nextInt();
		
		System.out.print(" ���� : ");			
		int ���� = scanner.nextInt();
		
		int ���� = (int)(�⺻�� * 0.1); 
				// int * double => double => ��������ȯ
		int �Ǽ��ɾ� = �⺻�� + ���� - ����;
		System.out.println(" �Ǽ��ɾ� : " + �Ǽ��ɾ� );
	
	}
}
	// ����1 : �޿� ���� 
	/*
	 * [����] �Է¹ޱ� : �⺻�� , ���� 
	 * [���] �Ǽ��ɾ� = �⺻�� + ���� - ����[ �⺻��10% ]
	 *
	 */



