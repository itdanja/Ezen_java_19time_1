package Day06;

import java.util.Scanner;

public class Day06_2 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		// �����
		// 1. �Է¹��� ������ŭ �� ��� 
		System.out.print(" ����1 �� ���� : ");	int s1 = scanner.nextInt();
		for( int i = 1 ; i<=s1 ; i++ ) {
			// i�� 1���� �Է¹��� �������� i�� 1������ 
			System.out.print("*"); // �ٹٲ�x 
		}
		
		System.out.println("\n---------------------\n");
		
		// 2. �Է¹��� ������ŭ �� ��� // ���� : 5������(5���) �ٹٲ� [ ��%�� == 0 ] 
		System.out.print(" ����2 �� ���� : "); int s2 = scanner.nextInt();
		for( int i = 1 ; i <=s2 ; i++) {
			System.out.print("*");
			// ���� => if
			if( i % 5 == 0  ) System.out.println();
			// i�� 5�� ������� �ٹٲ�ó�� 
		}

		System.out.println("\n---------------------\n");
		
		// 3. �Է¹��� �� ��ŭ ��� // 1. �� �ݺ��� 2. �� �ݺ��� 
		System.out.print(" ����3 �ټ� : "); int s3 = scanner.nextInt();
		for( int i = 1 ; i<=s3 ; i++ ) {
			System.out.println("�ٹٲ�");
		}
		
		
		
	}

}
