package Day16;

import java.util.ArrayList;
import java.util.LinkedList;

public class Day16_3 {
	
	public static void main(String[] args) {
		
		// p.564
		// LinkedList Ŭ���� 
		// 1. Arraylist Ŭ���� ��ü ���� 
		ArrayList<String> list1 = new ArrayList<>();
		// 2. LinkedList Ŭ���� ��ü ���� 
		LinkedList<String> list2 = new LinkedList<>();
		// 3. �ð� ����
		long startTime;
		long endTime;
		// 4. ó�� 
		startTime = System.nanoTime(); // ����ð��� ����ð����� ȣ�� 
								// ������ : 10��/1��
		for( int i = 0 ; i<10000 ; i++ ) {
			list1.add( 0 , i+"" );	// ����Ʈ1�� i��° ���� 
			// ������ ���ڿ��� ��ȯ�ϴ� ��� : 1. String.valueOf(����);  2.����+"" 
		}
		endTime = System.nanoTime();	// ����ð��� ����ð����� ȣ�� 
		// 5. �ɸ��� �ð� 
		System.out.println(" Arraylist �� 10000�� �����ϴ� �ɸ��� �ð� : "
		                                  +(endTime-startTime)+"ns");
		// 4. ó��
		startTime = System.nanoTime();
		for( int i = 0 ; i<10000 ; i++ ) {
			list2.add( 0 , i+""); // ����Ʈ2�� i��° ���� 
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList �� 10000�� �����ϴ� �ɸ��� �ð� : "
										+(endTime-startTime)+"ns");
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}






