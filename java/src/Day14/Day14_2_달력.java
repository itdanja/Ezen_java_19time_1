package Day14;

import java.util.Calendar;

public class Day14_2_�޷� {
	
	public static void main(String[] args) {
	
		//1.�޷� Ŭ������ ���� �޷��� ��ü ȣ��
		Calendar �޷� = Calendar.getInstance();
		//2. ���� , ��
		int year = �޷�.get( Calendar.YEAR );
		int month = �޷�.get( Calendar.MONTH )+1;
			// +1 �ϴ����� : 0->1�� 1->2��
		//3. �ش� ���� 1���� ���� ���ϱ� 
		//4. �ش� ���� ������ �� ���ϱ� 
		
		//5. ���
		System.out.println("-------"+year+"�� "+month+"�� �޷�-----------------");
		System.out.println("��\t��\tȭ\t��\t��\t��\t��");
		
		//6. �ϼ� ��� 
		for( int i = 1 ; i<=31 ; i++ ) { // 1~31�ϱ���
			
			System.out.print( i +"\t"); // �� ��� 
			
			// ����ϸ��� �ٹٲ�ó�� [ 7��� ] 
			if( i % 7 == 0 ) { System.out.println();}
			
		}
		
	}
}
