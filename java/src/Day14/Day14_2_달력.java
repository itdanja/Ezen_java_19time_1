package Day14;

import java.util.Calendar;
import java.util.Scanner;

public class Day14_2_�޷� {
	
	public static void main(String[] args) {
		
		�޷º���(); //�޷¸޼ҵ� ȣ�� 
		
	} // main end 
	
	public static void �޷º���() { // �޷¸޼ҵ� start
		
		Scanner scanner = new Scanner(System.in); // �Է°�ü 
		
		//1.�޷� Ŭ������ ���� �޷��� ��ü ȣ��
		Calendar �޷� = Calendar.getInstance();
		//2. ���� , ��
		int year = �޷�.get( Calendar.YEAR );
		int month = �޷�.get( Calendar.MONTH )+1; // +1 �ϴ����� : 0->1�� 1->2��
		
		while( true ) { // ���ѷ��� [ �������� : 4 �Է½� ���� ] 
	
			//3. �ش� ���� 1���� ���� ���ϱ�
				// 1. �ش� ���� / ���� ��¥�� ����
				�޷�.set(year, month-1, 1 ); // 2022��3��1�� -> 3[ȭ����]
			int swday = �޷�.get( Calendar.DAY_OF_WEEK );
			//4. �ش� ���� ������ �� ���ϱ� 
			int eday = �޷�.getActualMaximum( Calendar.DAY_OF_MONTH); // .getActualMaximum( Calendar.DAY_OF_MONTH) : ���������� �ش� ���� ������ �ϼ�
		
			
			//5. ���
			System.out.println("---------------------"+year+"�� "+month+"�� �޷�------------------");
			System.out.println("��\t��\tȭ\t��\t��\t��\t��");
			
			//* �ش� ���� 1�� ������� ���� ä��� 
				// ���࿡ 1���� ȭ�����̸� ��(��) ��(��) 
				// ���࿡ 1���� ������̸� ��(��) ��(��) ȭ(��) ��(��) 
			for( int i = 1 ; i<swday ; i++ ) {
				// i�� 1���� �ش� ���� 1���� ���������� 
				System.out.print(" \t");
			}
			
			//6. �ϼ� ��� 
			for( int i = 1 ; i<=eday ; i++ ) { // 1�� ~ ���� ���� ������ �ϱ���
				
				System.out.print( i +"\t"); // �� ��� 
				
				// ����ϸ��� �ٹٲ�ó�� [ 7��� ] 
				if( swday % 7 == 0 ) { System.out.println();}
					// i �������� 7����� �ϸ� 1~7 �ٹٲ�
					// * swday���� ���� �������� 7(�����) �̸� �ٹٲ� *
				swday++; // ���� ���� 
			}
			
			// 7. �޴� ����� 
			System.out.print("\n\n �޴� : 1.������(��) 2.������(��) 3.�˻� 4.���� : ");
			int ch = scanner.nextInt();
			if( ch == 1 ) {}
			else if( ch == 2 ) {}
			else if( ch == 3 ) {
				// *�߰� [ �Է¹޾Ƽ� ��� ]
				System.out.print(" �˻��� ���� : "); 	year = scanner.nextInt();
				System.out.print(" �˻��� �� : "); 	month = scanner.nextInt();
			}
			else if( ch == 4 ) { System.err.println(" \n\n\t\t*** �޷����α׷� ���� *** "); break; }
			else { System.err.println("�˸�]] �˼����� ��ȣ�Դϴ�. ");}
			
			
		} // while end
	} // �޷¸޼ҵ� end 
} // class end 








