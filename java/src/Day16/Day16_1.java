package Day16;

import java.util.ArrayList;

public class Day16_1 {
	
	public static void main(String[] args) {
		
	
		// p.556
			// �÷���[����] �����ӿ�ũ
			// �÷����� ��ü�� ����
			// �����ӿ�ũ�� ������� ���س��� ���̺귯��
		// p.560 : ArrayList Ŭ���� 
		// 1. ����Ʈ ��ü ���� 
		// 1. Arraylist : ����Ʈ Ŭ���� // 2. <���׸�> : ����Ʈ�� ���� Ŭ����  // 3. list : ��ü�� ( �ƹ��ų� ) // 4. new : ��ü������ �޸��Ҵ� // 5. ArrayList<>() : ������
		ArrayList<String> list = new ArrayList<>();
		// 2. ����Ʈ�� ��� �߰� [ ����Ʈ��ü��.add(��ü) : ����Ʈ�� ��ü �߰� ] 
		list.add("java");			System.out.println(" ����Ʈ�� ��ҵ� Ȯ��1 : "+ list );
		list.add("JDBC");			System.out.println(" ����Ʈ�� ��ҵ� Ȯ��2 : "+ list );
		list.add("Servlet/JSP");	System.out.println(" ����Ʈ�� ��ҵ� Ȯ��3 : "+ list);
		list.add( 2 , "Database"); 	System.out.println(" ����Ʈ�� ��ҵ� Ȯ��4 : "+ list );
		list.add("iBATIS");			System.out.println(" ����Ʈ�� ��ҵ� Ȯ��5 : "+ list );
		// 3. ����Ʈ�� ��ü �� [ ���� ] : .size()
		int size = list.size();		System.out.println(" ����Ʈ �ȿ� ����ִ� �� ��ü�� : "+size );
		// 4. ����Ʈ�� Ư�� �ε����� ��ü ȣ�� .get()
		String skill = list.get(2);	System.out.println(" ����Ʈ �ȿ� 2���ε��� ȣ�� : " + skill );
		// 5. ����Ʈ�� ��� �ε��� ȣ�� 
		for( int i = 0 ; i<list.size() ; i++ ) { // i�� 0���� ����Ʈ�Ǳ��� �� ���� 1�� �����ϸ� �ݺ�ó��
			String str = list.get(i); // ����Ʈ�� i��° �ε��� ȣ��
			System.out.println( i + " : " + str );
		}
		// 6. ����Ʈ�� Ư�� �ε����� ���� : .remove( �ε�����ȣ/��ü�� ) : �ش� �ε���/��ü ����
		System.out.println(" ����Ʈ �ȿ� ���� �� Ȯ�� : " + list );
		list.remove(2);	// 2�� �ε��� ���� [ ����Ʈ�� Database ���� ]
		System.out.println(" ����Ʈ �ȿ� 2���ε��� ���� �� Ȯ�� : " + list );
		list.remove(2); // 2�� �ε��� ���� [ ����Ʈ�� Servlet/jsp ���� ]
		System.out.println(" ����Ʈ �ȿ� 2���ε��� ���� �� Ȯ�� : " + list );
		list.remove("iBATIS");
		System.out.println(" ����Ʈ �ȿ� Ư�� �ε��� ���� �� Ȯ�� " + list );
		
	}

}












