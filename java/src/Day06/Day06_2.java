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
		
		for( int i = 1 ; i<=s3 ; i++ ) { // for1 : �ټ� �ݺ�ó�� �ݺ��� 
			// ����� 
			for( int s = 1 ; s<= i ; s++ ) {	// for2 : �ٸ��� �ݺ�ó�� �ݺ���
				// s�� 1���� ���� �ٱ���  1�� ���� 
				System.out.print("*");
			}
			// �ٹٲ� 
			System.out.println("");
		}
		
		System.out.println("\n---------------------\n");
		
		// 4. 
		System.out.print(" ����4 �ټ� : "); int s4 = scanner.nextInt();
		
		for( int i = 1 ; i<=s4; i++ ) {
			
			//����� 
			for( int s = 1 ; s<=s4-i+1 ; s++ ) {
				System.out.print("*");
			}
			// �ٹٲ�
			System.out.println();
		}
		
		System.out.println("\n---------------------\n");
		
		// 5. 
		System.out.print(" ����5 �ټ� : "); int s5 = scanner.nextInt();
		for( int i = 1 ; i<=s5; i++ ) {
			
			// ������� 
			for( int b = 1 ; b<=s5-i ; b++ ) {
				System.out.print(" "); // �����̽� 1�� => ����
			}
			// ����� 
			for( int s = 1 ; s<=i ; s++ ) { System.out.print("*"); 
			}
			// �ٹٲ�
			System.out.println( );
		}
		
		System.out.println("\n---------------------\n");
		
		// 6. 
		System.out.print(" ����6 �ټ� : "); int s6 = scanner.nextInt();
		
		for( int i = 1 ; i<=s6 ; i++ ) {
			
			// ������� 
			for( int b = 1 ; b<=i-1 ; b++ ) { 
				System.out.print(" ");
			}
			// ����� 
			for( int s = 1 ; s<=s6-i+1 ; s++ ) {
				System.out.print("*");
			}
			// �ٹٲ�
			System.out.println();
			
		}
		
		System.out.println("\n---------------------\n");
		
		// 7. 
		System.out.print(" ����7 �ټ� : "); int s7 = scanner.nextInt();
		for( int i = 1 ; i<=s7 ; i++ ) {
			// �������
			for( int b = 1 ; b<=s7-i ; b++ ) {
				System.out.print(" ");
			}
			// ����� 
			for( int s = 1 ; s<= i*2-1 ; s++) {
				System.out.print("*");
			}
			// �ٹٲ�
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
