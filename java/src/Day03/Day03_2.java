package Day03;

import java.util.Scanner;

public class Day03_2 {
	
	// 1. main �޼ҵ�
	public static void main(String[] args) {
	
		// 2. �̸� �Է¹ޱ�
			// 1. �Է� ��ü ���� 
			Scanner scanner = new Scanner(System.in);
			// 2. ���
			System.out.print(" �̸� �Է� : ");
			// 3. �Է� ���� ���� ����  [ �Է°�ü�� �Էµ� ���� �̸� ��ü�� ���� ] 
			String �̸� = scanner.next();  
			
		// 3. 1~3 �Է¹ޱ� 
			System.out.print(" 1���� �⼮���� �Է� : ");	
			String ����1	= scanner.next();
			System.out.print(" 2���� �⼮���� �Է� : ");	
			String ����2 = scanner.next();
			System.out.print(" 3���� �⼮���� �Է� : ");	
			String ����3 = scanner.next();
			
		// 4. ����� ����/��ü ����ϱ� 
			System.out.println("\t\t[ �⼮�� ] ");
			System.out.println("--------------------------------------------");
			System.out.println("�̸�\t1����\t2����\t3����\t���");
			System.out.println(�̸�+"\t"+����1+"\t"+����2+"\t"+����3);
			System.out.println("--------------------------------------------");
	}
}


	// ����1 : 
	/* �л� �Ѹ��� �̸��� 1~3������ �⼮ ���θ� �Է¹޾� �Է¹��� ���� �Ʒ��� ���� ���
	* 	/*  ��°�� 
	* 				[[ �⼮�� ]]
	* --------------------------------------
	* �̸�		1����		2����		3����		���
	* ��ȣ��		�⼮			�Ἦ			�⼮
	* --------------------------------------
	*/












