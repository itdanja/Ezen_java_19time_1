package Day16;

import java.util.Vector;

public class Day16_2 {
	
	public static void main(String[] args) {
		
		//1.Vetor Ŭ������ ����Ʈ ��ü ���� 
			// ����Ʈ�� Board ��ü ���� 
		Vector<Board> list = new Vector<>();
		//2.����Ʈ�� �߰�
		list.add( new Board("����1","����1","�۾���1") );
		list.add( new Board("����2","����2","�۾���2") );
		list.add( new Board("����3","����3","�۾���3") );
		list.add( new Board("����4","����4","�۾���4") );
		list.add( new Board("����5","����5","�۾���5") );
			System.out.println(" Ȯ�� : "+list );
		//3.���
		System.out.println("��ȣ\t����\t����\t�ۼ���");
		
		for( int i = 0 ; i<list.size() ; i++ ) {
			// i(�ε���)�� 0 ���� ����Ʈ���� ������ 1������ �ݺ�ó�� 
			// ����Ʈ�� i��° �ε����� ��ü �ʵ� ȣ�� 
			System.out.println( i+"\t"+ list.get(i).���� +"\t" 
					+ list.get(i).����+"\t"
					+ list.get(i).�ۼ��� ) ;
		}
		
		
		
		
	}

}
