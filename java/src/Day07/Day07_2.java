package Day07;

import java.util.Random;
import java.util.Scanner;

public class Day07_2 {
	
	/*
	 * 
	 * �ζ� �Ǻ��� ���α׷�
		1. ����� 6 �� ���� �Է¹޾� �迭�� ���� 
			1. 1~45 ���̸� �Է¹ޱ� [ �׿� �Է½� ���Է� ]
			1. �ߺ� �Ұ� [ �ߺ� �Է½� ���Է� ]
		2. ��÷��ȣ : ��ǻ�� 6�� ���� ���� �����ؼ� �迭������ 
			1. �ߺ� �Ұ� 
		3. ����ڰ� �Է��� ���� ��÷��ȣ�� ������ ���� üũ 
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		
		// ���� [ �������� ����� ���� ���� ] 
		int[] number = new int[6]; // int�� 6�� ������ ���� �� �� �ִ� �迭����
		int[] random = new int[6];
		Scanner scanner = new Scanner(System.in); // �Է°�ü 
		
		// 1. ����ڿ��� 6���� ���� �Է¹޾� �迭�� ����.
		System.out.println("----------- �����Ͻ� ��ȣ�� ���� --------------");
		for( int i = 0 ; i<6; i++ ) {
			// i�� 0 ���� 6 �̸����� 1�������ϸ鼭 �ݺ�ó��
			System.out.print( (i+1) + "��° ��ȣ[1~45] �Է� : "); // ��� 
			int num = scanner.nextInt(); // �Է�->���� 
			
			boolean ��� = true; // ����[true] or ���Է�[false]
			// �� �Է��� �޾ƾ� �ϴ� ���
				// 1. 1~45 �� �ƴ� ��� 
				if( num < 1 || num > 45 ) {
					// �Է¹��� ���� 1���� �۰ų� 45���� ũ�� 
					System.out.println(">>���Է�:[ 1~45���̸� �Է����ּ��� ]");
					��� = false;
					i--; // ���Է½ÿ��� ���� ����[i] ����
				}
				// 2. �Է¹��� ���� ���� �迭�� �����ϸ�
				for( int j = 0 ; j<number.length ; j++) {
					if( num == number[j] ) {
						//�Է°� �� �迭�� j��° ���� �����ϸ�
						System.out.println(">>���Է�:[ �̹� �Է��� �� �Դϴ� ]");
						��� = false;
						i--; // ���Է½ÿ��� ���� ���� ���� 
						break; // ���� ����� for�� ���� 
					}
				}
			// ����� true �� ��쿡�� �迭�� ���� 
			if( ��� == true ) number[i] = num; // �Է�->����-> i��° �ε��� �� ���� 
		}
		
		// 1-1. Ȯ�� 
		System.out.println("---------- ���� ������ ��ȣ ��� ---------");
		for( int i = 0 ; i<number.length ; i++ ) {
			System.out.println( (i+1) +" ��° ��ȣ : " + number[i] );
		}
		
		// 2. ��ǻ�Ͱ� 6���� ���� �������� �ؼ� �迭�� ����.
		System.out.println("----------- ��÷ ��ȣ ���� ��� ----------");
		for( int i = 0 ; i<random.length; i++) { //  1�� for 
			Random ran = new Random();	// ���� ��ü 
			// random[i] = ran.nextInt(45); // 0 ~ 44 ���� ���� ���� 
			int randomnum = ran.nextInt(45)+1;	// 1 ~ 45 ���� ���� ���� 
			
			boolean ��� = true;
			for( int j = 0 ; j<random.length; j++ ) { // 2�� for 
				if( randomnum == random[j] ) {
					// ���ο� ���� == j���� ������ ������
					i--;
					��� = false;
					break; // break �������� ���� ����� �ݺ��� {} Ż��
				}
			}
			if( ��� ) random[i] = randomnum;
		}
		
		// 2-1 Ȯ�� 
		for( int i = 0 ; i<random.length; i++ ) {
			System.out.println( (i+1) + " ��° ��÷��ȣ : "+ random[i]);
		}
		
		// 3. �� �迭�� ���ؼ� ������ �� ���� üũ.
		int ��÷��ȣ�� = 0;
		for( int i = 0 ; i<number.length ; i++) {
			// i : �񱳱���
			for( int j = 0 ; j<random.length ; j++) {
				// j : �񱳴��
				if( number[i] == random[j] ) {
					// �񱳱��� �� �񱳴���� �����ϸ� 
					��÷��ȣ��++; // ��÷��ȣ�� �� 1 ���� 
				}
			}
		}
		// 4. ��� 
		System.out.println(" ---------------- ��÷ ��� -------------");
		System.out.println(" �� ��÷�� ��ȣ ���� : " + ��÷��ȣ�� );
		
	} // main end 
} // class end 






