package Day16;

import java.util.HashSet;
import java.util.Iterator;

public class Day16_4 {
	
	public static void main(String[] args) {
		
		// p.565
		// set�÷��� : �������[�ε���]X , �ߺ�X
		// p.568
		// 1. HashSet Ŭ���� set��ü ����  
		HashSet<String> set = new HashSet<>();
		// 2. set��ü �߰�  [ .add( ��ü�� ) : set��ü�� �߰� ] 
		set.add("java");		System.out.println("Ȯ�� : "+set );
		set.add("JDBC");		System.out.println("Ȯ�� : "+set );
		set.add("Servlet/JSP");	System.out.println("Ȯ�� : "+set );
		// *�̹� �ڹٶ�� ���ڿ��� �����ϱ� ������ set��ü �ߺ� ���X
		set.add("java");		System.out.println("Ȯ�� : "+set );
		set.add("iBATIS");		System.out.println("Ȯ�� : "+set );
		// 3. size() : set��ü�� ��ü�� 
		int size = set.size();	System.out.println("�� ��ü��: "+ size );
		// 4. ȣ��
		Iterator<String> iterator = set.iterator();
	// Iterator : ��ȸ �������̽� [ ������ ���� �׸���� ������� ��ȸ ]
		while( iterator.hasNext() ) { // 1. hasNext() : ���� �׸��� �ִ��� ���� �Ǵ� 
			String element = iterator.next(); // 2. next() : ���� �׸��� ȣ�� 
			System.out.println("\t" + element );
		}
		// 5.
		set.remove("JDBC");
		set.remove("iBATIS");
		System.out.println("�� ��ü�� : " + set.size() );
		// 6. 
		for( String element : set ) { 
			// for( �ӽð�ü : set ){ } set��ü�� ��ҵ��� �ϳ��� �ӽð�ü ���� �ݺ�ó��   
			System.out.println("\t"+element);
		}
		// 7. 
		set.clear(); // set��ü�� ��ҵ� ��� ����[����]
		//8.
		if( set.isEmpty() ) { System.out.println("��� ����");}
		// ���࿡ set��ü�� ��� ������ true / false
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}




