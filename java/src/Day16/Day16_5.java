package Day16;

import java.util.HashMap;

public class Day16_5 {
	
	public static void main(String[] args) {
		
		// p.574
		// Map : Ű,�� => ��Ʈ��  
		// 1. Map ��ü ���� 
		HashMap<String, Integer> map = new HashMap<>();
			//  key   ,  value => ��Ʈ��
		// 2. ��ü�� map ���� 
		map.put( "�ſ��" , 85 ); //  Ű = "�ſ��"  // �� = 85
		System.out.println("Ȯ�� : " + map );
		map.put( "ȫ�浿" , 90 ); // Ű,�� => ��Ʈ�� �߰� 
		System.out.println("Ȯ�� : " + map );
		map.put( "���屺" , 80 ); // Ű,�� => ��Ʈ�� �߰� 
		System.out.println("Ȯ�� : " + map );
		map.put( "ȫ�浿" , 95 ); // Ű,�� => ��Ʈ�� �߰�
		System.out.println("Ȯ�� : " + map);
	}

}


















