package Day06;

import java.util.Scanner;

public class Day06_1 { 
	
	public static void main(String[] args) {
		
		// 1.��� 2.����[����] 3.�Է� 4.������ 5. ���� 6.�ݺ���
		
		// �ݺ��� p. 148
			// for 
			// ���� : ��𼭺��� ������ � ����/���� �ݺ��Ҳ��� ���ϱ�  
			//    1. for( 1.�ʱⰪ ; 2.���ǹ� ; 4.������ ) {  3.���๮   } 
			// 				
		
			// 	  2. 	1.�ʱⰪ
			//			while( 2.���ǹ� ){   3.���๮; 4.������ } 
		
			// 	  3. for��ø
			//			for( int i = 1 ; i<=5 ; i++ ) {
			//					
			//				for( int j = 1; j<=5 ; j++ ) { 
			//					���๮; [ ���๮�� �� ����Ƚ�� : 5*5 = 25 ]
			//				}
			//			}
			//			i = 1�϶�	j = 1 2 3 4 5 
			//			i = 2�϶�	j = 1 2 3 4 5 
			//			 ~~~~~
			//			i = 5�϶�	j = 1 2 3 4 5 
			//						j�ݺ�Ƚ�� : 25
		
		
		
		// ����1 for,while ���� [ 1~100���� �����հ� ]
			// 1. while 
			int sum1 = 0; // �������� ������ ���հ� ���� 
			int i = 0; // 1.�ʱⰪ 
			while( i<=100 ) {	// 2. ���ǹ� 
				sum1 += i;	// 3. ���๮[ ������ true �϶� ���డ�� ]
				// �����հ� 
				i++;		// 4. i���� 1������
			}
			System.out.println("while������ ����� ���� : " + sum1 );
			
			// 2. for 
			int sum2 = 0;
			for( int j = 0 ; j<=100 ; j++ ) {
				// 1.�ʱⰪ  ; 2.���ǹ� ; 4.������
				sum2 += j; // 3.���๮
			}
			System.out.println("for������ ����� ���� : " + sum2);
			
		// ����1_p.150 [ 1���� 10���� ��� ] 
			for( int h = 1 ; h<=10 ; h++ ) {
				System.out.println( h );
			}
		// ������ 
			// 2�� [ for ] 
			for( int �� = 1 ; ��<=9 ; ��++ ) {
				// ���� 1���� 9���� 1�������ϸ鼭 �ݺ�
				System.out.println( "2 * "+��+" = " + (2*��) );
			}
			// 2~9�� [ for ��ø ] 
				// �� 2 �϶� �� 1 2 3 4 5 6 7 8 9 
				// �� 3 �϶� �� 1 2 3 4 5 6 7 8 9
				// �� ���� �� 9�� ���� = 8*9 = 72ȸ ����  
			for( int �� = 2 ; ��<=9 ; ��++ ) {
				// ���� 2���� 9���� 1�� �����ϸ鼭 �ݺ�ó��
				for( int ��2 = 1 ; ��2<=9 ; ��2++) {
					System.out.println( �� +" * "+��2+" = " + (��*��2) );
				}
			}
			// ����1 : ����ڷκ��� ���� �Է¹޾� �ش� ���� 1~20�� ������ ��� ��� 
			// 1. �Է� -> ���� -> �ݺ� -> ��� 
			Scanner scanner = new Scanner(System.in);
			System.out.print(" �� �Է� : ");
			int dan = scanner.nextInt();	// 1. �Է¹޾� �����ϱ� 
			
			System.out.print( dan+"�� �� ����մϴ�. ");
			
			for( int gob = 1 ; gob<=20 ; gob++ ) {
				System.out.println( dan +" * "+ gob +" = " + ( dan*gob )  );
						// ������ ����ó�� X [ ��ǻ�Ͱ� �˰� �ִ� ���ڴ� " " X ]
			}
	
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	}

}