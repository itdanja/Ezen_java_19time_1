package Day07;

import java.util.Arrays;
import java.util.Scanner;

public class Day07_1 {
	
	public static void main(String[] args) {
		
		// [����] : ���� => �޸𸮿� �� �ֱ� 
			// 1.���� �ϳ��� �ϳ��� �� ���尡�� [ ������ �Ұ� ] 
			// 2.������ ����� ������ ������ -> ���� ����
			// ��)�ܵ����� ( �ϳ��� ���� )
		
		// [�迭] : ���� => �������� �޸𸮸� ���� 
			// �������� ���� -> �迭 
			// 1. ���� => �ε���(��ȣ)
			// 2. ������ ������ ����(�ε�����ȣ)��� �����Ѵ�
			// 3. ����( ������ �ڷ��� ) : int , char ���ÿ� �� �迭�� ���� X 
			// ��) ����Ʈ ( ���� ���� )
				// 1. �迭 ���� : �ڷ���[] �迭�� = { ��1 , ��2, ��3 , ��4 }
				// 2. new �����ڸ� �̿��� �迭 ���� : �ڷ���[] �迭�� = new �ڷ���[ ���� ] 
					// new : �޸��Ҵ� ������
		
		// ����1_P.180 �迭
		// �迭 ���� : �ڷ���[] �迭�� = { ��1 , ��2 , ��3 , ��4 };
		int[] scores = { 89 , 90 , 87};
				//�ε���:  0  , 1  , 2 
		// ��� 
		System.out.println(" scores[0] : " + scores[0] );
			// �ε��� : �迭�� ����Ǵ� ������ȣ [ 0�� ���� ] 
		System.out.println(" scores[1] : " + scores[1] );
		System.out.println(" scores[2] : " + scores[2] );
		
		// ����
		int sum = 0;
		for( int i=0 ; i<3; i++ ) {
			// i�� 0���� 3�̸����� 1�������ϸ鼭 �ݺ�ó��
			sum += scores[i];
		}
		
		System.out.println(" ���� : " + sum );
		System.out.println(" ��� : " + (sum/3) );
		
		// ����2_184
		int[] arr1 = new int[3]; // int�� ���� 3���� �����Ҽ� �ִ� �迭
		
		// ������ �� ���� �ϱ����� ��� 
		for( int i = 0 ; i<3 ; i++ ) {
			System.out.println("arr["+i+"] : " + arr1[i] );
											// ���� ������� 0 Ȥ�� null
		}
		// �� �ε����� ���� �ֱ� 
		arr1[0] = 10; arr1[1] = 20; arr1[2] = 30;
		
		for( int i = 0 ; i<3 ; i++ ) {
			System.out.println("arr1["+i+"] : " + arr1[i] );
		}
		
		String[] arr3 = new String[3]; // String ��ü 3���� �����Ҽ� �ִ� �迭 
		
		for( int i = 0 ; i<3 ; i++ ) {
			System.out.println("arr3["+i+"] : " + arr3[i] );
		}
		
		arr3[0]="1��"; arr3[1]="2��"; arr3[2]="3��";
		
		for( int i = 0 ; i<3 ; i++ ) {
			System.out.println("arr3["+i+"] : " + arr3[i] );
		}
		
		// �迭 ���� ���ϱ� .length
		System.out.println(" �迭���� : " + arr3.length );
		System.out.println(" �迭�̸� ��� : " + arr3 ); // �޸��ּ� 
		System.out.println(" �迭 �ε��� : " + arr3[0] ); // �迭�� �ش��ε����� ��
		System.out.println(" �迭 ��� �� ��� : " + Arrays.toString(arr3) );
		
		// �迭�� �̿��� �������� ���α׷�
			// 1. �л����� �Է¹޾� �л�����ŭ �迭�Ǳ��� �Ҵ� 
			// 2. �޴�[ 1. �л��� 2.�����Է� 3.�м�( ������������ ) , ��� ] 4. ���� ]
		
		Scanner scanner = new Scanner(System.in); // �Է°�ü 
		int[] �л�������� = null; // ����� �迭�� ���̸� ������ ����
		
		while(true) {  // ���ѷ��� 
			System.out.println("1.�л��� 2.�����Է� 3.�м� 4.����");
			System.out.print("���� : "); int ���� = scanner.nextInt();
			if( ���� == 1 ) {
				System.out.print(" >> �л��� �Է� : ");
				int �л��� =  scanner.nextInt();
				�л�������� = new int[ �л��� ]; // �Է¹��� �� ��ŭ �迭�� �޸� �־��ֱ� 
				// �Է¹��� �� ��ŭ �迭�� ���� ���� => �Է¹��� ����ŭ ������ ���� 
			}else if( ���� == 2 ) {
				System.out.println(" �л��� : " + �л��������.length ); // �迭�� ���� // �迭��.length
				for( int i = 0 ; i<�л��������.length ; i++ ) {
					// i�� 0���� �迭�Ǳ���[�Է¹�����]���� 1������ �ݺ�ó��
					System.out.print( i +"��° �л� ���� �Է� : ");
					�л��������[i] = scanner.nextInt(); // i ��° �ε����� ������ �����ϱ�.
				}
			}else if( ���� == 3 ) {
				// �迭 ���� [ �������� ] 
				for( int i =0 ; i<�л��������.length ; i++) {
						// i : �񱳱��� 
					for( int j = i+1 ; j<�л��������.length ; j++ ) {
						// j : �񱳴��[ �񱳱����� ������ �� ���� ] 
						
						if( �л��������[i] < �л��������[j] ) {
							// �񱳱��� < �񱳴��   => ����[��ü]
							int temp = �л��������[i];
							�л��������[i] = �л��������[j];
							�л��������[j] = temp;
						}
					}
				}
				// ���
				int ���� = 0;
				for( int i = 0 ; i<�л��������.length ; i++ ) {
					System.out.println( i+"�� ���� : " + �л��������[i] );
					���� += �л��������[i];
				}
				System.out.println(" ���� ���� : " + ����);
				System.out.println(" ��� ���� : " + (����/�л��������.length) );
				
				
			}else if( ���� == 4 ) {
				System.out.println(" >> ���� ");
				break; // ���� ����� �ݺ��� ��ȣ Ż�� 
			}else {
			}
		} // while end 
	} // main end 
} // class end 






